public class Nr {
    public static void main(String[] args) {
        validate(-10);
        validate(0);
        validate(1);
        validate(2);
        validate(3);
        validate(4);
        validate(14);
        validate(21);
        validate(99);
        validate(100);
        validate(105);
    }

    private static void validate(int nr) {
        System.out.println("nr: " + nr);

        // We want to test to see if a number is within the bounds of 1-100
        // TODO: add check here


        // We want to test to see if n is not within the bounds of 1-100
        // TODO: add check here


//        // TODO: what is wrong in the statement below
//        if (0 <= nr <= 10) {
//            System.out.println(nr + " is between 0 and 10.");
//        }

        // TODO: what is wrong in the statement below
        if (nr > 2 || nr < -2 && nr != 4) {
            System.out.println("Absolute value of " + nr + " is greater than 2 and " + nr + " is not equal to 4.");
        }

    }
}
