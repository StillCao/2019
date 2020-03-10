package domain;

public class Coordinates {
    private float longitude;
    private float latitude;
    private int people;

    public Coordinates() {
    }

    public Coordinates(float longitude, float latitude, int people) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.people = people;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", people=" + people +
                '}';
    }
}
