package com.appress.domain;

import jakarta.persistence.*;

@Entity
public class Vote {
    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private OptionResponse option;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OptionResponse getOption() {
        return option;
    }

    public void setOption(OptionResponse option) {
        this.option = option;
    }
}
