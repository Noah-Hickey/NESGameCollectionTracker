package com.noah.videogamecollection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GamesTesting {

    @Test
    @DisplayName("Test initial game catalog contains 5 games")
    void testInitialGameCatalogSize() {
        List<Games> catalog = MainMenu.getGameCatalog();
        assertEquals(5, catalog.size(), "Game catalog should contain 5 initial games");
    }


    @Test
    @DisplayName("Test that all initial games have valid IDs")
    void testInitialGamesHaveValidIds() {
        List<Games> catalog = MainMenu.getGameCatalog();

        for (Games game : catalog) {
            assertTrue(game.getId() > 0, "Game ID should be positive: " + game.getGameTitle());
        }
    }

    @Test
    @DisplayName("Test that Super Mario Bros. 3 is in the initial game catalog.")
    void testSuperMarioBros3() {
        List<Games> catalog = MainMenu.getGameCatalog();

        boolean foundSuperMarioBros3 = false;

        for (Games game : catalog) {
            if (("Super Mario Bros. 3").equals(game.getGameTitle())) {
                foundSuperMarioBros3 = true;
                assertEquals(1988, game.getReleaseYear());
                assertEquals("Platformer", game.getGameGenre());
                break;

            }
        }
        assertTrue(foundSuperMarioBros3, "Super Mario Bros should be in the initial catalog");
    }
}
