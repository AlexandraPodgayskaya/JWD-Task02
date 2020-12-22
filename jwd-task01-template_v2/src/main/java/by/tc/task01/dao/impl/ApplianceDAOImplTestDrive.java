package by.tc.task01.dao.impl;

import java.io.IOException;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.main.PrintApplianceInfo;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class ApplianceDAOImplTestDrive {

	public static void main(String[] args) throws IOException {
		
		List <Appliance> applianceArray;
		
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		
		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 33);

		applianceArray = service.find(criteriaOven);
		
		PrintApplianceInfo.print(applianceArray);
						
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);
		
		applianceArray = service.find(criteriaTabletPC);
		
		PrintApplianceInfo.print(applianceArray); 

	    Criteria criteriaAppliance = new Criteria(null);
		criteriaAppliance.add(Laptop.MEMORY_ROM.toString(), 8000);

		applianceArray = service.find(criteriaAppliance);
		
		PrintApplianceInfo.print(applianceArray); 
	}

}
