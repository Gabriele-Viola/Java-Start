import java.util.Scanner;

public class tryScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("What's your surname?");
        String surname = scanner.nextLine();
        System.out.println("What's your age?");
        int age = scanner.nextInt();
        scanner.nextLine(); // you have to place other next line becouse nextInt() doesn't create a new line
                            // where you can write the answer
        System.out.println("Where you come from?");
        String city = scanner.nextLine();
        System.out.println("Hello " + name + ' ' + surname);
        System.out.println("you are " + age + " years old");
        System.out.println("and you come from " + city);
    }
}
