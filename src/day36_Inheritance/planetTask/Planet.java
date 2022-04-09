package day36_Inheritance.planetTask;

public class Planet {
    private String name;
    private double mass, volume;
    private double radius;
    private double surfaceGravity, surfaceArea;
    private boolean population;

    public Planet(String name, double mass, double volume, double radius, double surfaceGravity, double surfaceArea, boolean population) {
        setName(name);
        setMass(mass);
        setVolume(volume);
        setRadius(radius);
        setSurfaceGravity(surfaceGravity);
        setSurfaceArea(surfaceArea);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(double surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public boolean isPopulation() {
        return population;
    }

    public void setPopulation(boolean population) {
        this.population = population;
    }


    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", volume=" + volume +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", population=" + population +
                '}';
    }
}
/*
Planet Task:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			methods:
				setInfo()
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google
 */