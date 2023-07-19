package com.example.model;

import java.util.List;

/**
 * A political position elected to represent a division.
 */
public class Office {
    String name;
    String divisionId;
    List<String> levels;
    List<String> roles;
    //    List<???> sources;
    List<Integer> officialIndices;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId;
    }

    public List<String> getLevels() {
        return levels;
    }

    public void setLevels(List<String> levels) {
        this.levels = levels;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<Integer> getOfficialIndices() {
        return officialIndices;
    }

    public void setOfficialIndices(List<Integer> officialIndices) {
        this.officialIndices = officialIndices;
    }
}
