package by.tc.task01.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import by.tc.task01.builder.parser.ApplianceParser;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceFilter {

	public List<String> applianceData;

	public ApplianceFilter(List<String> applianceData) {
		this.applianceData = applianceData;
	}

	public List<String> filter(Criteria criteria) {

		List<String> filtredApplianceData = new ArrayList<String>();
		Iterator<String> iterator = applianceData.iterator();

		while (iterator.hasNext()) {
			String appliance = iterator.next();

			if (containsAllCriteriaAppliance(appliance, criteria.getCriteria())) {
				filtredApplianceData.add(appliance);
			}
		}

		return filtredApplianceData;
	}

	public boolean containsAllCriteriaAppliance(String appliance, Map<String, Object> criteriaApplianceData) {

		Map<String, String> optionApplianceDate = new HashMap<String, String>();
		final String TYPE_OPTION_SPLIT = " : ";
		String[] typeAndOptionAppliance = appliance.split(TYPE_OPTION_SPLIT);
		String optionAppliance = typeAndOptionAppliance[1];

		ApplianceParser applianceParser = new ApplianceParser();
		optionApplianceDate = applianceParser.parse(optionAppliance);

		Set<String> nameCriteria = criteriaApplianceData.keySet();
		int counter = 0;

		for (String name : nameCriteria) {

			String valueCriteria = criteriaApplianceData.get(name).toString();

			if (valueCriteria.equals(optionApplianceDate.get(name))) {
				counter++;
			}
		}

		return counter == criteriaApplianceData.size();
	}

}
