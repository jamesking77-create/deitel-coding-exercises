package deitelChapters.chapterTwo;

import java.util.Scanner;
public class WorldPopulation{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
			System.out.println("Enter the current world population: ");
			long worldPopulation = input.nextLong();
		long populationEstimation1 = worldPopulation +69600000 ;
  		long populationEstimation2 = worldPopulation +139200000;
		long populationEstimation3 = worldPopulation +208800000;
		long populationEstimation4 = worldPopulation +278400000;
		long populationEstimation5 = worldPopulation +348000000;
			System.out.printf("world population would be %d in one year.\n", populationEstimation1);
			System.out.printf("world population would be %d in two years.\n", populationEstimation2);
			System.out.printf("world population would be %d in three years.\n", populationEstimation3);
			System.out.printf("world population would be %d in four years.\n", populationEstimation4);
			System.out.printf("world population would be %d in five years.\n", populationEstimation5);

}
}