package org.example.models;

public class Pessoa {
    private String name;
    private String doc;
    private String ender;

    public Pessoa(String ender, String doc, String name) {
        this.ender = ender;
        this.doc = doc;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }
}
