package day36_Inheritance.planetTask;

public class SolarSystemObjects {
    public static void main(String[] args) {

        Sun sun = new Sun("Sun", "star", false, 1988920000L, 14120000000L,695500 );
        Earth earth = new Earth("Earth",300000000,123456777,230000,300000,200000,true, 365);
        Mercury mercury = new Mercury("Mercury", 2000000, 100000000, 300000, 388899999, 100000, false);
        Venus venus = new Venus("Venus", 1000000, 250000, 14567000, 456000, 345000, false);

        SolarSystem solarSystem = new SolarSystem(sun,earth, mercury,venus);

        System.out.println(solarSystem.sun);
        System.out.println(solarSystem.earth);
        System.out.println(solarSystem.mercury);
        System.out.println(solarSystem.venus);
    }
}
