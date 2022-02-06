package com.cupcakes.athena.Model;

import java.util.Objects;

public class ToDo {
    private long id;
    private String userName;
    private String description;

    public ToDo(long id, String userName, String description) {
        this.id = id;
        this.userName = userName;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDo)) return false;
        ToDo toDo = (ToDo) o;
        return getId() == toDo.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
