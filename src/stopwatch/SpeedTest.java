package stopwatch;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * SpeedTest are measure and print elapsed time of Append and Sum Task
 * @author Charin Tantrakul
 * @since 29.01.2017
 */
public class SpeedTest {

	/**
	 * intialize TimeTask to measure and print elapsed time
	 */
	private static TimeTask timer = new TimeTask();
	/**
	 * task 1: append chars to a string.
	 */
	public static void testAppendToString(int count) {
		AppendToString testAppendToString = new AppendToString(count);
		timer.measureAndPrint(testAppendToString);
	}
	
	/**
	 * task 2: append chars to a StringBuilder
	 */
	public static void testAppendToStringBuilder(int count ) {
		AppendToStringBuilder testAppendToStringBuilder = new AppendToStringBuilder(count); 
		timer.measureAndPrint(testAppendToStringBuilder);
	}
	
	/**
	 * task 3: add double primitives from an array.
	 * You need a large counter value to get a measurable time.
	 */
	public static void testSumDoublePrimitive(int counter) {
		SumDoublePrimitive testSumDoublePrimitive = new SumDoublePrimitive(counter);
		timer.measureAndPrint(testSumDoublePrimitive);
	}
	
	
	/**
	 * task 4: add Double objects from an array.
	 * You need a large counter value to get a measurable time.
	 */
	public static void testSumDouble(int counter) {
		SumDouble testSumDouble = new SumDouble(counter);
		timer.measureAndPrint(testSumDouble);
	}
	
	
	/**
	 * task 5: add BigDecimal objects from an array.
	 * You need a large counter value to get a measurable time.
	 */
	public static void testSumBigDecimal(int counter) {
		SumBigDecimal testSumBigDecimal = new SumBigDecimal(counter);
		timer.measureAndPrint(testSumBigDecimal);
	}
	
	/**
	 * Run the tasks.
	 */
	public static void main(String[] args) throws IOException {

		SpeedTest.testAppendToString(50000);
		// same task but with a larger string size (append more chars)
		SpeedTest.testAppendToString(100000);
		// do the same thing using StringBuilder.
		SpeedTest.testAppendToStringBuilder(100000);
		
		// Use a large loop count for floating point tests in order to get accurate times
		int counter = 1000000000; 
		
		SpeedTest.testSumDoublePrimitive(counter);
		SpeedTest.testSumDouble(counter);
		SpeedTest.testSumBigDecimal(counter);
	}
}