package com.fabio.decktracker.service.endpoint;

import com.fabio.decktracker.entity.deck.Deck;
import com.fabio.decktracker.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/decks")
public class DeckEndpoint {
    private final DeckService deckService;

    @Autowired
    public DeckEndpoint(DeckService deckService) {
        this.deckService = deckService;
    }

    @GetMapping(value = "/all")
    public List getAllDecks() {
        return deckService.getAllDecks();
    }

    @GetMapping(value = "/{id}")
    public Optional<Deck> getDeckById(@PathVariable Long id) {
        return deckService.getDeckById(id);
    }

    @GetMapping(value = "/{name}")
    public Optional<Deck> getDeckByName(@PathVariable String name) {
        return deckService.getDeckByName(name);
    }
}
