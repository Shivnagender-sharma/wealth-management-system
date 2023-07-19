package com.demowealth.AssetsManagement.ServiceImpl;

import com.demowealth.AssetsManagement.entity.Assets;
import com.demowealth.AssetsManagement.repository.AssetsRepository;
import com.demowealth.AssetsManagement.service.AssetsService;
import com.demowealth.AssetsManagement.service.AssetsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestServiceImpl {

    @InjectMocks
    AssetsServiceImpl assetsServiceImpl;

    @Mock
    AssetsRepository assetsRepository;
    //@Autowired

    @Mock
    Assets assets;

//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }

//     @Test
//    public void getById(){
//         int id = 2;
//         Assets assets=new Assets(2,101,"debit card","get instant money");
//         ResponseEntity<Assets> responseEntity=new ResponseEntity<>(assets, HttpStatus.OK);
//         when(assetsServiceImpl.getById(id)).thenReturn(responseEntity);
//
//         // Act
//       //  ResponseEntity<Assets> responseEntity1 = assetsServiceImpl.getById(id);
//         assetsServiceImpl.getById(123);
//
//         // Assert
//         Assertions.assertEquals(responseEntity, responseEntity1);
//         verify(assetsServiceImpl, times(4)).getById(id);
//         assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
//         // Additional assertions can be made based on the expected behavior
//     }

     }

