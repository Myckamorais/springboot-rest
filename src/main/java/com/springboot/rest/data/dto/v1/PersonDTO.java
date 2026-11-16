package com.springboot.rest.data.dto.v1;

import java.io.Serializable;
import java.util.Objects;

public class PersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public PersonDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(getId(), personDTO.getId()) && Objects.equals(getFirstName(), personDTO.getFirstName()) && Objects.equals(getLastName(), personDTO.getLastName()) && Objects.equals(getPhoneNumber(), personDTO.getPhoneNumber()) && Objects.equals(getAddress(), personDTO.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getPhoneNumber(), getAddress());
    }
}
