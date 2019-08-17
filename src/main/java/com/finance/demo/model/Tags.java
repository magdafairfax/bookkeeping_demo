package com.finance.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="TAGS")
public class Tags {

    @Id
    @GeneratedValue
    private Long id;

    @JsonBackReference  // add this to prevent Jackson (json) infinite recursion problem
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="transactionId", referencedColumnName = "id" ,updatable = false,insertable = false)
    private Transactions transactions;

    @Column(name="transactionId")
    private String transactionId;

    @Column(name="tagtype_Id")
    private Long tagtypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Long getTagTypeId() {
        return tagtypeId;
    }

    public void setTagId(Long tagtypeId) {
        this.tagtypeId = tagtypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tags)) return false;
        Tags tags = (Tags) o;
        return Objects.equals(id, tags.id) &&
                Objects.equals(transactions, tags.transactions) &&
                Objects.equals(transactionId, tags.transactionId) &&
                Objects.equals(tagtypeId, tags.tagtypeId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, transactions, transactionId, tagtypeId);
    }
}
