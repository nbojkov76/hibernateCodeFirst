package _03.entities;

import javax.persistence.*;

@MappedSuperclass
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
@Column(name =  "first_name",nullable = false)
    private String firsName;
    @Column(name =  "last_name",nullable = false)
    private String lastName;
    @Column(name =  "phone_number", unique = true)
    private String phoneNumber;

    protected Person() {
    }

    protected Person(String firsName, String lastName, String phoneNumber) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
