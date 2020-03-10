package domain;

import java.util.Date;

public class HeatMap {
    private int id ;
    private String name;
    private int confirm;
    private int confirm_today;
    private int cured;
    private int dead;
    private float longitude;
    private float latitude;
    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getConfirm_today() {
        return confirm_today;
    }

    public void setConfirm_today(int confirm_today) {
        this.confirm_today = confirm_today;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "HeatMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", confirm=" + confirm +
                ", confirm_today=" + confirm_today +
                ", cured=" + cured +
                ", dead=" + dead +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", time=" + time +
                '}';
    }
}
