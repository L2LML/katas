package com.example.model;

import java.util.List;

/**
 * An official is a person presently serving in an office.
 */
public class Official {
    String name;
    List<Address> address;
    String party;
    List<String> phones;
    List<String> urls;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    private class Address {
        String locationName;
        String line1;
        String line2;
        String line3;
        String city;
        String state;
        String zip;
    }
}
