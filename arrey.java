public class arrey {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 45;
        numbers[2] = 98;
        System.out.println(numbers.length);
        System.out.println("This is the number before: " + numbers[1]);
        numbers[1] = 2;

        for (int number : numbers) {
            if (number == 2) {
                System.out.println("This is the number after: " + number);
            } else {

                System.out.println(number);
            }
        }
    }
}
