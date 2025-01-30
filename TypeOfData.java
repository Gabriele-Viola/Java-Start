public class TypeOfData {
    public static void main(String[] args) {
        boolean isTrue = true; // or false || 1 byte
        byte theByte = 126; // -128 -> 127 || 1 byte
        short number = 32542; // -32768 -> 32767 || 2 byte
        int bigNumber = 1_000_000_000; // - 1 billion -> 1 billion || 4 byte
        long veryBigNumber = 9_000_000_000_000_000_000L;// - 9 quintillion -> 9 quintillion || 8 byte
        float floatNumber = 6.1239099399939393939339393939f; // || 4 byte -> decimal number with 5 decimal, you have to
                                                             // put 'f' at the end, if you write more than 5 numbers you
                                                             // will see the first 5 numbers.
        double otherTypeFloat = 6.1239099399939393939339393939; // || 8 bytein this case you can see all numbers after
                                                                // the dot.
        char aChar = 'a'; // single char wrapped in '' || 2 byte
        String aString = "whatever you wanna write"; // a string must have "", it's a Reference, can you use more
                                                     // methods like .length
        // When you have a type of data with the first letter in uppercase, it is a
        // reference data type. Instead, if the first letter is lowercase, it is a
        // primitive data type.

        System.out.println(theByte);
        System.out.println(isTrue);
        System.out.println(number);
        System.out.println(floatNumber);
        System.out.println(bigNumber);
        System.out.println(veryBigNumber);
        System.out.println(otherTypeFloat);
        System.out.println(aChar);
        System.out.println(aString);

    }

}
