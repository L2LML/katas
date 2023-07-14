package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class ElectionList {
    private List<Election> elections;
//    private String kind;

    public ElectionList() {
        this.elections = new ArrayList<>();
    }

    public List<Election> getElections() {
        return elections;
    }

    public void setElections(List<Election> elections) {
        this.elections = elections;
    }

//    public String getKind() {
//        return kind;
//    }
//
//    public void setKind(String kind) {
//        this.kind = kind;
//    }
}
