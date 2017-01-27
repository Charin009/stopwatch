package stopwatch;

public class Stopwatch {
	private static final double NANOSECONDS = 1.0E-9;
	private long startTime;
	private long endTime;
	private boolean isRun=false;
	public Stopwatch(){

	}

	void start(){
		startTime = 0 ;
		if(isRunning()==false){
			startTime = System.nanoTime();
			this.isRun=true;
		}
	}

	void stop(){
		if(isRunning()==true){
			endTime = System.nanoTime();
			this.isRun=false;
		}
	}

	double getElapsed(){
		double totalTime = (endTime-startTime)*NANOSECONDS;
		return totalTime;
	}

	boolean isRunning(){
		return this.isRun;
	}


}
