package java_exercises_1_mz.oop;

public class Address {
    String street;
    String city;
    String country;
    int homeNo;
    int flatNo;

    Address(String street, String city, String country, int homeNo, int flatNo) {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet() {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        this.country = country;
    }

    public int getHomeNo(){
        return homeNo;
    }

    public void setHomeNo(){
        this.homeNo = homeNo;
    }

    public int getFlatNo(){
        return flatNo;
    }

    public void setFlatNo(){
        this.flatNo = flatNo;
    }

}
