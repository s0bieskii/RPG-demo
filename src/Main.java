import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String username = createUserName();
        String profession = createProfession();
        MyCharacter person = new MyCharacter(username, profession);
        Monster monster = new Monster("Witcher", 1, 50, 6, 100);
        letsFight(person, monster);
    }

    private static void letsFight(MyCharacter player, Monster monster) {
        while(true) {
            monster.takeHit(player.getDamage());
            System.out.println(player.getUserName() + " zadaje " + player.getDamage() + " obrażeń dla " + monster.getName());
            if(monster.getCurrentHealthPoints() <= 0) {
                System.out.println(monster.getName() + " pokonany!");
                break;
            }
            player.takeHit(monster.getDamage());
            System.out.println(monster.getName() + " zadaje " + monster.getDamage() + " obrażeń dla " + player.getUserName());
            if(player.getCurrentHealth() <= 0) {
                System.out.println(player.getUserName() + " pokonany!");
                System.out.println("Gra przegrana :(");
                System.exit(0);
                break;
            }
        }
    }


    // Ustawianie username przez użytkownika
    private static String createUserName () {
        boolean isCorrectUserName = true;
        String userName = "Default_user";

        while (isCorrectUserName) {
            System.out.print("Podaj swój nick: ");
            userName = scanner.nextLine();

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
                isCorrectUserName = false;
            }
        }
        return userName;
    }

    // Wybieranie profesji przez użytkownika
    private static String createProfession() {
        boolean isCorrectProfession = true;
        String profession = "Wojownik";

        while (isCorrectProfession) {
            System.out.println("Dostępne profesje: [1] Wojownik || [2] Paladyn || [3] Zwiadowca || [4] Mag");
            System.out.print("Wybierz profesję postaci: ");
            int chooseProfession = scanner.nextInt();

            if (chooseProfession == 1) {
                profession = "Wojownik";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 2) {
                profession = "Paladyn";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 3) {
                profession = "Zwiadowca";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else if (chooseProfession == 4) {
                profession = "Mag";
                System.out.println("Wybrałeś profesję: " + profession);
                System.out.println();
                isCorrectProfession = false;
            } else {
                System.out.println("Wybierz odpowiednią profesję!");
                System.out.println();
                System.out.println();
            }
        }
        return profession;
    }
}
