public class Player extends Character {
    private Profession profession;

    public Player(String name, int level, int experience, int gold,
                     int maxHealthPoints, int healthPoints, int damage, Profession profession) {
        super(name, level, experience, gold, maxHealthPoints, healthPoints, damage);
        this.profession = profession;

    }

    private Profession getProfession() {
        return profession;
    }
}
