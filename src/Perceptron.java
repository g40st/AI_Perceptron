
public class Perceptron {
	double[][] negQuantity = new double[4][4];
	double[][] posQuantity = new double[4][4];
	double[][] w = new double[][]{{1,1,1}};
	
	Perceptron(double[][] negQuantity, double[][] posQuantity) {
		this.negQuantity = negQuantity;
		this.posQuantity = posQuantity;
	}
	
	public void learn() {
		boolean flag;
		int countIterations = 0;
		
		do {
			flag = false;
			for(int i = 0; i < posQuantity.length; i++) {				
				if(scalarProduct(posQuantity[i][0], posQuantity[i][1], posQuantity[i][2]) <= 0) {
					System.out.println("Skalarprodukt positiv " + scalarProduct(posQuantity[i][0], posQuantity[i][1], posQuantity[i][2]));
					w[0][0] = w[0][0] + posQuantity[i][0];
					w[0][1] = w[0][1] + posQuantity[i][1];
					w[0][2] = w[0][2] + posQuantity[i][2];
					flag = true;
					countIterations++;
				}	
			}
			
			for(int k = 0; k < negQuantity.length; k++) {
				if(scalarProduct(negQuantity[k][0], negQuantity[k][1], negQuantity[k][2]) > 0) {
					System.out.println("Skalarprodukt negativ " + scalarProduct(negQuantity[k][0], negQuantity[k][1], negQuantity[k][2]));
					w[0][0] = w[0][0] - negQuantity[k][0];
					w[0][1] = w[0][1] - negQuantity[k][1];
					w[0][2] = w[0][2] - negQuantity[k][2];
					flag = true;
					countIterations++;
				}
			}
		} while(flag == true);
		System.out.println("\n\nGewichtsvektor: " + w[0][0] + " / " + w[0][1] + " / " + w[0][2]);
		System.out.println("Anzahl Iterationen: " + countIterations);
	}
	
	private double scalarProduct(double x1, double x2, double x3) {	
		double scalarprodukt = w[0][0] * x1 + w[0][1] * x2 + w[0][2] * x3;
		return scalarprodukt;		
	}
}
