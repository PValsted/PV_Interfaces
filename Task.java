
public class Task implements Priority, Comparable<Task> {
	
	Status taskStatus;
	String name;
	int priority;
	
	public Task(){
		name="";
	}//end empty-argument constructor
	
	public Task(String name) {
		this.name=name;
	}//end preferred constructor
	
	@Override
	public int compareTo(Task o) {
		if (this.priority==o.priority) {
			return 0; //priorities are equal
			} else return 1; //priorities aren't equal
	}//end compareTo
	
	public String getName() {
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setName

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
	
	public void setStatus(Status taskStatus) {
		this.taskStatus=taskStatus;
	}//end setStatus
	
	public Status getStatus() {
		return taskStatus;
	}//end getStatus

	@Override
	public String toString() {
		return "Task [taskStatus=" + taskStatus + ", name=" + name + ", priority=" + priority + "]";
	}//end toString
	
}//end class
