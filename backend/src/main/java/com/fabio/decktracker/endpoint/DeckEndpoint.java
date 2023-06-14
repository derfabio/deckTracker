package com.fabio.decktracker.endpoint;

import com.fabio.decktracker.entity.deck.Deck;
import com.fabio.decktracker.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
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
        System.out.println(deckService.getAllDecks()+"from the endpoint");
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
