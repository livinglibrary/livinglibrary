package com.livinglibrary.vo;

import java.io.Serializable;

public class ResumeMenuVO implements Serializable {

    private static final long serialVersionUID = 4467511324357163792L;

    private Integer id;

    private String name;

    private Integer pid;

    private Integer title;

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

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
