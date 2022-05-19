public class Func {


    public static void main(String[] args) {

        int value = 70;
//        validate(value, new ValidatorImpl());
        validate(value, (int v)->value>=80);

        }



    private static void validate(int value, Validator validator) {
        System.out.println("Check value according to validator:");
        boolean isValid = validator.validate(value);
        if (isValid) {
            System.out.println("Great! Correct");
        } else {
            System.out.println("Invalid");
        }
    }

}
