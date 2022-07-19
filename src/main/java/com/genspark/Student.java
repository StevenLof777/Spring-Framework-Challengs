package com.genspark;

import java.util.List;

public class Student implements Print {
    private int id;
    private String name;
    private Address add;
    private List<Phone> ph;

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

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add=" + add +
                ", ph=" + ph +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
}
