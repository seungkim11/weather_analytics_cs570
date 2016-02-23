
import java.util.Timer;  
import java.util.TimerTask;  
  
public class TimerTaskJob extends TimerTask {  
  
    @Override  
    public void run() {  
        // The logic of task/job that is going to be executed.  
        // Here we are going to print the following string value 
    	//Analysis ana=new Analysis();
    	Analysis.main(null);
    	FetchFromAWS.main(null);
        System.out.println("This is being printed every 1 hour.");         
    }  
      
    public static void main(String[] args) {  
        // Create an instance of our task/job for execution  
    	TimerTaskJob task = new TimerTaskJob();  
          
        // We use a class java.util.Timer to   
        // schedule our task/job for execution  
        Timer timer = new Timer();  
          
        // Let's schedule our task/job to be executed every 1 second  
        timer.scheduleAtFixedRate(task, 0, 3600*1000);  
        // First parameter: task - the job logic we   
        // created in run() method above.  
        // Second parameter: 0 - means that the task is   
        // executed in 0 millisecond after the program runs.  
        // Third parameter: 1000 - means that the task is   
        // repeated every 1000 milliseconds  
          
    }  
}
  