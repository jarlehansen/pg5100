package no.nith.pg5100.entity;

import javax.persistence.*;

@Entity
@SecondaryTable(name = "address")
public class Person {
    @Id
    private int id;

    private String name;
    private int age;

    @Column(table = "address")
    private String street;

    @Column(table = "address")
    private String zip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
