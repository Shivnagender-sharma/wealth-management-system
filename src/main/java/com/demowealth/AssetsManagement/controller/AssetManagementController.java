package com.demowealth.AssetsManagement.controller;

import com.demowealth.AssetsManagement.entity.Assets;
import com.demowealth.AssetsManagement.repository.AssetsRepository;
import com.demowealth.AssetsManagement.service.AssetsService;
import com.demowealth.AssetsManagement.service.AssetsServiceImpl;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assets")
@Slf4j
public class AssetManagementController {

 private static final Logger LOGGER= LoggerFactory.getLogger(AssetManagementController.class);

    @Autowired
    AssetsServiceImpl assetsServiceImpl;


    @PostMapping("/linksasset")
    public ResponseEntity<Assets> linkAssets(@RequestBody Assets asset) {
      LOGGER.info("Save Assets",asset);

        return assetsServiceImpl.linkAssets(asset);
    }


    @GetMapping
    public ResponseEntity<List<Assets>> viewAll() {
        LOGGER.info("View All Assets");
        return assetsServiceImpl.viewAll();
    }

    @GetMapping("/{assetId}")
    public ResponseEntity<Assets> findByAssetsId(@PathVariable Integer assetId) {
       LOGGER.info("Find Assets: id={}",assetId);
        return assetsServiceImpl.getById(assetId);
    }

    @DeleteMapping("delete/{assetId}")

    public void deleteById(@PathVariable Integer assetId){
       LOGGER.info("Delete Asset: id={}",assetId);
        assetsServiceImpl.deleteById(assetId);
    }



}
