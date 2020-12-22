package by.tc.task01.dao.impl;

import java.io.IOException;
import java.util.List;

import by.tc.task01.builder.ApplianceBuilder;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.filter.ApplianceFilter;
import by.tc.task01.reader.impl.ApplianceReader;

public class ApplianceDAOImpl implements ApplianceDAO {
	
	public List<Appliance> find(Criteria criteria) throws IOException {
		
		ApplianceReader applianceReader = new ApplianceReader("resources/appliances_db.txt");
		List <String> applianceData;
		
		if (criteria.getGroupSearchName()==null) {
			applianceData = applianceReader.takeAll();	
		} else {
			applianceData = applianceReader.take(criteria.getGroupSearchName());
		}
		
		ApplianceFilter applianceFilter = new ApplianceFilter (applianceData);
		List <String> filtredApplianceData = applianceFilter.filter (criteria);
		
		ApplianceBuilder applianceBuilder = new ApplianceBuilder();
		List <Appliance> appliances = applianceBuilder.build(filtredApplianceData);
		

		return appliances;
		
	}

}