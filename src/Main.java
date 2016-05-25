
public class Main {

	public static void main(String[] args) {
		int[][] negQuantity = new int[][] {
				{ 6, 1 },
				{ 7, 3 },
				{ 8, 2 },
				{ 8, 0 }		
		};
		int[][] posQuantity = new int[][] {
				{ 8, 4 },
				{ 8, 6 },
				{ 9, 2 },
				{ 9, 5 }		
		};
		
		Perceptron perceptron = new Perceptron(negQuantity, posQuantity);
		perceptron.learn();
	}

}
