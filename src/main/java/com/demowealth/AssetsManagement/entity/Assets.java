package com.demowealth.AssetsManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ASSET_TBL")
public class Assets {
    @Id
    @GeneratedValue

    private int assetId;

    private int userId;


    private String assetName;

    private String description;




//    public int getAssetId() {
//        return assetId;
//    }
//
//    public void setAssetId(int assetId) {
//        this.assetId = assetId;
//    }
//
//    public String getAssetName() {
//        return assetName;
//    }
//
//    public void setAssetName(String assetName) {
//        this.assetName = assetName;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }

}
