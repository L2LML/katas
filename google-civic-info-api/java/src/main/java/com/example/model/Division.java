package com.example.model;

import java.util.List;

/**
 * Political geographic divisions, like a country, state, country, or legislative district.
 */
public class Division {
    String name;
    String[] alsoKnownAs;
    List<Integer> officeIndicies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(String[] alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    public List<Integer> getOfficeIndicies() {
        return officeIndicies;
    }

    public void setOfficeIndicies(List<Integer> officeIndicies) {
        this.officeIndicies = officeIndicies;
    }
}
