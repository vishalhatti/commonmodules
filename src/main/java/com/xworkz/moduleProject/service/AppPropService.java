package com.xworkz.moduleProject.service;

import java.util.List;

import com.xworkz.moduleProject.dto.TempleDTO;

public interface AppPropService {
	public List<TempleDTO> validateAndFetchAllByType(String type);
}
