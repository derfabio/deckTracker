package com.fabio.decktracker.entity.card;

import com.fabio.decktracker.entity.deck.Format;
import jakarta.persistence.*;

import java.util.Set;

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
    private Format format;
    private Set<CardColor> colors;
    private Rarity rarity;
}
