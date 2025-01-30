// public class Ex1 {
//     public static void main(String[] args) {
//         int userAge = 17;
//         if (userAge >= 18) {
//             System.out.println("Utente maggiorenne");
//         } else {
//             System.out.println("Utente Minorenne");
//         }
//     }
// }

public class Ex1 {
    public static void main(String[] args) {
        int age = 16;
        verifyAge(age);
    }

    // Metodo separato per verificare l'età
    public static void verifyAge(int age) {
        if (age >= 18) {
            System.out.println("You are minor");
        } else {
            System.out.println("You are adult");
        }
    }
}