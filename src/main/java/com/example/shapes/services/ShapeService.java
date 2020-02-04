/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.services;

import com.example.shapes.services.dto.ShapeRegistry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author janschnegotzki
 */

@Service
public class ShapeService {
	
	private final ShapeRegistry registry;
	
	@Autowired
	public ShapeService(ShapeRegistry registry){
		this.registry = registry;
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
}
