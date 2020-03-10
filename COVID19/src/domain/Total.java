package domain;

public class Total {
    private int confirm_sum;
    private int cured_sum;
    private int dead_sum;

    public int getConfirm_sum() {
        return confirm_sum;
    }

    public void setConfirm_sum(int confirm_sum) {
        this.confirm_sum = confirm_sum;
    }

    public int getCured_sum() {
        return cured_sum;
    }

    public void setCured_sum(int cured_sum) {
        this.cured_sum = cured_sum;
    }

    public int getDead_sum() {
        return dead_sum;
    }

    public void setDead_sum(int dead_sum) {
        this.dead_sum = dead_sum;
    }

    @Override
    public String toString() {
        return "Total{" +
                "confirm_sum=" + confirm_sum +
                ", cured_sum=" + cured_sum +
                ", dead_sum=" + dead_sum +
                '}';
    }
}
