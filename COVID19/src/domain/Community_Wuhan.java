package domain;

public class Community_Wuhan {
   private String district;
   private int confirm;
   private int suspect;
   private float longitude;
   private float latitude;
   private String full_address;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getConfirm() {
        return confirm;
    }

    public void setConfirm(int confirm) {
        this.confirm = confirm;
    }

    public int getSuspect() {
        return suspect;
    }

    public void setSuspect(int suspect) {
        this.suspect = suspect;
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

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    @Override
    public String toString() {
        return "Community_Wuhan{" +
                "district='" + district + '\'' +
                ", confirm=" + confirm +
                ", suspect=" + suspect +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", full_address='" + full_address + '\'' +
                '}';
    }
}
