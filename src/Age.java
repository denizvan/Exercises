public class Age {
    public static void main(String[] args) {
        validateAge(-10);
        validateAge(-1);
        validateAge(0);
        validateAge(1);
        validateAge(12);
        validateAge(119);
        validateAge(120);
        validateAge(321);
    }

    //  We want to see if the input is illegal, which is the case if age is less than 0 or greater than 120.
    private static void validateAge(int age) {
        System.out.println("age: " + age);

        // TODO: add check here
    }
}
