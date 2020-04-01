package com.finance.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Component")
public class Component {
    @Id
    private String id;

    @Column(name="value_one")
    private int value_one;

    @Column(name="value_two")
    private int value_two;

    @Column(name="value_three")
    private double value_three;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getValue_one() {
        return value_one;
    }

    public void setValue_one(int value_one) {
        this.value_one = value_one;
    }

    public int getValue_two() {
        return value_two;
    }

    public void setValue_two(int value_two) {
        this.value_two = value_two;
    }

    public double getValue_three() {
        return value_three;
    }

    public void setValue_three(double value_three) {
        this.value_three = value_three;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id='" + id + '\'' +
                ", value_one=" + value_one +
                ", value_two=" + value_two +
                ", value_three=" + value_three +
                '}';
    }
}
