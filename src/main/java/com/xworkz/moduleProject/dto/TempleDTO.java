package com.xworkz.moduleProject.dto;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class TempleDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int appId;
	private String name;
	private String value;
	private String type;

	private static final Logger LOGGER = Logger.getLogger(TempleDTO.class);

	public TempleDTO() {
		LOGGER.info("created\t" + this.getClass().getSimpleName());
	}

	public TempleDTO(int appId, String name, String value, String type) {
		LOGGER.info("invoked parameterized contructor in TempleDTO class");
		this.appId = appId;
		this.name = name;
		this.value = value;
		this.type = type;
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
		return "TempleDTO [appId=" + appId + ", name=" + name + ", value=" + value + ", type=" + type + "]";
	}

}
