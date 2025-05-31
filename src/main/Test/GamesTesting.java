package Test;

import com.noah.videogamecollection.Games;
import java.util.ArrayList;
import java.util.List;


public class GamesTesting {
    @Test
    @DisplayName("Test initial game catalog contains 5 games")
    void testInitialGameCatalogSize() {
        List<Games> catalog = MainMenu.getGameCatalog();
        assertEquals(5, catalog.size(), "Game catalog should contain 5 initial games");
    }
}
