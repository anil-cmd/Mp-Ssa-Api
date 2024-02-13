package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.CitizenRequest;
import com.example.demo.binding.CitizenResponse;

@Service
public class CitizenServiceImpl implements CitizenService{
	
	@Override
	public CitizenResponse getState(CitizenRequest citizenRequest) {
		
		CitizenResponse response = new CitizenResponse();
		
		if(citizenRequest != null) {
			if(citizenRequest.getSsn().charAt(0) == '1') {
				  response.setSsn(citizenRequest.getSsn());
				  response.setStateName("New Jersey");
				  return response;
			}
			if(citizenRequest.getSsn().charAt(0) == '2') {
				  response.setSsn(citizenRequest.getSsn());
				  response.setStateName("California");
				  return response;
			}
			if(citizenRequest.getSsn().charAt(0) == '3') {
				  response.setSsn(citizenRequest.getSsn());
				  response.setStateName("Texas");
				  return response;
			}
			if(citizenRequest.getSsn().charAt(0) == '4') {
				  response.setSsn(citizenRequest.getSsn());
				  response.setStateName("Rhode Island");
				  return response;
			}
			if(citizenRequest.getSsn().charAt(0) == '5') {
				  response.setSsn(citizenRequest.getSsn());
				  response.setStateName("Alaska");
				  return response;
			}
			if(citizenRequest.getSsn().charAt(0) == '6') {
				  response.setSsn(citizenRequest.getSsn());
				  response.setStateName("Hawaii");
				  return response;
			}
			if(citizenRequest.getSsn().charAt(0) == '7') {
				  response.setSsn(citizenRequest.getSsn());
				  response.setStateName("Virginia");
				  return response;
			}
			if(citizenRequest.getSsn().charAt(0) == '8') {
				  response.setSsn(citizenRequest.getSsn());
				  response.setStateName("Ohio");
				  return response;
			}
			if(citizenRequest.getSsn().charAt(0) == '9') {
				  response.setSsn(citizenRequest.getSsn());
				  response.setStateName("Georgia");
				  return response;
			}
		}
		return response;
	}
}

