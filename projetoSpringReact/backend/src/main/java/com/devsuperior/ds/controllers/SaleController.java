package com.devsuperior.ds.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.ds.entities.Sale;
import com.devsuperior.ds.services.SaleServices;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
	@Autowired
	private SaleServices service; 
	
	@GetMapping
	public List<Sale> findSales(){
		return service.findSales(); 
  }
	
}