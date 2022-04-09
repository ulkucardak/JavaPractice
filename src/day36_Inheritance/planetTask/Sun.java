package day36_Inheritance.planetTask;

public class Sun {

    private String name;
    private String type;
    private boolean isPlanet;
    private long mass, volume;
    private long radius;

    public Sun(String name, String type, boolean isPlanet, long mass, long volume, long radius) {
        setName(name);
        setType(type);
        setPlanet(isPlanet);
        setMass(mass);
        setVolume(volume);
        setRadius(radius);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPlanet() {
        return isPlanet;
    }

    public void setPlanet(boolean planet) {
        isPlanet = planet;
    }

    public long getMass() {
        return mass;
    }

    public void setMass(long mass) {
        this.mass = mass;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Sun{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isPlanet=" + isPlanet +
                ", mass=" + mass +
                ", volume=" + volume +
                ", radius=" + radius +
                '}';
    }
}
