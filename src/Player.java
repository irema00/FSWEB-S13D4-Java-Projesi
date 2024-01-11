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
}
