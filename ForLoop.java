public class ForLoop {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i <= 5; i++) {
            System.out.println("row " + i);

            for (int j = 0; j <= 5; j++) {
                System.out.println("colum " + j);
            }
        }
        // forEach loop -- enhanced
        char[] charachters = { 'a', 'b', 'c', 'd', 'e', 'f' };

        for (char chart : charachters) {
            if (chart == 'd') { // You can use break if you wanna find somethig and stop the loop
                System.out.println("You find: " + chart);
                break; /*
                        * if you use "continue", you will get all items of the array, without the item
                        * in the condition
                        */
            }
            System.out.println("the chart is: " + chart);
        }

        String name = "gabriele";
        System.out.println("The spelling is :");
        for (char letter : name.toCharArray()) {
            System.out.println(letter);
        }

    }

}
