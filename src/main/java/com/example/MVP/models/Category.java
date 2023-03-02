package com.example.MVP.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends AbstractBase{

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Record> records = new ArrayList<>();

    private Type type;

    public Category(){ }

    public Category(List<Record> records, Type type){
        super();
        this.records = records;
        this.type = type;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
