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
}
