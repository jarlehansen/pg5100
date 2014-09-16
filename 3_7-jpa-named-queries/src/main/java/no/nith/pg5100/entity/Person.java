package no.nith.pg5100.entity;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "jpqlExample1", query = "SELECT p FROM Person p WHERE p.age >= 67"),
        @NamedQuery(name = "jpqlExample2", query = "SELECT p FROM Person p WHERE p.name like :name")
})
@NamedNativeQuery(name = "nativeQuery", query = "SELECT * FROM Person WHERE post_code=?", resultClass = Person.class)
public class Person {
    @Id
    private int id;

    private String name;

    @Column(name = "post_code")
    private String zip;

    private int age;

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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zip='" + zip + '\'' +
                ", age=" + age +
                '}';
    }
}
