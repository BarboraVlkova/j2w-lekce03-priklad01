package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;

// BOD 4
public class Person {
    // PROPERTY je stale givenName, ale ukladam to do fieldu krestniJmeno
    // PROPERTY vystavuju navenek (rozhrani tridy), krestniJmeno je moje pojmenovani (uvnitr)
    private String krestniJmeno;
    private String surname;
    private LocalDate birthDate;


    // BOD 7
    // vytvorim si druhy konstruktor
public Person(){

}
    public Person(String givenName, String surname, LocalDate birthDate) {
        this.krestniJmeno = givenName;
        this.surname = surname;
        this.birthDate = birthDate;
        // BOD 12
        // vymazu vek, settery a nastavim metodu pro vypocet (bod 12)
    }

    // BOD 5
    // vygenerujeme dvojici metod (SETERY a GETERY)
    // nazev metody je JAVA Beam
    public String getGivenName() {
        return krestniJmeno;
    }

    public void setGivenName(String givenName) {
        this.krestniJmeno = givenName;
    }


    // GET a SET se nazyva PROPERTY
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // BOD 12
    public int getAge() {
        Period period = birthDate.until(LocalDate.now());
        return period.getYears();
    }



}
