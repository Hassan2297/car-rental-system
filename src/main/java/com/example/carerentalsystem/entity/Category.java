package com.example.carerentalsystem.entity;

import javax.persistence.*;

/**
 * @author Hassan Wael
 */
@Entity
@Table(name = Category.TABLE_NAME)
public class Category {

    static final String TABLE_NAME = "CATEGORY";

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    public Category() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
