package stopwatch;
/**
 * TimeTask use to calculate and print times that runnable use in processing
 * @author Charin Tantrakul
 *
 */
public class TimeTask {
	/*
	 * Initialize  new Stopwatch 
	 */
	private static Stopwatch stopWatch ;
	
	 /**
	  * Initialize constructor of TimeTask
	  */
	 public TimeTask(){
		 stopWatch = new Stopwatch();
	 }
	 
	 /**
	  * Run task and print total time that task use to process
	  * @param runnable is  task that user want to run
	  */
	 public static void measureAndPrint(Runnable runnable){
		 stopWatch.start();
		 runnable.run();
		 stopWatch.stop();
		 System.out.println(runnable);
		 System.out.println("Total Time: "+stopWatch.getElapsed()+" seconds\n");
	 }
}
