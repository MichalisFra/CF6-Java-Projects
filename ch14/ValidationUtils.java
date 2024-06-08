package gr.aueb.cf.OOPProjects.ch14;

public class ValidationUtils {

    private ValidationUtils(){
    }

    public static boolean isValidLength(String string) {
//        if (string == null) {
//            return false;
//        }
        return !string.isEmpty() && string.length() <= 31;
    }

    public static boolean isValidNumber(double dbl) {
        return dbl <= 10D;
    }
}
