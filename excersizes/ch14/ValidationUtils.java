package gr.aueb.cf.OOPProjects.excersizes.ch14;

public class ValidationUtils {

    private ValidationUtils(){
    }

    public static boolean isValidLength(String string) {

        return !string.isEmpty() && string.length() <= 31;
    }

    public static boolean isValidNumber(double dbl) {
        return dbl >= 1 && dbl <= 10D;
    }
}
