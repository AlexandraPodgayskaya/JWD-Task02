package by.tc.task01.entity;

public class VacuumCleaner extends Appliance {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private String motorSpeedRegylation;
	private String cleaningWidth;
	
	public VacuumCleaner() {
		super();
		
	}

	public String getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(String powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public String getMotorSpeedRegylation() {
		return motorSpeedRegylation;
	}

	public void setMotorSpeedRegylation(String motorSpeedRegylation) {
		this.motorSpeedRegylation = motorSpeedRegylation;
	}

	public String getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(String cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + ((cleaningWidth == null) ? 0 : cleaningWidth.hashCode());
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + ((motorSpeedRegylation == null) ? 0 : motorSpeedRegylation.hashCode());
		result = prime * result + ((powerConsumption == null) ? 0 : powerConsumption.hashCode());
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth == null) {
			if (other.cleaningWidth != null)
				return false;
		} else if (!cleaningWidth.equals(other.cleaningWidth))
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeedRegylation == null) {
			if (other.motorSpeedRegylation != null)
				return false;
		} else if (!motorSpeedRegylation.equals(other.motorSpeedRegylation))
			return false;
		if (powerConsumption == null) {
			if (other.powerConsumption != null)
				return false;
		} else if (!powerConsumption.equals(other.powerConsumption))
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegylation=" + motorSpeedRegylation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}
	
	
	

}
