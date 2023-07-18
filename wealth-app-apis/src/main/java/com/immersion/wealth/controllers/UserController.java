package com.immersion.wealth.controllers;

import com.immersion.wealth.payloads.ApiResponse;
import com.immersion.wealth.payloads.UserDto;
import com.immersion.wealth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService ;

    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){

        UserDto createUserDto = this.userService.createUser(userDto);
        return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);

    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable("userId") Integer userId){
        UserDto updatedUser = this.userService.updateUser(userDto, userId);
        return ResponseEntity.ok(updatedUser);

    }

    @DeleteMapping("/{userId}")
//	public ResponseEntity<?> deleteUser(@PathVariable("userId") Integer userId){

    public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer userId){

        this.userService.deleteUser(userId);
        // return  new ResponseEntity(Map.of("message" , "User deleted Successfully"),HttpStatus.OK);

        return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted Sucessfully", true), HttpStatus.OK);
    }


    @GetMapping("/")
    public ResponseEntity<List<UserDto>>getAllUser(){
        return ResponseEntity.ok(this.userService.getAllUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId ){
        return ResponseEntity.ok(this.userService.getUserById(userId));
    }



}
