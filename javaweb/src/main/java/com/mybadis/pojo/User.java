package com.mybadis.pojo;

import java.util.Date;

public class User {
    private Integer id;
    private String  name;
    private String  price;
    private Date createDate;

    public User() {
    }

    public User(Integer id, String name, String price, Date createDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
