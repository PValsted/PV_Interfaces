
public class Application {

	public static void main(String[] args) {
		
		//Program 1
		//testing comparable interface on RationalNumber class
		RationalNumber num1=new RationalNumber(4,5);
		RationalNumber num2=new RationalNumber(5,4);
		RationalNumber num3=new RationalNumber(8,10);
		
		System.out.println(num1.compareTo(num2)); //compares 4/5 to 5/4, outputs -1 because 4/5 < 5/4
		System.out.println(num2.compareTo(num1)); //compares 5/4 to 4/5, outputs 1 because 5/4 > 4/5
		System.out.println(num1.compareTo(num3)+"\n"); //compares 4/5 to 8/10, outputs 0 because the fractions are equal

		//Program 2
		//testing Process and Task generic methods
		Task todo=new Task("List");
		
		todo.setName("To-Do List");
		System.out.println(todo.getName());
		
		todo.setPriority(0);
		todo.setPriority(11);
		todo.setPriority(5);
		System.out.println(todo.getPriority());
		
		todo.setStatus(Status.IN_PROGRESS);
		System.out.println(todo.getStatus());
		System.out.println(todo.toString()+"\n");
		
		Process taskMan=new Process("Program");
		
		taskMan.setProcessID("Task Manager");
		System.out.println(taskMan.getProcessID());
		
		taskMan.setPriority(4);
		System.out.println(taskMan.getPriority());
		System.out.println(taskMan.toString()+"\n");
		
		//testing Task/Process compareTo
		Task task2=new Task("Task 2");
		task2.setPriority(5);
		System.out.println(todo.compareTo(task2)); //priorities equal, so outputs 0
		task2.setPriority(4);
		System.out.println(todo.compareTo(task2)); //priorities not equal, so outputs 1
		
		Process proc2=new Process("Process 2");
		proc2.setPriority(4);
		System.out.println(taskMan.compareTo(proc2)); //priorities equal, so outputs 0
		proc2.setPriority(5);
		System.out.println(taskMan.compareTo(proc2)); //priorities not equal, so outputs 1
		
	}//end main

}//end class
