package com.xworkz.moduleProject.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.moduleProject.dto.TempleDTO;
import com.xworkz.moduleProject.service.AppPropService;

@Component
@RequestMapping("/")
public class AppPropController {

	

		private Logger logger = Logger.getLogger(AppPropController.class);

		private List<TempleDTO> entryList;
		private List<TempleDTO> nopersonList;
		private List<TempleDTO> prasadaList;
		private List<TempleDTO> idList;
		private List<TempleDTO> poojaTypeList;

		@Autowired
		public AppPropService appPropertyService;

		public AppPropController() {
			logger.info("Created \t" + this.getClass().getSimpleName());
			// System.out.println("Created "+this.getClass().getSimpleName());
		}

		@PostConstruct
		public void init() {
			logger.info("Invoked init() method ");
			logger.info("Assign all the Type drop down");
			entryList = appPropertyService.validateAndFetchAllByType("SE");
			nopersonList = appPropertyService.validateAndFetchAllByType("NOP");
			prasadaList = appPropertyService.validateAndFetchAllByType("PRASAD");
			idList = appPropertyService.validateAndFetchAllByType("ID");
			poojaTypeList = appPropertyService.validateAndFetchAllByType("POOJA");
			logger.info("End of init() method");
		}

		@RequestMapping(value = "/register.odc")
		public String landingPage(Model model) {
			try {
				logger.info("Invoked landing Method with success.jsp");
				logger.info("Taking the values from the list");
				model.addAttribute("specialEntryList", entryList);
				logger.info("Special Entry Values " + entryList);
				model.addAttribute("noOfPersonList", nopersonList);
				logger.info("nO OF PEERSON values " + nopersonList);
				model.addAttribute("prasadaList", prasadaList);
				logger.info("Prasada Values " + prasadaList);
				model.addAttribute("idList", idList);
				logger.info("ID Values " + idList);
				model.addAttribute("poojaTypeList", poojaTypeList);
				logger.info("Pooja Values " + poojaTypeList);
				logger.info("Invoked landing page");
				return "Register";
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				e.printStackTrace();
			}
			logger.info("Passing the Value");

			return null;
		}

	}
	
	
	

