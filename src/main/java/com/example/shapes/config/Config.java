/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.example.shapes.config;

import com.example.shapes.services.dto.Circle;
import com.example.shapes.services.dto.Ellipse;
import com.example.shapes.services.dto.Kite;
import com.example.shapes.services.dto.Parallelogram;
import com.example.shapes.services.dto.Rectangle;
import com.example.shapes.services.dto.Rhombus;
import com.example.shapes.services.dto.ShapeRegistry;
import com.example.shapes.services.dto.Square;
import com.example.shapes.services.dto.Trapezium;
import com.example.shapes.services.dto.Triangle;
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
		registry.addShape("triangle", new Triangle());
		registry.addShape("parallelogram", new Parallelogram());
		registry.addShape("rectangle", new Rectangle());
		registry.addShape("square", new Square());
		registry.addShape("rhombus", new Rhombus());
		registry.addShape("kite", new Kite());
		registry.addShape("trapezium", new Trapezium());
		registry.addShape("ellipse", new Ellipse());
		registry.addShape("circle", new Circle());
		return registry;
	}
}
