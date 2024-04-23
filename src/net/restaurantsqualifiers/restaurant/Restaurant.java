package net.restaurantsqualifiers.restaurant;



public class Restaurant {
    protected String name;
    protected String location;
    protected String schedule;
    protected float rate;

    public Restaurant(String name, String location, String schedule, float rate) {
        this.name = name;
        this.location = location;
        this.schedule = schedule;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "\n======================================================\n" + "= " + name + " = \n"
                + " - Localizacion: "
                + location + "\n - Horario : " + schedule + "\n - Puntuacion: " + rate
                + "\n ======================================================";
    }

}
