package by.tc.task01.service.validation;

import java.util.Iterator;
import java.util.Set;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		if (criteria == null) {
			return false;
		}

		if (criteria.getGroupSearchName() != null) {
			Set<String> namesOption = criteria.getCriteria().keySet();
			Iterator<String> iterator = namesOption.iterator();

			while (iterator.hasNext()) {

				String applianceOption = iterator.next();

				if (!contains(applianceOption, criteria.getGroupSearchName())) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean contains(String applianceOption, String typeAppliance) {

		switch (typeAppliance) {

		case "Oven":

			for (Oven option : Oven.values()) {
				if (option.name().equals(applianceOption)) {
					return true;
				}
			}
			break;

		case "Laptop":

			for (Laptop option : Laptop.values()) {
				if (option.name().equals(applianceOption)) {
					return true;
				}
			}
			break;

		case "Refrigerator":

			for (Refrigerator option : Refrigerator.values()) {
				if (option.name().equals(applianceOption)) {
					return true;
				}
			}
			break;

		case "VacuumCleaner":

			for (VacuumCleaner option : VacuumCleaner.values()) {
				if (option.name().equals(applianceOption)) {
					return true;
				}
			}
			break;

		case "TabletPC":

			for (TabletPC option : TabletPC.values()) {
				if (option.name().equals(applianceOption)) {
					return true;
				}
			}
			break;

		case "Speakers":

			for (Speakers option : Speakers.values()) {
				if (option.name().equals(applianceOption)) {
					return true;
				}
			}
			break;

		}

		return false;

	}
}
//you may add your own new classes