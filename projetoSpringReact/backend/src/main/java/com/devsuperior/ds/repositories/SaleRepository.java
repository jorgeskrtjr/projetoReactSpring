package com.devsuperior.ds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ds.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
   
}
