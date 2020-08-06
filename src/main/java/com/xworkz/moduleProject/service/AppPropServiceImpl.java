package com.xworkz.moduleProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.moduleProject.dao.AppPropDao;
import com.xworkz.moduleProject.dto.TempleDTO;
import com.xworkz.moduleProject.entity.TempleEntity;
@Service
public class AppPropServiceImpl implements AppPropService {
	@Autowired
	private AppPropDao dao;
	private static final Logger logger = Logger.getLogger(AppPropServiceImpl.class);

	public AppPropServiceImpl() {
		logger.info("Created \t" + this.getClass().getSimpleName());
	}

	@Override
	public List<TempleDTO> validateAndFetchAllByType(String type) {
		logger.info("Start: validateAndFetchAllByType ");

		try {

			List<TempleEntity> fetchedEntity = dao.fetchAllByType(type);

			if (Objects.nonNull(fetchedEntity)) {
				logger.info("List is found and its size is : " + fetchedEntity.size());
				List<TempleDTO> list = new ArrayList<TempleDTO>();
				for (TempleEntity fetch : fetchedEntity) {
					TempleDTO dto = new TempleDTO();
					logger.info("Copying data from dto to entity");
					BeanUtils.copyProperties(fetch, dto);
					list.add(dto);
					logger.info("Adding all the dto's to list" + list);

				}
				return list;
			} else {
				logger.info("Any List found in the Entity");
				return null;
			}
		} catch (Exception e) {
			logger.error("Exception in validateAndFetchAllByType " + e.getMessage());
			e.printStackTrace();
		}
		logger.info("End: validateAndFetchAllByType ");
		return null;
	}
}
