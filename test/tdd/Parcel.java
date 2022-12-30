package tdd;

public class Parcel {

    public int getBonus(int cr, int amount) {
        amount = 200;
       if (cr >= 50 && cr <= 59) cr = cr * amount;
       return cr;
    }


    public int getBonus2(int cr, int amount) {
        amount = 250;
        if (cr >= 60 && cr <= 69) cr = cr * amount;
        return cr;
    }

    public int getBonus3(int cr, int amount) {
        amount = 500;
        if (cr >= 70 ) cr = cr * amount;
        return cr;
    }
}
