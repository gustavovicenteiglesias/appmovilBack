package com.unsada.appmovil.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.unsada.appmovil.model.Clase;
import com.unsada.appmovil.service.ClaseApi;

@RestController
@RequestMapping(value = "/api/clase")
@CrossOrigin("*")
public class ClaseController {
	@Autowired
	ClaseApi claseapi;
	
	@GetMapping(value = "/all")
	public Map<String, Object> listclase() {

		HashMap<String, Object> response = new HashMap<String, Object>();

		try {
			List<Clase> claseData;
			claseData = (List<Clase>) claseapi.findAll();
			response.put("message", "Successful load");
			response.put("data",claseData);
			response.put("success", true);
			return response;

		} catch (Exception e) {
			response.put("message", e.getMessage());
			response.put("success ", false);
			return response;
		}

	}

}
