package deitelChapters.chapterFourteenFifteen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class CovertDateTime {
    public static void main(String[] args) throws ParseException {
        System.out.println(convertDateTime("07/08/1993"));
    }

    private static String convertDateTime(String date) {
        String [] splitDate = date.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(splitDate[2]),Integer.parseInt(splitDate[1]),Integer.parseInt(splitDate[0]));
        return DateTimeFormatter.ofPattern("EEEE, d MMMM, yyyy").format(localDate);

//        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat outPut = new SimpleDateFormat("dd-MM-yyyy");
//        Date resetDate = input.parse(s);
//        System.out.println(outPut.format(resetDate));

//        DateFormat date = DateFormat.getDateInstance(DateFormat.LONG, Locale.CANADA);
////        String myDate = String.valueOf(date.parse(s));
//



    }
}
