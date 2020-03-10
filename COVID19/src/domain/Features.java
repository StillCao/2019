package domain;

public class Features {
    private String type;
    private Coordinates coordinates;

    public Features(String type, Coordinates coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public Features() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Features{" +
                "type='" + type + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
