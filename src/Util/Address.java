package Util;

public class Address {

    private String roadName;
    private int HouseNumber;
    private String zipCode;
    private String district;
    private String city;
    private String state;
    private String country;

    public Address(String roadName, int houseNumber, String zipCode, String district, String city, String state, String country) {
        this.roadName = roadName;
        this.HouseNumber = houseNumber;
        this.zipCode = zipCode;
        this.district = district;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public int getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        HouseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
