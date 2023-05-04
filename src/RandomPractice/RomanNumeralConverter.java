package RandomPractice;


import java.util.Objects;

public class RomanNumeralConverter {
    public static void main(String[] args) {
        System.out.println(generateRomanFigure("822"));
    }

    private static String generateRomanFigure(String  number) {
        String digit = "";
        String [] romanFigures = {"1000", "900", "500", "400", "100", "90", "50","60","70","80","40", "20","10", "800", "600", "700", "1" };
        for (String digits: romanFigures) {
            if(digits.equals("1000")) digit =  "M";
            if(digits.equals("900")) digit = "CM";
            if(digits.equals("500")) digit ="D";
            if(digits.equals("400")) digit =  "CD";
            if(digits.equals("100")) digit = "C";
            if(digits.equals("90")) digit =" XC";
            if(digits.equals("50")) digit =  "L";
            if(digits.equals("40")) digit = "XL";
            if(digits.equals("10")) digit =  "X";
            if(digits.equals("20")) digit =  "XX";
            if(digits.equals("20")) digit =  "XXX";
            if(digits.equals("60")) digit =  "LX";
            if(digits.equals("70")) digit =  "LXX";
            if(digits.equals("80")) digit =  "LXXX";
            if(digits.equals("800")) digit =  "DCCC";
            if(digits.equals("600")) digit ="DC";
            if(digits.equals("700")) digit = "DCC";
            if(digits.equals("1")) digit = "I";
            if (number.equals(String.valueOf(Integer.parseInt(digits) + 1))) return  digit + "I";
            if (number.equals(String.valueOf(Integer.parseInt(digits) + 2))) return  digit + "II";
            if (number.equals(String.valueOf(Integer.parseInt(digits) + 3))) return  digit + "III";
            if (number.equals(String.valueOf(Integer.parseInt(digits) + 4))) return  digit + "IV";
            if (number.equals(String.valueOf(Integer.parseInt(digits) + 5))) return  digit + "V";
            if (number.equals(String.valueOf(Integer.parseInt(digits) + 6))) return  digit + "VI";
            if (number.equals(String.valueOf(Integer.parseInt(digits) + 7))) return  digit + "VII";
            if (number.equals(String.valueOf(Integer.parseInt(digits) + 8))) return  digit + "VIII";
            if (number.equals(String.valueOf(Integer.parseInt(digits) + 9))) return  digit + "IX";

        }
        return digit;
    }
}
