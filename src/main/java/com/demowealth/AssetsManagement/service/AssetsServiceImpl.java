package com.demowealth.AssetsManagement.service;

import com.demowealth.AssetsManagement.entity.Assets;
import com.demowealth.AssetsManagement.repository.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class AssetsServiceImpl implements AssetsService{
    @Autowired
    private AssetsRepository assetsRepository;


    @Override
    public ResponseEntity<Assets> linkAssets(Assets assets) {
        ResponseEntity responseEntity=new ResponseEntity(assetsRepository.save(assets),HttpStatus.OK);
        return null;
    }

    @Override
    public ResponseEntity<Assets> getById(Integer assetId) {
        ResponseEntity responseEntity = new ResponseEntity(assetsRepository.getById(assetId), HttpStatus.OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<Assets>> viewAll() {
        ResponseEntity responseEntity = new ResponseEntity(assetsRepository.findAll(), HttpStatus.OK);
        return responseEntity;

    }

    @Override
    public void deleteById(Integer assetsId) {

        assetsRepository.deleteById(assetsId);
    }

//    @Override
//    public Assets updateAssets(Integer assetId) {
//        return assetsRepository.save(assetId);
//    }
}
