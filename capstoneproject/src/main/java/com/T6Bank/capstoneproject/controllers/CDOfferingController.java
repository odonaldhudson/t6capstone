package com.T6Bank.capstoneproject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.T6Bank.capstoneproject.models.CDOffering;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CDOfferingController {
	
List<CDOffering> cdOfferings = new ArrayList<CDOffering>();
	
	@PostMapping(value ="/CDOfferings")
	@ResponseStatus(HttpStatus.CREATED)
	public CDOffering addCdOffering(@RequestBody CDOffering cdOffering) {
		cdOfferings.add(cdOffering);
		return cdOffering;
		
	}
	
	@GetMapping(value ="/CDOfferings")
	@ResponseStatus(HttpStatus.OK)
	public List<CDOffering> getCdOffering() {
		return cdOfferings;
		
	}
}
