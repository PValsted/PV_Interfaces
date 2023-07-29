
public class Process implements Priority, Comparable<Process> {

	String processID;
	int priority;
	
	public Process () {
		processID="";
	}//end empty-argument constructor
	
	public Process(String processID) {
		this.processID=processID;
	}//end preferred constructor
	
	@Override
	public int compareTo(Process o) {
		if (this.priority==o.priority) {
		return 0; //priorities are equal
		} else return 1; //priorities aren't equal
	}//end compareTo
	
	public void setProcessID(String processID) {
		this.processID=processID;
	}//end setProcessID
	
	public String getProcessID() {
		return processID;
	}//end getProcessID
	
	@Override
	public void setPriority(int priority) {
		if (priority>=MIN_PRIORITY && priority<=MAX_PRIORITY) {
			this.priority=priority;
		}
		else if(priority<MIN_PRIORITY) System.out.println("Error: Priority cannot be less than 1.");
		else if (priority>MAX_PRIORITY) System.out.println("Error: Priority cannot be greater than 10");
	}//end setPriority

	@Override
	public int getPriority() {
		return priority;
	}//end getPriority

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
	
}//end class
