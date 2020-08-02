package example;

public class Valid {


    public Boolean valid(String guessNumber) {
        if (guessNumber.length() != 4 || IsNotNumber(guessNumber) || IsRepeatNumber(guessNumber)) {
            return false;
        }
        return true;

    }

    public Boolean IsRepeatNumber(String guessNumber) {
        for (int i = 0; i < guessNumber.length(); i++) {
            for (int j = i + 1; j < guessNumber.length(); j++) {
                if (guessNumber.charAt(i) == guessNumber.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean IsNotNumber(String guessNumber) {
        if (guessNumber.matches("[0-9]+")) {
            return false;
        }
        return true;
    }
}
