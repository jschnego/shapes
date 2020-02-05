/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.shapes.db.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

/**
 *
 * @author janschnegotzki
 */

@Entity
@Table(name = "shapes")
@JsonInclude(Include.NON_NULL)
public class StoredShape {
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "uuid")
	private String uuid;

	@Column(name = "name")
	private String name;

	@ElementCollection
	@CollectionTable(name = "properties", joinColumns = @JoinColumn(name = "shape_id"))
	@Column(name = "value")
	@MapKeyColumn(name = "property")
	private Map<String, Double> properties;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Map<String, Double> getProperties() {
		return properties;
	}

	public String getUuid() {
		return uuid;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProperties(Map<String, Double> properties) {
		this.properties = properties;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


}
