package com.immersion.wealth.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id ;

    @NotEmpty
    @Size(min=4, message = "Username must contain atleast 4 characters")
    private String name ;

    @Email(message = "Email address is not Valid !!")
    private String email;

    @NotEmpty(message= "Password must not be empty . Provide passowrd containing atleast three characters and atmost 10 characters")
    @Size(min= 3, max= 10,message = "Password must of atleast 3 characters and of atmost 10 characters")
    private String password;

    @NotEmpty
    private String about;


}
