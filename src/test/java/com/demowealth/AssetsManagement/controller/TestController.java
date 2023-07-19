package com.demowealth.AssetsManagement.controller;

import com.demowealth.AssetsManagement.entity.Assets;
import com.demowealth.AssetsManagement.service.AssetsServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestController {
    @InjectMocks
    AssetManagementController assetManagementController;
    @Mock
    AssetsServiceImpl assetsServiceImpl;
    @Test
    public void testlinkAssets(){

        Assets assets=new Assets(2,101,"debit card","get instant money");
        ResponseEntity<Assets> responseEntity=new ResponseEntity<>(assets, HttpStatus.OK);
        Mockito.when(assetsServiceImpl.linkAssets(Mockito.any())).thenReturn(responseEntity);

        ResponseEntity<Assets> responseEntity1=assetManagementController.linkAssets(assets);

//        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(1);
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }
    @Test
    public void viewAll(){
//        (Arrays.asList(assets1, assets2))
        Assets assets1=new Assets(2,101,"debit card","get instant money");
        Assets assets2=new Assets(3,102,"3bhk villa","luxury flat");
        Assets assets3=new Assets(4,103,"Gold","preety jewellery");
        Assets assets4=new Assets(5,104,"4bhk villa","spacious flat with garden and swimming pool");
        Assets assets5=new Assets(6,105,"Land","3-acers");
        Assets assets=new Assets();
//
        ResponseEntity<Assets> responseEntity=new ResponseEntity<>(assets, HttpStatus.OK);
        Mockito.when(assetsServiceImpl.linkAssets(Mockito.any())).thenReturn(responseEntity);

        ResponseEntity<Assets> responseEntity1=assetManagementController.linkAssets(assets);

//        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(1);
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void testgetById(){

       Assets assets=new Assets(3,102,"3bhk villa","luxury flat");
        ResponseEntity<Assets> responseEntity=new ResponseEntity<>(assets, HttpStatus.OK);
        Mockito.when(assetsServiceImpl.getById(Mockito.any())).thenReturn(responseEntity);

        ResponseEntity<Assets> responseEntity1=assetManagementController.findByAssetsId(assets.getAssetId());
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

//@Test
//public void testdeleteById() throws Exception {
//    Assets assets=new Assets(3,102,"3bhk villa","luxury flat");
//    ResponseEntity<Assets> responseEntity=new ResponseEntity<>(assets, HttpStatus.OK);
//    Mockito.when(assetsServiceImpl.deleteById();
//
//    ResponseEntity<Assets> responseEntity1=assetManagementController.deleteById(assets.getAssetId());
//    assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
//}
//@Test
//public void givenIdTODeleteThenShouldDeleteTheProduct(){
//    when(assetsServiceImpl.delete(product1.getId())).thenReturn(product1);
////assertThat(productService.);
//    verify(productRepository,times(1)).findAll();

//    @Test
//    public void deleteById() {
//        // Mock the required data
//        long id = 1L;
//
//        // Mock the service method
//        deleteById().when(assetsServiceImpl).deleteById(id);
//
//        // Call the controller method
//        ResponseEntity<Void> response = assetManagementController.deleteById(Integer);
//
//        // Verify the service method is called
//        verify(assetsServiceImpl, times(1)).deleteById(id);
//
//        // Check the response status code
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//    }



}



