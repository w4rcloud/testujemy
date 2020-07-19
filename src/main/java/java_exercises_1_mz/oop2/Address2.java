package java_exercises_1_mz.oop2;

public class Address2 {

    private String street;
    private String city;
    private String country;
    private Integer flatNo;
    private Integer homeNo;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(Integer flatNo) {
        this.flatNo = flatNo;
    }

    public Integer getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(Integer homeNo) {
        this.homeNo = homeNo;
    }

    public Address2(String street, String city, String country, Integer flatNo, Integer homeNo){
        this.city = city;
        this.street = street;
        this.country = country;
        this.flatNo = flatNo;
        this.homeNo = homeNo;



    }
}
