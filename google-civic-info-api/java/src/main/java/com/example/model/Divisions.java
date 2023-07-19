package com.example.model;

import java.util.Map;

/**
 * Contains a list of {@link Division divisions}.
 */
public class Divisions {
    Map<String, Division> divisions;

    public Map<String, Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(Map<String, Division> divisions) {
        this.divisions = divisions;
    }
}
