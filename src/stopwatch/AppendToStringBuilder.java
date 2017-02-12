package stopwatch;
/**
*
*AppendToStringBuilder use to append string to StringBuilder.
*@author Charin Tantrakul.
*/
public class AppendToStringBuilder implements Runnable {
	final char CHAR = 'a';
	StringBuilder builder = new StringBuilder(); 
	private int count;
	
	/**
	 * Initialize constructor for AppendToStringBuilder
	 * @param count is time of append
	 */
	public AppendToStringBuilder(int count){
	this.count = count;
	}
	
	/**
	 * Append CHAR to StringBuilder until reach to count
	 */
	public void run (){
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
	}
	
	/**
	 * Print description of AppendToStringBuilder
	 */
	public String toString(){
		String printToString = "Append "+count+" chars to StringBuilder";
		return printToString;
	}
	
}
