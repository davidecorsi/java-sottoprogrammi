import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int[] numberArray = new int[20];
		int somma = 0;
		for(int i = 0; i < numberArray.length; i++) {
			numberArray[i] = random.nextInt(20) + 1;
		}
		
		for(int n: numberArray) {
			somma += n;
		}
		double media = (double) somma / numberArray.length;
	}
}
