public class Monster {
    // Podstawowe atrybuty dla każdego potwora
    String name;
    int level;
    int healthPoints;
    int currentHealthPoints;
    int damage;
    int exp;

    // Konstruktor, który umożliwia szybkie nadawanie wartości podstawowym atrybutom potwora
    Monster(String name, int level, int healthPoints, int damage, int exp) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.currentHealthPoints = healthPoints;
        this.damage = damage;
        this.exp = exp;
    }
    void getBasicInformation() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nazwa: " + name);
        System.out.println("Poziom: " + level);
        System.out.println("Punkty życia: " + healthPoints);
        System.out.println("Obrażenia: " + damage);
        System.out.println("Exp do zdobycia: " + exp);
        System.out.println("-----------------------------------------------------------");
    }

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public void setCurrentHealthPoints(int currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void takeHit(int damage) {
        this.currentHealthPoints = this.currentHealthPoints - damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
