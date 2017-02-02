package stopwatch;

public class SumDoublePrimitive implements Runnable {
	double[] values = new double[500000];
	private int counter;
	
	/**
	 * Initialize constructor for SumDoublePrimitive
	 * @param counter is time of sum
	 */
	public SumDoublePrimitive(int counter){
		this.counter = counter;
		for(int k=0; k<500000; k++) values[k] = k+1;
	}
	
	/**
	 * Sum double until reach to counter
	 */
	public void run(){
		double sum = 0.0;
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;  
			sum = sum + values[i];
		}
	}
	
	/**
	 * Print description of SumDoublePrimitive
	 */
	public String toString(){
		String printToString = "Sum array of double primitives with count="+counter;
		return printToString;
	}

}
