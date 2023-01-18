public class MyCharacter {
    // Podstawowe atrybuty dla postaci
    String profession;
    String userName;
    int damage;
    int maxHealth;
    int currentHealth;
    int level;
    final int maxLevel = 300;
    int experience;
    int requiredExperience;
    int gold;

    MyCharacter(String userName, String profession) {
        this.userName = userName;
        this.profession = profession;
        // Ustawienie podstawowych wartości dla każdego atrybutu postaci
        damage = 30;
        maxHealth = 100;
        currentHealth = 100;
        level = 1;
        experience = 0;
        gold = 0;
    }

    boolean isEnoughExperienceToLevelUp() {
        return experience >= requiredExperience; // Sprawdzamy czy exp >= reqExp | Jeśli tak = zwraca true | Jeśli nie = zwraca false
    }

    // Sprawdzenie czy gracz może awansować na wyższy poziom, jeśli tak to level zwiększa się +1
    void checkLevelUp() {
        if (isEnoughExperienceToLevelUp() && level < maxLevel) {
            experience -= requiredExperience;
            level++;
            requiredExperience = (requiredExperience * 5) / 4;
        }
    }

    void getBasicInformation() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nazwa użytkownika: " + userName);
        System.out.println("Profesja: " + profession);
        System.out.println("Poziom: " + level);
        System.out.println("Doświadczenie: " + experience);
        System.out.println("Złoto: " + gold);
        System.out.println("-----------------------------------------------------------");
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void takeHit(int damage) {
        this.currentHealth = this.currentHealth - damage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
