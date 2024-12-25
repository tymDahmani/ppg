import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("hey, good person!");

        Thread.sleep(500);

        File file = new File("mt.txt");
        String mt = "";

        if (!file.exists()) {
            System.out.println("enter your magical touch: ");
            String mt1 = sc.nextLine();

            try (FileWriter fw = new FileWriter("mt.txt")) {
                fw.write(mt1);
                System.out.println("magical touch stored!");
            }
            mt = new String(Files.readAllBytes(Paths.get("mt.txt")));
        } else {
            mt = new String(Files.readAllBytes(Paths.get("mt.txt")));
        }

        System.out.println("what website/app are you making a password for?");
        String webn = sc.nextLine();

        Thread.sleep(500);

        System.out.println("hmmm... nice!");
        Thread.sleep(200);

        System.out.println("what's your fav number/letter/(thing)?");
        String fav = sc.nextLine();

        Thread.sleep(200);
        System.out.println("generating...");
        Thread.sleep(300);
        System.out.println("...");
        Thread.sleep(300);
        System.out.println("..");
        Thread.sleep(200);
        System.out.println(".");

        System.out.println("-----------------------------------");
        String password = mt + webn + fav + "!";

        System.out.println("your password: " + password);

    }
}
