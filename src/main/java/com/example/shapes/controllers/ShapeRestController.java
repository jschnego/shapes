/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes.controllers;

import com.example.shapes.services.ShapeService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author janschnegotzki
 */
@RestController
public class ShapeRestController {
	
	private final ShapeService shapeService;

	@Autowired
	public ShapeRestController(ShapeService shapeService){
		this.shapeService = shapeService;
	}

	@GetMapping("/requirements")
	public ResponseEntity<Map<String,List<String>>> getRequirements(){
		return ResponseEntity.ok().body(shapeService.getAllRequirements());
	}
}
