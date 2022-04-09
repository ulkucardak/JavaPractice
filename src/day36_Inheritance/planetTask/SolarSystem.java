package day36_Inheritance.planetTask;

public class SolarSystem {

    public Sun sun;
    public Earth earth;
    public Mercury mercury;
    public Venus venus;

    public SolarSystem(Sun sun, Earth earth, Mercury mercury, Venus venus) {
        this.sun = sun;
        this.earth = earth;
        this.mercury = mercury;
        this.venus = venus;
    }

    public String toString() {
        return "SolarSystem{" +
                "sun=" + sun +
                ", earth=" + earth +
                ", mercury=" + mercury +
                ", venus=" + venus +
                '}';
    }
}



