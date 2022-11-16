package tdd;

public class Exam {
    public int priceOf (int numberOfCopies) {
        if (numberOfCopies <= 4);
        numberOfCopies =  numberOfCopies * 2000;
        return numberOfCopies;
    }

    public int priceOf2(int numberOfCopies) {
        if (numberOfCopies >= 5 && numberOfCopies <= 9 );
        numberOfCopies = numberOfCopies * 1_800;
        return numberOfCopies;
    }

    public int priceOf3(int numberOfCopies) {
         if( numberOfCopies >= 10 && numberOfCopies <= 29 );
        numberOfCopies = numberOfCopies * 1_600;
        return numberOfCopies;
    }

    public int priceOf4(int numberOfCopies) {
        if( numberOfCopies == 30 && numberOfCopies <= 49 );
        numberOfCopies = numberOfCopies * 1_500;
        return numberOfCopies;

    }

    public int priceOf5(int numberOfCopies) {
        if( numberOfCopies >= 50 && numberOfCopies <= 99 );
        numberOfCopies = numberOfCopies * 1_300;
        return numberOfCopies;
    }

    public int priceOf6(int numberOfCopies) {
        if( numberOfCopies >= 100 && numberOfCopies <= 199 );
        numberOfCopies = numberOfCopies * 1_200;
        return numberOfCopies;
    }

    public int priceOf7(int numberOfCopies) {
        if( numberOfCopies >= 200 && numberOfCopies <= 299 );
        numberOfCopies = numberOfCopies * 1_100;
        return numberOfCopies;
    }

    public int priceOf8(int  numberOfCopies ) {
        if( numberOfCopies >= 300 && numberOfCopies <= 400 );
        numberOfCopies = numberOfCopies * 1_000;
        return numberOfCopies;
    }
}


