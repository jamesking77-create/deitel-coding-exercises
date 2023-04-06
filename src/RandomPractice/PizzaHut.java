package RandomPractice;
   
public class PizzaHot {
    public static void main(String[] args) {
        pizzaCheck(14, 6, 4);
    }

    private static void pizzaCheck(int numberOfPeople, int maxSatifaction, int minSatisfaction) {
        minSatisfaction = 2 * minSatisfaction;
        maxSatifaction = 3 * maxSatifaction;
        int amountOfPizza = numberOfPeople + (maxSatifaction  + (minSatisfaction / 2) + (minSatisfaction));
        System.out.println(amountOfPizza);

    }
}
