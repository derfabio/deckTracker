package com.fabio.decktracker.repository;

import com.fabio.decktracker.entity.deck.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Long> {
    Optional<Deck> findDeckByName(String name);

    Optional<Deck> findDeckById(Long id);


}
