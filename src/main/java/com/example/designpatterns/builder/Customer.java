package com.example.designpatterns.builder;

import java.util.Date;

public class Customer {
    private int id;
    private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String postal;
    private String mobileNumber;
    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostal() {
        return postal;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Customer(CustomerBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.addressLine1 = builder.addressLine1;
        this.city = builder.city;
        this.state = builder.state;
        this.postal = builder.postal;
        this.mobileNumber = builder.mobileNumber;
        this.dateOfBirth = builder.dateOfBirth;
    }

    static class CustomerBuilder{
        private int id;
        private String name;
        private String addressLine1;
        private String city;
        private String state;
        private String postal;
        private String mobileNumber;
        private Date dateOfBirth;

        public CustomerBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder setName(String name) {
            this.name = name;
            return  this;
        }

        public CustomerBuilder setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public CustomerBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public CustomerBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public CustomerBuilder setPostal(String postal) {
            this.postal = postal;
            return this;
        }

        public CustomerBuilder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public CustomerBuilder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postal='" + postal + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
