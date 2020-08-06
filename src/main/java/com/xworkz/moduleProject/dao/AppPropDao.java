package com.xworkz.moduleProject.dao;

import java.util.List;


import com.xworkz.moduleProject.entity.TempleEntity;

public interface AppPropDao {

	public List<TempleEntity>fetchAllByType(String type);

	
	
}
