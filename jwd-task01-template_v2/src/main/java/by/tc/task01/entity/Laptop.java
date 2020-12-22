package by.tc.task01.entity;

public class Laptop extends Appliance {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String batteryCapacity;
	private String os;
	private String memoryRom;
	private String systemMemory;
	private String cpu;
	private String displayInchs;
	
	public Laptop() {
		super();
		
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(String memoryRom) {
		this.memoryRom = memoryRom;
	}

	public String getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(String systemMemory) {
		this.systemMemory = systemMemory;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(String displayInches) {
		this.displayInchs = displayInches;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batteryCapacity == null) ? 0 : batteryCapacity.hashCode());
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((displayInchs == null) ? 0 : displayInchs.hashCode());
		result = prime * result + ((memoryRom == null) ? 0 : memoryRom.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + ((systemMemory == null) ? 0 : systemMemory.hashCode());
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
		Laptop other = (Laptop) obj;
		if (batteryCapacity == null) {
			if (other.batteryCapacity != null)
				return false;
		} else if (!batteryCapacity.equals(other.batteryCapacity))
			return false;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (displayInchs == null) {
			if (other.displayInchs != null)
				return false;
		} else if (!displayInchs.equals(other.displayInchs))
			return false;
		if (memoryRom == null) {
			if (other.memoryRom != null)
				return false;
		} else if (!memoryRom.equals(other.memoryRom))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (systemMemory == null) {
			if (other.systemMemory != null)
				return false;
		} else if (!systemMemory.equals(other.systemMemory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", os=" + os + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInches=" + displayInchs + "]";
	}	

}
