package com.ipoca.my.shop.domain;

import java.io.Serializable;
import java.util.Date;

public class TbContentCategory implements Serializable {
    private Long id;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private Boolean isParent;
    private Date created;
    private Date updated;
    private TbContentCategory parent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getParent() {
        return isParent;
    }

    public void setParent(TbContentCategory parent) {
        this.parent = parent;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
