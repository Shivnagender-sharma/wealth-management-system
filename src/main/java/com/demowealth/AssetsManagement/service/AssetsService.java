package com.demowealth.AssetsManagement.service;

import com.demowealth.AssetsManagement.entity.Assets;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AssetsService {



    ResponseEntity <Assets> linkAssets(Assets assets);
    ResponseEntity<Assets> getById(Integer assetId);
    ResponseEntity<List<Assets>> viewAll();
    public void deleteById(Integer Assets);
//    Assets updateAssets(Integer assetId);

}
