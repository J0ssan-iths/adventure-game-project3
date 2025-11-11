package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

public class ForestRoomTest {
    @Test
    public void enterRoomTest(){
        ForestRoom forestRoom = new ForestRoom();
        Player player = new Player.PlayerBuilder()
                .name("Josefine")
                .health(100)
                .score(0)
                .strength(10)
                .build();
        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("ja");

        forestRoom.enterRoom(player, fakeUI);

        Assertions.assertTrue(player.hasFoundKey());
    }
}
