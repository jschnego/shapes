/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes.db;

import com.example.shapes.db.entities.StoredShape;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author janschnegotzki
 */

@Repository
public interface ShapeDao extends CrudRepository<StoredShape, Long>{
	
	List<StoredShape> findAll();
}
