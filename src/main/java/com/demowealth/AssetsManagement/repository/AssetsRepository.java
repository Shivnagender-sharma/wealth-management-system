package com.demowealth.AssetsManagement.repository;

import com.demowealth.AssetsManagement.entity.Assets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetsRepository  extends JpaRepository<Assets, Integer> {
}
