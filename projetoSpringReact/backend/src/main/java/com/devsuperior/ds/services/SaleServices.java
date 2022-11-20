package com.devsuperior.ds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.ds.entities.Sale;
import com.devsuperior.ds.repositories.SaleRepository;


@Service
public class SaleServices {
  
	@Autowired
	private SaleRepository repository;  
	
	public List<Sale> findSales() {		 
		 return repository.findAll();
	 }
}
