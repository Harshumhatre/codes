package com.technoch.hasa;

public class Processor {
String brand;
int core;
double clcokspeed;
public Processor(String brand, int core, double clcokspeed) {
	super();
	this.brand = brand;
	this.core = core;
	this.clcokspeed = clcokspeed;
}
@Override
public String toString() {
	return "Processor [brand=" + brand + ", core=" + core + ", clcokspeed=" + clcokspeed + "]";
}

}
