import java.util.Objects;

public abstract class Character {
    private String name;
    private int level;
    private int experience;
    private int gold;
    private int maxHealthPoints;
    private int healthPoints;
    private int damage;

    public Character() {

    }

    public Character(String name, int level, int experience, int gold,
                     int maxHealthPoints, int healthPoints, int damage) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.gold = gold;
        this.maxHealthPoints = maxHealthPoints;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        level++;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void addExperience(int experience) {
        this.experience = this.experience + experience;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeHit(int damage) {
        this.healthPoints = healthPoints - damage;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void resetHealth() {
        this.healthPoints = maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    @Override
    public String toString() {
        return "Character{" +
                "userName='" + name + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", gold=" + gold +
                ", healthPoints=" + healthPoints +
                ", maxHealthPoints=" + maxHealthPoints +
                ", damage=" + damage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return level == character.level
                && experience == character.experience
                && gold == character.gold
                && healthPoints == character.healthPoints
                && maxHealthPoints == character.maxHealthPoints
                && damage == character.damage
                && Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, experience, gold, healthPoints, maxHealthPoints, damage);
    }
}
