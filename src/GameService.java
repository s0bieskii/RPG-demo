import java.util.Scanner;

public class GameService {

    private Scanner scanner = new Scanner(System.in);
    Player player;


    public GameService() {
        //Empty constructor needed
    }

    void startGame() {
        initializeGame();
        Monster monster = new Monster("Dzik", 1, 10, 100, 20, 20, 2);
        fight(player, monster);
    }

    public void initializeGame() {
        Profession profession = createProfession();
        String username = createUsername();
        player = new Player(username, 1, 0, 100, 100, 100, 10, profession);
    }

    private static void fight(Character character, Monster monster) {
        System.out.println();
        System.out.println("Toczysz walkę z przeciwnikiem: " + monster.getName());
        System.out.println();

        int fightRound = 0;
        while (character.getHealthPoints() > 0 || monster.getHealthPoints() > 0) {
            fightRound++;

            if (character.getHealthPoints() <= 0) {
                System.out.println();
                System.out.println("Przegrałeś walkę z przeciwnikiem: " + monster.getName());
                System.out.println("--------------------------------------------------------------------------");
                return;
            }

            monster.setHealthPoints(monster.getHealthPoints() - character.getDamage());
            System.out.println("[" + fightRound + "] " + "Zadałeś przeciwnikowi " + character.getDamage() + " obrażeń");

            if (monster.getHealthPoints() <= 0) {
                System.out.println();
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Wygrałeś walkę z przeciwnikiem: " + monster.getName());
                System.out.println();
                return;
            }

            character.resetHealth();
            System.out.println("[" + fightRound + "] " + "Utraciłeś " + monster.getDamage() + "hp od ataku przeciwnika");
        }
    }

    private Profession createProfession() {
        Profession profession = null;

        while (profession == null) {
            System.out.println("Dostępne profesje: [1] Wojownik || [2] Paladyn || [3] Zwiadowca || [4] Mag");
            System.out.print("Wybierz profesję postaci: ");
            int chooseProfession = scanner.nextInt();

            if (chooseProfession == 1) {
                profession = Profession.WOJOWNIK;
            } else if (chooseProfession == 2) {
                profession = Profession.PALADYN;
            } else if (chooseProfession == 3) {
                profession = Profession.ZWIADOWCA;
            } else if (chooseProfession == 4) {
                profession = Profession.MAG;
            } else {
                System.out.println("Wybierz odpowiednią profesję!");
            }
        }
        System.out.println("Wybrałeś profesję: " + profession);
        System.out.println();
        return profession;
    }

    private String createUsername() {
        while (true) {
            System.out.print("Podaj swój nick: ");
            String userName = scanner.nextLine();

            if (userName.length() < 5) {
                System.out.println("Nazwa użytkownika nie może być krótsza niż 5 znaków!");
                System.out.println();
            } else if (userName.length() > 12) {
                System.out.println("Nazwa użytkownika nie może być dłuższa niż 12 znaków!");
                System.out.println();
            } else {
                System.out.println("Twoja nazwa użytkownika: " + userName);
                System.out.println();
                System.out.println();
                return userName;
            }
        }
    }



}
