package by.tc.task01.entity;

public class Refrigerator extends Appliance {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String powerConsumption;
	private String weight;
	private String freezerCapacity;
	private String overallCapacity;
	private String height;
	private String width;
	
	public Refrigerator() {
		super();
		
	}

	public String getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(String powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(String freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public String getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(String overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((freezerCapacity == null) ? 0 : freezerCapacity.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((overallCapacity == null) ? 0 : overallCapacity.hashCode());
		result = prime * result + ((powerConsumption == null) ? 0 : powerConsumption.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
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
		Refrigerator other = (Refrigerator) obj;
		if (freezerCapacity == null) {
			if (other.freezerCapacity != null)
				return false;
		} else if (!freezerCapacity.equals(other.freezerCapacity))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (overallCapacity == null) {
			if (other.overallCapacity != null)
				return false;
		} else if (!overallCapacity.equals(other.overallCapacity))
			return false;
		if (powerConsumption == null) {
			if (other.powerConsumption != null)
				return false;
		} else if (!powerConsumption.equals(other.powerConsumption))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}
	
	
}
