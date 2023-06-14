package com.fabio.decktracker.runner;

import com.fabio.decktracker.entity.deck.Deck;
import com.fabio.decktracker.entity.deck.Format;
import com.fabio.decktracker.repository.DeckRepository;
import com.fabio.decktracker.service.DeckService;
import com.fabio.decktracker.endpoint.DeckEndpoint;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Initialization {
    private final DeckRepository deckRepository;

    public Initialization(DeckRepository deckRepository) {
        this.deckRepository = deckRepository;
    }


    @Bean
    ApplicationRunner applicationRunner() {
        return args -> {
            Deck redDeckWins = new Deck("Red Deck Wins", Format.PAUPER);
            Deck lathril = new Deck("Golgari Lathril Elves", Format.COMMANDER);
            Deck soldiers = new Deck("Azorius Soldiers", Format.STANDARD)
            DeckService service = new DeckService(deckRepository);
            DeckEndpoint endpoint = new DeckEndpoint(service);

            deckRepository.save(redDeckWins);
            deckRepository.save(lathril);
            System.out.println(redDeckWins.getName());
            System.out.println(lathril.getName());
            System.out.println(endpoint.getAllDecks());
        };
    }
}
