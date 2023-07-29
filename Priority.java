
public interface Priority {

	static final int MED_PRIORITY=5;
	static final int MIN_PRIORITY=1;
	static final int MAX_PRIORITY=10;
	
	public void setPriority(int priority);
	public int getPriority();
	
}//end interface
