/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.services;

import com.example.shapes.db.ShapeDao;
import com.example.shapes.db.entities.StoredShape;
import com.example.shapes.services.dto.Request;
import com.example.shapes.services.dto.Shape;
import com.example.shapes.services.dto.ShapeInfo;
import com.example.shapes.services.dto.ShapeRegistry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author janschnegotzki
 */

@Service
public class ShapeService {
	
	private final ShapeRegistry registry;
	private final ShapeDao shapeDao;
	
	@Autowired
	public ShapeService(ShapeRegistry registry, ShapeDao shapeDao){
		this.registry = registry;
		this.shapeDao = shapeDao;
	}
	
	public Map<String, List<String>> getAllRequirements(){
		Map<String,List<String>> requirements = new HashMap<>();
		for(String shape : registry.getShapes().keySet()){
			requirements.put(shape, registry.getShape(shape).getRequirements());
		}
		return requirements;
	}

	public List<String> getHierarchy(String shapeName){
		return registry.getShape(shapeName).getHierarchy();
	}

	public Shape getShape(String name){
		return registry.getShape(name);
	}

	public ShapeInfo getInfo(Request request){
		ShapeInfo info = new ShapeInfo();
		Shape shape = registry.getShape(request.getName()).withParameters(request.getParameters());

		info.setArea(shape.computeArea());
		info.setName(request.getName());
		info.setHierarchy(shape.getHierarchy());
		info.setParameters(request.getParameters());

		return info;
	}

	public StoredShape storeShape(Request request){
		StoredShape shape = new StoredShape();

		shape.setUuid(UUID.randomUUID().toString());
		shape.setName(request.getName());
		shape.setProperties(request.getParameters());
		
		StoredShape saved = shapeDao.save(shape);
		saved.setId(null);

		return saved;
	
	} 

	public List<StoredShape> getShapes(){
		return shapeDao.findAll().stream().map(shape -> {shape.setId(null); return shape;}).collect(Collectors.toList());
	}
	
}
