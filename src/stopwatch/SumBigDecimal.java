package stopwatch;

import java.math.BigDecimal;
/**
 * This class use to find sum of Bigdecimal.
 * @author Charin Tantrakul
 *
 */
public class SumBigDecimal implements Runnable{
	/*
	 * Set new BigDecimal array as values and length is 500000
	 */
	BigDecimal[] values = new BigDecimal[500000];
	/*
	 * Set times of sum with variable counter
	 */
	private int counter;
	
	/**
	 * Initialize constructor for SumBigDecimal
	 * @param counter is times of sum
	 */
	public SumBigDecimal(int counter){
		this.counter = counter;
		for(int i=0; i<500000; i++) values[i] = new BigDecimal(i+1);
	}
	
	/**
	 * Sum BigDecimal until reach to counter
	 */
	public void run(){
		BigDecimal sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length){
				i = 0;
			}
			sum = sum.add( values[i] );
		}
	}
	
	/**
	 * Print description of SumBigDecimal
	 */
	public String toString(){
		String printToString = "Sum array of BigDecimal with count ="+counter;
		return printToString;
	}
}
