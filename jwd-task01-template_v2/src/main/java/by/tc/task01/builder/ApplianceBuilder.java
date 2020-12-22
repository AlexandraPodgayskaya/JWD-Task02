package by.tc.task01.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import by.tc.task01.builder.parser.ApplianceParser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.factory.ApplianceFactory;

public class ApplianceBuilder {

	public List<Appliance> build(List<String> filtredApplianceData) {

		List<Appliance> appliances = new ArrayList<Appliance>();
		
		ApplianceParser applianceParser = new ApplianceParser();
		Map<String, String> valueOptionAppliance = new HashMap<String, String>();
		ApplianceFactory applianceFactory = new ApplianceFactory();
		
		Appliance appliance;
		final String TYPE_OPTION_SPLIT = " : ";

		Iterator<String> iterator = filtredApplianceData.iterator();
		String applianceData = null;

		while (iterator.hasNext()) {

			applianceData = iterator.next();

			String[] typeAndOptionAppliance = applianceData.split(TYPE_OPTION_SPLIT);
			String typeAppliance = typeAndOptionAppliance[0];
			String optionAppliance = typeAndOptionAppliance[1];

			valueOptionAppliance = applianceParser.parse(optionAppliance);
			appliance = applianceFactory.createAppliance(typeAppliance, valueOptionAppliance);
			appliances.add(appliance);

		}
		return appliances;
	}
}
