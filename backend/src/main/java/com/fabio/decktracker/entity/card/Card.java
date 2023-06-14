package com.fabio.decktracker.entity.card;

import jakarta.persistence.*;

@Entity
@Table(name = "card")
public abstract class Card {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int manaCost;
    private CardType cardType;
    private String expansion;
}
