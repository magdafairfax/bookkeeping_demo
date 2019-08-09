package com.finance.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="TRANSACTIONS")
public class Transactions {
    @Id
    private String id;

    @OneToMany(mappedBy="transactions",cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Set<Tags> tags = new HashSet<>();

    @Column(name="transaction_Date")
    private Date date;

    @Column(name="amount")
    private double amount;

    @Column(name="frequency")
    private Frequency freq;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<Tags> getTags() {
        return tags;
    }

    public void setTags(Set<Tags> tags) {
        this.tags = tags;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Frequency getFreq() {
        return freq;
    }

    public void setFreq(Frequency freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "id='" + id + '\'' +
                ", tags=" + tags +
                ", date=" + date +
                ", amount=" + amount +
                ", freq=" + freq +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transactions)) return false;
        Transactions that = (Transactions) o;
        return Double.compare(that.amount, amount) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(date, that.date) &&
                freq == that.freq;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, amount, freq);
    }
}
