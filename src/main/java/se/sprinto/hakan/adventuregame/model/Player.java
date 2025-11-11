package se.sprinto.hakan.adventuregame.model;

public class Player extends AbstractCharacter {
    private boolean foundKey;
    private boolean defeatedEnemy;
    private boolean openedChest;

    private Player(PlayerBuilder builder){
        super(builder.name, builder.health, builder.score, builder.strength);
    }

    public static class PlayerBuilder {
        private String name;
        private int health;
        private int score;
        private int strength;

        public PlayerBuilder name(String name){
            this.name = name;
            return this;
        }
        public PlayerBuilder health(int health){
            this.health = health;
            return this;
        }
        public PlayerBuilder score(int score){
            this.score = score;
            return this;
        }
        public PlayerBuilder strength(int strength){
            this.strength = strength;
            return this;
        }

        public Player build(){
            return new Player(this);
        }
    }

    public Player(String name, int health, int score, int strength) {
        super(name, health, score, strength);
    }

    public boolean hasFoundKey() {
        return foundKey;
    }

    public void setFoundKey(boolean foundKey) {
        this.foundKey = foundKey;
    }

    public boolean hasDefeatedEnemy() {
        return defeatedEnemy;
    }


    public void setDefeatedEnemy(boolean defeatedEnemy) {
        this.defeatedEnemy = defeatedEnemy;
    }

    public boolean hasOpenedChest() {
        return openedChest;
    }

    public void setOpenedChest(boolean openedChest) {
        this.openedChest = openedChest;
    }

    public boolean hasWon() {
        return foundKey && defeatedEnemy && openedChest;
    }

    @Override
    public void attack(AbstractCharacter target) {
        target.setHealth(target.getHealth() - this.getStrength());

        if (!target.isAlive()) {
            addScore(50);
        }
    }
}
