package com.wilsondev.rest_spring.models;

import jakarta.persistence.*;

import java.util.Date;

//@MappedSuperclass : nos indica que sera una clase madre
@MappedSuperclass
public class BaseEntity {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private  long id;

    @Column(columnDefinition = "DATETIME", name = "createDate",updatable = false, nullable = false)
    private Date createDate;
    @Column(columnDefinition = "DATETIME", name = "updateDate",updatable = false, nullable = false)
    private Date updateDate;

    //@PrePersist : Antes de crear algo va a realizar algo
    @PrePersist
    protected  void onCreate() {
        updateDate = new Date();
        if(createDate == null){
            createDate = new Date();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


}
