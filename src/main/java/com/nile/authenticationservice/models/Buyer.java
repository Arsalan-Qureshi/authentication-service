package com.nile.authenticationservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import java.util.UUID;

@Document
public class Buyer {
    @Id
    private UUID id;
    @Field
    private String name;
    @Field
    private String userName;
    @Field
    private String address;
    @Field
    private String contactInformation;
    @Field
    private String email;
    @Field
    private String password;
    @Field
    private String country;
    @Field
    private String creditCard;
    @Field
    private Boolean isActive;

    public Buyer() {

    }

    public Buyer(UUID id, String name, String userName, String address, String contactInformation, String email,
                 String password, String country, String creditCard, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.contactInformation = contactInformation;
        this.email = email;
        this.password = password;
        this.country = country;
        this.creditCard = creditCard;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
