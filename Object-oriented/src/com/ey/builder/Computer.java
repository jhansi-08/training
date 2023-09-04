package com.ey.builder;

public class Computer {
	private String cpu;
	private int ram;
	private int hdd;
	private String gpu;
	private int ssd;

	public Computer(ComputerBuilder builder) {
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.gpu = builder.gpu;
		this.ssd = builder.ssd;
	}


	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd + "," + " gpu=" + gpu + ", ssd=" + ssd + "]";
	}

	// Inner Builder class
	public static class ComputerBuilder {
       
    	 private String cpu;
    	 private int ram;
    	 private int hdd;
    	 private String gpu;
    	 private int ssd;
		
    	 public ComputerBuilder(String cpu, int ram, int hdd) {
			this.cpu = cpu;
			this.ram = ram;
			this.hdd = hdd;
		}
    	 
    	 
    	 
    	 public ComputerBuilder setGpu(String gpu) {
			this.gpu = gpu;
			return this;
		}



		public ComputerBuilder setSsd(int ssd) {
			this.ssd = ssd;
			return this;
		}

		public Computer build() {
             return new Computer(this);
         } 
	}   	 

}
