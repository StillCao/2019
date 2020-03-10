package domain;

public class Province_Today {
    private String province;
    private String time;
    private int confirm;
    private int cured;
    private int dead;
    private int confirm_today;
    private int cured_today;
    private int dead_today;

    public Province_Today() {
    }

    public Province_Today(String province, String time, int confirm, int cured, int dead, int confirm_today, int cured_today, int dead_today) {
        this.province = province;
        this.time = time;
        this.confirm = confirm;
        this.cured = cured;
        this.dead = dead;
        this.confirm_today = confirm_today;
        this.cured_today = cured_today;
        this.dead_today = dead_today;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public int getConfirm_today() {
        return confirm_today;
    }

    public void setConfirm_today(int confirm_today) {
        this.confirm_today = confirm_today;
    }

    public int getCured_today() {
        return cured_today;
    }

    public void setCured_today(int cured_today) {
        this.cured_today = cured_today;
    }

    public int getDead_today() {
        return dead_today;
    }

    public void setDead_today(int dead_today) {
        this.dead_today = dead_today;
    }

    @Override
    public String toString() {
        return "Province_Today{" +
                "province='" + province + '\'' +
                ", time='" + time + '\'' +
                ", confirm=" + confirm +
                ", cured=" + cured +
                ", dead=" + dead +
                ", confirm_today=" + confirm_today +
                ", cured_today=" + cured_today +
                ", dead_today=" + dead_today +
                '}';
    }
}
