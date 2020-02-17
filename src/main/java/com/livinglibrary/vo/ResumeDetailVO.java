package com.livinglibrary.vo;

import java.io.Serializable;

/**
 * 简历明细VO类
 */
public class ResumeDetailVO implements Serializable {

    private static final long serialVersionUID = 4549781114470446431L;

    private Integer id;

    private Integer listId;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
