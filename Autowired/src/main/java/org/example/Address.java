package org.example;

public class Address {

    private String hname;
    private String city;
    private String state;
    public Address(){

    }

    @Override
    public String toString() {
        return "Address{" +
                "hname='" + hname + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
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

    public Address(String hname, String city, String state) {
        this.hname = hname;
        this.city = city;
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
