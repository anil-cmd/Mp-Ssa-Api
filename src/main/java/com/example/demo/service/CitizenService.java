package com.example.demo.service;

import com.example.demo.binding.CitizenRequest;
import com.example.demo.binding.CitizenResponse;

public interface CitizenService {
	
	public CitizenResponse getState(CitizenRequest citizenRequest);

}
