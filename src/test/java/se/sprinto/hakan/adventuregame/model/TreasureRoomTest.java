package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

public class TreasureRoomTest {
    @Test
    public void enterRoomTest(){
        TreasureRoom treasureRoom = new TreasureRoom();
        Player player = new Player.PlayerBuilder()
                .name("Josefine")
                .health(100)
                .score(0)
                .strength(10)
                .build();
        player.setFoundKey(true);

        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("ja");

        treasureRoom.enterRoom(player, fakeUI);
        Assertions.assertTrue(player.hasOpenedChest());
    }
}
