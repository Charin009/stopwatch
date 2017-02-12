package stopwatch;
/**
 * This class use to find sum of double
 * @author Charin Tantrakul
 */
public class SumDouble implements Runnable {
	/*
	 * Set new double array as values and length is 500000
	 */
	double[] values = new double[500000];
	/*
	 * Set times of Sum with variable counter
	 */
	private int counter;
	
	/**
	 * Initialize constructor for SumDouble
	 * @param counter is times of sum
	 */
	public SumDouble(int counter){
		this.counter = counter;
		for(int i=0; i<500000; i++) values[i] = new Double(i+1);
	}
	
	/**
	 * Sum double until reach to counter
	 */
	public void run(){
		Double sum = new Double(0.0);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length){
				i = 0;
			}
			sum = sum + values[i];
		}
	}
	
	/**
	 * Print description of SumDouble 
	 */
	public String toString(){
		String printToString = "Sum array of Double objects with count="+counter;
		return printToString;
	}
}
