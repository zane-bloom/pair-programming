package nz.co.entelect;

public class NumeralConverter {

    public int convert(String romanLetter) {
        int result = 0;

        while (romanLetter.startsWith("x") || romanLetter.startsWith("v")) {
            RomanLetterHolder romanLetterHolder = checkFirstCharacter(romanLetter);
            result += romanLetterHolder.getResult();
            romanLetter = romanLetterHolder.getRemainingRomanLetter();
        }

        if (romanLetter.equals("i")) {
            return result + 1;
        } else if (romanLetter.equals("ii")) {
            return result + 2;
        }

        return result;
    }

    private RomanLetterHolder checkFirstCharacter(String romanLetter) {
        if (romanLetter.startsWith("x")) {
            return new RomanLetterHolder(10, romanLetter.substring(1));
        }

        if (romanLetter.startsWith("v")) {
            return new RomanLetterHolder(5, romanLetter.substring(1));
        }

        return new RomanLetterHolder(0, romanLetter);
    }


}
