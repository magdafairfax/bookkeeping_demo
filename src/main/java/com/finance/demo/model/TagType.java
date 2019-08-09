package com.finance.demo.model;


import javax.persistence.*;

@Entity
@Table(name="TAGTYPE")
public class TagType {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(name="description")
    private String description;

    @Column(name="tagtype")
    private String tagtype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTagType() {
        return tagtype;
    }

    public void setTagType(String tagtype) {
        this.tagtype = tagtype;
    }

    @Override
    public String toString() {
        return "TagType{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", tagtype='" + tagtype + '\'' +
                '}';
    }
}
