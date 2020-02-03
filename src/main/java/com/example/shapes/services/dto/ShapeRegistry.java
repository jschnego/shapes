/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes.services.dto;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author janschnegotzki
 */
public class ShapeRegistry {
	
	private Map<String, ShapeData> shapes = new HashMap<String, ShapeData>();

	public void addShape(String name, ShapeData shape){
	this.shapes.put(name, shape);
	}

	public ShapeData getShape(String name){
		return this.shapes.get(name);
	}

	public Map<String,ShapeData> getShapes(){
		return this.shapes;
	}

}
