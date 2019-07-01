public class E11_RectangleArea {

	public static void main(String[] args) {
		
		// data provided
		double w = 5.5;
		double l = 8.5;
		double area = w * l;
		double parameter = 2*(l + w);
		
		// print out result
		System.out.printf("Using a width measured at: " + w + ", and a length measured at: "+ l + 
				".%nThe area of this rectangle will measure at: "+ area + ", and the parameter will measure at: "+ parameter + ".");
	}

}
