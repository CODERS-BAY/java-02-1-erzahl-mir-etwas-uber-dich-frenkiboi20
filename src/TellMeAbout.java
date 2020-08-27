import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TellMeAbout {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.print("Name: ");
        String firstName = sc.next();
        String famName = sc.nextLine();

        System.out.print("Geburtstag: ");
        String born = sc.nextLine();

        System.out.print("Wie alt bist du: ");
        int age = sc.nextInt();

        System.out.print("Bist du verheiratet (true/false): ");
        boolean isMarried = sc.nextBoolean();

        System.out.print("Wie groß bist du in Metern: ");
        float size = sc.nextFloat();

        System.out.println("Dein Name lautet: " + firstName + famName);
        System.out.println("Alter: " + age);
        System.out.println("Verheiratet: " + isMarried);
        System.out.println("Größe/m: " + size);
        System.out.println("Dein Geburtstag ist der: " + sdf.parse(born));

    }
}
