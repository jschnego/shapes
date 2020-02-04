/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.services.dto;

import java.util.Arrays;

/**
 *
 * @author janschnegotzki
 */
public class CircleData extends EllipseData{
	
	public CircleData(Double radius){
		super(radius, radius);
	}
	
	public CircleData(){
		this(1.0);
	}
	
}
