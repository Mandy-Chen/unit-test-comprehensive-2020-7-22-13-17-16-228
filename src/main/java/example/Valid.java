package example;

public class Valid {

    public Boolean valid(String guessNumber) {
        if (guessNumber.length() != 4) {
            return false;
        } else if (IsRepeatNumber(guessNumber)) {
            return false;
        } else {
            return true;
        }
    }
    //TODO
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
}
