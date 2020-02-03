/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.config;

import com.example.shapes.services.dto.CircleData;
import com.example.shapes.services.dto.EllipseData;
import com.example.shapes.services.dto.KiteData;
import com.example.shapes.services.dto.QuadrilateralData;
import com.example.shapes.services.dto.RectangleData;
import com.example.shapes.services.dto.RhombusData;
import com.example.shapes.services.dto.ShapeRegistry;
import com.example.shapes.services.dto.SquareData;
import com.example.shapes.services.dto.TrapeziumData;
import com.example.shapes.services.dto.TriangleData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author janschnegotzki
 */
@Configuration
public class Config {
	
	@Bean
	public ShapeRegistry registry(){
		ShapeRegistry registry = new ShapeRegistry();
		registry.addShape("triangle", new TriangleData());
		registry.addShape("quadrilateral", new QuadrilateralData());
		registry.addShape("parallelogram", nÏew ParallelogramData());
		registry.addShape("rectangle", new RectangleData());
		registry.addShape("square", new SquareData());
		registry.addShape("rhombus", new RhombusData());
		registry.addShape("kite", new KiteData());
		registry.addShape("trapezium", new TrapeziumData());
		registry.addShape("ellipse", new EllipseData());
		registry.addShape("circle", new CircleData());
		
		return registry;
	}
}
