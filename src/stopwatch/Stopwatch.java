package stopwatch;
/** Stopwatch  is object that used in calculate the times  while doing something.
 * @author Charin Tantrakul
 *
 */
public class Stopwatch {
	private static final double NANOSECONDS = 1.0E-9;
	private long startTime;
	private long endTime;
	private boolean isRun;
	
	/**
	 * Initialize constructor of Stopwatch
	 */
	public Stopwatch(){
		startTime =0;
		endTime=0;
		isRun=false;
	}
	
    /**
     * used to start timer 
     * startTime collected current time in nanosecond
     * if isRunnig() is true, start() will not work
     */
	void start(){
		startTime = 0 ;
		endTime = 0;
		if(isRunning()==false){
			startTime = System.nanoTime();
			this.isRun=true;
		}
	}
	
	/**
	 * used to stop timer
	 * endTime collected current time in nanosecond
	 * if isRunnig() is false ,stop() will not work
	 */
	void stop(){
		if(isRunning()==true){
			endTime = System.nanoTime();
			this.isRun=false;
		}
	}
	
	/**
	 * getElapsed will calculate elapsed between start and stop Stopwatch
	 * by endTime-startTime and convert to second by multiply with NANOSECONDS
	 * @return totalTime is elapsed between you start() and stop() Stopwatch.
	 */
	double getElapsed(){
		double totalTime = (endTime-startTime)*NANOSECONDS;
		return totalTime;
	}
	
    /**
     * use to get status of Stopwatch(Runnig or not)
     * @return true if Stopwatch are running at time
     */
	boolean isRunning(){
		return this.isRun;
	}


}
