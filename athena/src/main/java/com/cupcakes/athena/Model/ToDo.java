package com.cupcakes.athena.Model;

public class ToDo {
    private long id;
    private String userName;
    private String desc;

    public ToDo(long id, String userName, String desc) {
        this.id = id;
        this.userName = userName;
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
