package com.fabio.decktracker.entity.deck;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "deck")
public class Deck {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Format format;

    public Deck(String name, Format format) {
        this.name = name;
        this.format = format;
    }

    public Deck() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }
}
