package domain;

import java.util.ArrayList;
import java.util.List;

/*新的省及城市数据格式*/
public class Cities2 {
    private String province;
    private int confirm;
    private int  cured;
    private int dead;
    private List<Cities2_1> cities;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

    public List<Cities2_1> getCities() {
        return cities;
    }

    public void setCities(List<Cities2_1> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Cities2{" +
                "province='" + province + '\'' +
                ", confirm=" + confirm +
                ", cured=" + cured +
                ", dead=" + dead +
                ", cities=" + cities +
                '}';
    }
}
