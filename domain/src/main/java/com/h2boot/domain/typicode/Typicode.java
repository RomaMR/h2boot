package com.h2boot.domain.typicode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Typicode {

    @Id
    @GeneratedValue
    private Long id;

    public Typicode() {
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}
