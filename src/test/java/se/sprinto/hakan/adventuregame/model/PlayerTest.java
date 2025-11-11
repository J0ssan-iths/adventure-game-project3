package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void attackTest(){
        Enemy enemy = new Enemy("Fairy", 30, 0, 3);
        Player player = new Player.PlayerBuilder()
                .name("Josefine")
                .health(100)
                .score(0)
                .strength(10)
                .build();

        player.attack(enemy);

        Assertions.assertEquals(20, enemy.getHealth());

    }
}
