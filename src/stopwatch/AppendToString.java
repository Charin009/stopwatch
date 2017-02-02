package stopwatch;

public class AppendToString implements Runnable {
	final char CHAR = 'a';
	private String result = "";
	private int count;
	
	/**
	 * Initialize constructor of AppendToString
	 * @param count is times of append
	 */
	public AppendToString(int count){
		this.count = count;
		}
		
	/**
	 * Append CHAR to string
	 */
	public void run(){
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
	}
	
	/**
	 * Print description of AppendToString
	 */
	public String toString(){
		String printToString = "Append "+count+" chars to String" ;
		return printToString;
	}
}


