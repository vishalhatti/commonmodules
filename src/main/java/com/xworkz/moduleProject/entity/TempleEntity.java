package com.xworkz.moduleProject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
@Table(name="app_prop_table")
public class TempleEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int appId;
	@Column(name="prop_name")
	private String name;
	@Column(name="prop_value")
	private String value; 
	@Column(name="prop_type")
	private String type;
	
	private static final Logger LOGGER = Logger.getLogger(TempleEntity.class);
	
	public TempleEntity() {
	LOGGER.info("invoked default constructor of templedto");		
	}
	
	
	
	public int getAppId() {
		return appId;
	}



	public void setAppId(int appId) {
		this.appId = appId;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "TempleDTO [appId=" + appId  + ", name=" + name + ", value=" + value + ", type=" + type + "]";
	}
	
}
