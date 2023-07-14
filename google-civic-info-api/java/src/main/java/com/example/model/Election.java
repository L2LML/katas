package com.example.model;

public class Election {
    int id;
    String name;
    String electionDay;
    String ocdDivisionId;

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

    public String getElectionDay() {
        return electionDay;
    }

    public void setElectionDay(String electionDay) {
        this.electionDay = electionDay;
    }

    public String getOcdDivisionId() {
        return ocdDivisionId;
    }

    public void setOcdDivisionId(String ocdDivisionId) {
        this.ocdDivisionId = ocdDivisionId;
    }
}
