package by.tc.task01.reader.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.reader.ApplianceCommonReader;

public class ApplianceReader implements ApplianceCommonReader {

	public final File file;

	public ApplianceReader(String pathFile) {
		file = new File(pathFile);
	}

	public List<String> take(String nameGroupAppliance) throws IOException {

		if (file == null) {
			throw new FileNotFoundException();
		}

		BufferedReader reader = new BufferedReader(new FileReader(file));
		List<String> applianceData = new ArrayList<String>();
		String appliance = null;

		while ((appliance = reader.readLine()) != null) {
			if (appliance.contains(nameGroupAppliance)) {
				applianceData.add(appliance);
			}
		}

		reader.close();
		return applianceData;
	}

	public List<String> takeAll() throws IOException {

		if (file == null) {
			throw new FileNotFoundException();
		}

		BufferedReader reader = new BufferedReader(new FileReader(file));
		List<String> applianceData = new ArrayList<String>();
		String appliance = null;

		while ((appliance = reader.readLine()) != null) {
			if (!appliance.isEmpty()) {
				applianceData.add(appliance);
			}
		}

		reader.close();
		return applianceData;
	}
}
