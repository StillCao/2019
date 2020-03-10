package domain;

import java.util.Date;

public class Country {

    private Date time;
    private int confirm_sum;
    private int confirm_today;
    private  int suspect_sum;
    private  int suspect_today;
    private int cured_sum;
    private  int cured_today;
    private int dead_sum;
    private  int dead_today;
    private  int id;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getConfirm_sum() {
        return confirm_sum;
    }

    public void setConfirm_sum(int confirm_sum) {
        this.confirm_sum = confirm_sum;
    }

    public int getConfirm_today() {
        return confirm_today;
    }

    public void setConfirm_today(int confirm_today) {
        this.confirm_today = confirm_today;
    }

    public int getSuspect_sum() {
        return suspect_sum;
    }

    public void setSuspect_sum(int suspect_sum) {
        this.suspect_sum = suspect_sum;
    }

    public int getSuspect_today() {
        return suspect_today;
    }

    public void setSuspect_today(int suspect_today) {
        this.suspect_today = suspect_today;
    }

    public int getCured_sum() {
        return cured_sum;
    }

    public void setCured_sum(int cured_sum) {
        this.cured_sum = cured_sum;
    }

    public int getCured_today() {
        return cured_today;
    }

    public void setCured_today(int cured_today) {
        this.cured_today = cured_today;
    }

    public int getDead_sum() {
        return dead_sum;
    }

    public void setDead_sum(int dead_sum) {
        this.dead_sum = dead_sum;
    }

    public int getDead_today() {
        return dead_today;
    }

    public void setDead_today(int dead_today) {
        this.dead_today = dead_today;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Country{" +
                "time=" + time +
                ", confirm_sum=" + confirm_sum +
                ", confirm_today=" + confirm_today +
                ", suspect_sum=" + suspect_sum +
                ", suspect_today=" + suspect_today +
                ", cured_sum=" + cured_sum +
                ", cured_today=" + cured_today +
                ", dead_sum=" + dead_sum +
                ", dead_today=" + dead_today +
                ", id=" + id +
                '}';
    }
}

