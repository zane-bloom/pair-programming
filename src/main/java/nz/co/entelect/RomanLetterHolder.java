package nz.co.entelect;

public class RomanLetterHolder {

    private final int result;
    private final String remainingRomanLetter;

    public RomanLetterHolder(int result, String remainingRomanLetter) {
        this.result = result;
        this.remainingRomanLetter = remainingRomanLetter;
    }

    public int getResult() {
        return result;
    }

    public String getRemainingRomanLetter() {
        return remainingRomanLetter;
    }
}
