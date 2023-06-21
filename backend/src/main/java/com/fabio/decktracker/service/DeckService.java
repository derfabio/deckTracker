package com.fabio.decktracker.service;

import com.fabio.decktracker.entity.deck.Deck;
import com.fabio.decktracker.repository.DeckRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeckService {
    private final DeckRepository deckRepository;

    public DeckService(DeckRepository deckRepository) {
        this.deckRepository = deckRepository;
    }

    public List<Deck> getAllDecks() {
        System.out.println(deckRepository.findAll()+"from the service");
        return deckRepository.findAll();
    }

    public Optional<Deck> getDeckByName(String name) {
        return deckRepository.findDeckByName(name);
    }

    public Optional<Deck> getDeckById(Long id) {
        return deckRepository.findDeckById(id);
    }

    public void saveDeck(Deck deck) {
        deckRepository.save(deck);
    }
}
