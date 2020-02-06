/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.controllers;

import com.example.shapes.db.entities.StoredShape;
import com.example.shapes.services.ShapeService;
import com.example.shapes.services.dto.Request;
import com.example.shapes.services.dto.ShapeInfo;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/shape-info")
	public ResponseEntity<ShapeInfo> getShapeInformation(@RequestBody Request request){
		try{
			return ResponseEntity.ok().body(shapeService.getInfo(request));
		} catch(IllegalArgumentException iae){
			return ResponseEntity.badRequest().build();
		}
	}
	
	@PostMapping("/shapes")
	public ResponseEntity<StoredShape> storeShape(@RequestBody Request request){
		try{
			return ResponseEntity.ok().body(shapeService.storeShape(request));
		} catch(IllegalArgumentException iae){
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping("/shapes")
	public ResponseEntity<List<StoredShape>> getShapes(){
		return ResponseEntity.ok().body(shapeService.getShapes());
	}
}
