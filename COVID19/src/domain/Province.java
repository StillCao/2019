package domain;

public class Province {
    private String name;
    private int confirm;
    private int cured;
    private int dead;

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

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", confirm=" + confirm +
                ", cured=" + cured +
                ", dead=" + dead +
                '}';
    }
}
