package day36_Inheritance.planetTask;

public class Earth extends Planet {

    private int  earthYearDays;
    private String satellite;
    private boolean hasAtmosphere;

    public Earth(String name, double mass, double volume, double radius, double surfaceGravity, double surfaceArea, boolean population, int earthYearDays) {
        super(name, mass, volume, radius, surfaceGravity, surfaceArea, population);
        setEarthYearDays(earthYearDays);
        setSatellite(satellite);
        setHasAtmosphere(hasAtmosphere);
    }

    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }

    public void setHasAtmosphere(boolean hasAtmosphere) {
        this.hasAtmosphere = hasAtmosphere;
    }

    public String getSatellite() {
        return satellite;
    }

    public void setSatellite(String satellite) {
        this.satellite = satellite;
    }

    public int getEarthYearDays() {
        return earthYearDays;
    }

    public void setEarthYearDays(int earthYearDays) {
        this.earthYearDays = earthYearDays;
    }



}
