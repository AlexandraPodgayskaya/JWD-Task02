package by.tc.task01.builder.parser;

import java.util.HashMap;
import java.util.Map;

public class ApplianceParser {
	
	public Map <String, String> parse (String optionAppliance) {
		
		Map <String, String> valueOptionAppliance = new HashMap <String, String>();
		final String OPTION_SPLIT = ", ";
		final String NAME_VALUE_OPTION_SPLIT = "=";
		String[] optionsAppliance = optionAppliance.split(OPTION_SPLIT);

		for (String option : optionsAppliance) {
			String[] nameAndValueOption = option.split(NAME_VALUE_OPTION_SPLIT);
			String nameOption = nameAndValueOption[0];
			String valueOption = nameAndValueOption[1];
			valueOptionAppliance.put(nameOption, valueOption);
		}
		
		return valueOptionAppliance;
		
	}

}
