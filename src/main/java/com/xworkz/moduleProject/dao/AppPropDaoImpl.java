package com.xworkz.moduleProject.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.moduleProject.entity.TempleEntity;


@Repository
public class AppPropDaoImpl implements AppPropDao{

	private static final Logger LOGGER = Logger.getLogger(AppPropDaoImpl.class);
	
	@Autowired
	private SessionFactory factory;
	

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	
	
	@Override
	public List<TempleEntity> fetchAllByType(String type) {
		LOGGER.info("Start : DAOImpl");
		LOGGER.info("Invoked fetchByType() method from DAOImpl");
		Session session=factory.openSession();
		try {
			String selectQuery="select temple from TempleEntity temple where type=:type";
			Query query=session.createQuery(selectQuery);
			query.setString("type", type);
			List<TempleEntity> list=query.list();
			LOGGER.info("End : DAOImpl");
			return list;
		}catch (Exception e) {
			LOGGER.error("Something went wrong in DAOImpl",e);
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
		


	
}
