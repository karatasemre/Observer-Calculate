package observablecalculate.com.observablecalculate;

public class IntegerHelper {
    public static boolean integerControl(String afterTxt) {
        int afterNum = Integer.parseInt(afterTxt);

        if (afterNum > 100) {
            return false;
        }
        return true;
    }
}
