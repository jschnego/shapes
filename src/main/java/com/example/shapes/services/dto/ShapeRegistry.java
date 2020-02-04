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
	
	private Map<String, Shape> shapes = new HashMap<String, Shape>();

	public void addShape(String name, Shape shape){
	this.shapes.put(name, shape);
	}

	public Shape getShape(String name){
		return this.shapes.get(name);
	}

	public Map<String,Shape> getShapes(){
		return this.shapes;
	}

}
