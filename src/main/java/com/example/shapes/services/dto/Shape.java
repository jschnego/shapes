/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.services.dto;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author janschnegotzki
 */

public abstract class Shape {
	
	public List<String> getRequirements() {
		List<String> args = new ArrayList<String>();
		for (Parameter param : this.getClass().getConstructors()[0].getParameters()) {
			args.add(param.getName());
		}
		return args;
	}
	
	public List<String> getHierarchy() {
		List<String> hierarchy = new ArrayList<String>();
		Class clazz = this.getClass();
		while(clazz.getSuperclass() != null) {
			hierarchy.add(0, clazz.getSimpleName());
			clazz = clazz.getSuperclass();
		}
		return hierarchy;
	}
	
	public abstract Double computeArea();

	public abstract Shape withParameters(Map<String, Double> parameters);
	
}
