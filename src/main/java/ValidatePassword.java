public class ValidatePassword {
    public static void main(String[] args) {
        String pass = "Password123";
    }

    public static boolean valPass(String pass) {
        if (pass.length() < 8) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                hasUpper = true;
            }
            if (Character.isLowerCase(pass.charAt(i))) {
                hasLower = true;
            }
            if (Character.isDigit(pass.charAt(i))) {
                hasDigit = true;
            }
        }
        if (hasUpper && hasLower && hasDigit) {
            return true;
        }
        return false;
    }
}
