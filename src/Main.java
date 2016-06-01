
public class Main {

	public static void main(String[] args) {
		double[][] negQuantity = new double[][] {
				{ 6, 1, 1},
				{ 7, 3, 1},
				{ 8, 2, 1},
				{ 9, 0, 1}		
		};
		double[][] posQuantity = new double[][] {
				{ 8, 4, 1 },
				{ 8, 6, 1 },
				{ 9, 2, 1 },
				{ 9, 5, 1 }		
		};/*
		
		
		double[][] negQuantity = new double[][] {
				{ -1.2, 1.4 },
				{ 0.4, -1 }	
		};
		double[][] posQuantity = new double[][] {
				{ 0, 1.8 },
				{ 2, 0.6 }		
		};*/
		
		Perceptron perceptron = new Perceptron(negQuantity, posQuantity);
		perceptron.learn();
	}

}
