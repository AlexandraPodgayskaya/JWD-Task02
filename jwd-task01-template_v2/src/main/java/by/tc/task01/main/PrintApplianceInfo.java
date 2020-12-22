package by.tc.task01.main;

import java.util.Iterator;
import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliance) {

		Iterator<Appliance> iterator = appliance.iterator();

		while (iterator.hasNext()) {

			String infoAppliance = iterator.next().toString();
			System.out.println(infoAppliance);

		}

		// you may add your own code here

	}
}
