package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.CitizenRequest;
import com.example.demo.binding.CitizenResponse;
import com.example.demo.service.CitizenService;


@RestController
public class CitizenController {
	
	@Autowired
	private CitizenService citizenService;
	
	@PostMapping("/get-state")
	public ResponseEntity<CitizenResponse> getStateName(@RequestBody CitizenRequest citizenRequest) {
		CitizenResponse response = citizenService.getState(citizenRequest);
		if(response.getStateName()!=null) {
			return new ResponseEntity<CitizenResponse>(response, HttpStatus.OK);
		}else {
			return new ResponseEntity<CitizenResponse>(response, HttpStatus.BAD_REQUEST);
		}
		
	}

}
