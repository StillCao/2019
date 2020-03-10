package domain;
/*新的省及城市数据格式*/
public class Cities2_1 {
    private String name;
    private int confirm;
    private int  cured;
    private int dead;
    private int latitude;
    private int longitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConfirm() {
        return confirm;
    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

    public int getCured() {
        return cured;
    }

    public void setCured(int cured) {
        this.cured = cured;
    }

    public int getDead() {
        return dead;
    }

    public void setDead(int dead) {
        this.dead = dead;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Cities2_1{" +
                "name='" + name + '\'' +
                ", confirm=" + confirm +
                ", cured=" + cured +
                ", dead=" + dead +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
