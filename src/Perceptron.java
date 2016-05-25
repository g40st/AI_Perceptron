
public class Perceptron {
	int[][] negQuantity = new int[4][4];
	int[][] posQuantity = new int[4][4];
	int[][] w = new int[][]{{1,1}};
	
	Perceptron(int[][] negQuantity, int[][] posQuantity) {
		this.negQuantity = negQuantity;
		this.posQuantity = posQuantity;
	}
	
	public void learn() {
		boolean flag;
				
		do {
			flag = false;
			for(int i = 0; i < posQuantity.length; i++) {				
				if(scalarProduct(posQuantity[i][0], posQuantity[i][1]) <= 0) {
					System.out.println("Skalarprodukt positiv " + scalarProduct(posQuantity[i][0], posQuantity[i][1]));
					w[0][0] = w[0][0] + posQuantity[i][0];
					w[0][1] = w[0][1] + posQuantity[i][1];
					flag = true;
					
				}	
				
				System.out.println(w[0][0] + " / " + w[0][1]);
			}
			
			for(int k = 0; k < negQuantity.length; k++) {
				
				if(scalarProduct(negQuantity[k][0], negQuantity[k][1]) > 0) {
					System.out.println("Skalarprodukt negativ " + scalarProduct(negQuantity[k][0], negQuantity[k][1]));
					System.out.println(negQuantity[k][0] + " / " + negQuantity[k][1]);
					w[0][0] = w[0][0] - negQuantity[k][0];
					w[0][1] = w[0][1] - negQuantity[k][1];
					flag = true;

				}
				
				System.out.println(w[0][0] + " / " + w[0][1]);
			}
		} while(flag == false);		
		System.out.println("Perzeptron terminiert");
	}
	
	private double scalarProduct(int x1, int x2) {
		double scalarprodukt = (w[0][0] * x1) + (w[0][1] * x2);
		return scalarprodukt;		
	}
}
