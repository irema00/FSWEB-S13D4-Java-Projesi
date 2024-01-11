public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public enum Weapon {
        LAGER,
        AXE,
        SWORD,
        MACE,
        DAGGER
    }

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else this.healthPercentage = Math.max(healthPercentage, 0);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public void loseHealth(int damage) {
        if (this.healthPercentage > 0) {
            this.healthPercentage -= damage;
        } else {
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        this.healthPercentage += healthPotion;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }
}
