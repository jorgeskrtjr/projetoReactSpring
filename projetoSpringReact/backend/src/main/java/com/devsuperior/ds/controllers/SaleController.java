package com.devsuperior.ds.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.ds.entities.Sale;
import com.devsuperior.ds.services.SaleServices;
import com.devsuperior.ds.services.SmService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
	@Autowired
	private SaleServices service; 
	@Autowired
	private SmService smsService;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue = "")String minDate, 
			@RequestParam(value="maxDate", defaultValue = "")String maxDate, 
			Pageable pageable ){
		return service.findSales(minDate, maxDate, pageable); 
  } 
	
	@GetMapping("/{id}/notification")
	public void notifySms(@PathVariable Long id) {
		
		smsService.sendSms(id);
	}
	
	 
}