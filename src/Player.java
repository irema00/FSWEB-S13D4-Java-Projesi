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
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }
}
