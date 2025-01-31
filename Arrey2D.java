public class Arrey2D {
    public static void main(String[] args) {

        String[][] rooms = new String[3][3];
        rooms[0][0] = "Claudio";
        rooms[0][1] = "Marco";
        rooms[0][2] = "Anna";
        rooms[1][0] = "Claudia";
        rooms[1][1] = "Fabrizio";
        rooms[1][2] = "Lorenzo";
        rooms[2][0] = "Maria";
        rooms[2][1] = "Luigi";
        rooms[2][2] = "Gabriele";

        int count = 1;
        for (String[] room : rooms) {
            System.out.println("in the room " + count);
            count++;
            for (String alumn : room) {
                System.out.print(alumn + " ");
            }
            System.out.println("");
        }
        /*
         * for (int room = 0; room < rooms.length; room++) {
         * System.out.println("in the room " + room);
         * for (int alumn = 0; alumn < rooms[room].length; alumn++) {
         * System.out.print(rooms[room][alumn] + " ");
         * }
         * System.out.println();
         * 
         * }
         */

    }
}
