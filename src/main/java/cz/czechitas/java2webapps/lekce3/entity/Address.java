package cz.czechitas.java2webapps.lekce3.entity;

// BOD 13
// ukolem je pridat dresu, stejny postup jako u predchoziho prikladu
public class Address {
    private String street;
    private String city;
    private String zipCode;

    // vytvorim prazdny konstruktor
    public Address() {
    }
    // vygeneruju konstruktor
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }


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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
