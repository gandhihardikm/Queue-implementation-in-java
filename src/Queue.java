import java.util.LinkedList;

public class Queue{
	public Queue() {
		que = new LinkedList<String>();
	}

	private LinkedList<String> que;
	int size;
	
	public boolean isEmptyQueue(){
		if(que.size()==0)
			return true;
		return false;
	}
	
	public void enQueue(String stringToAdd){	
		que.add(stringToAdd);
		System.out.println("Added in Queue");
	}
	
	public String deQueue(){
		String objectRemoved=null;
		if(isEmptyQueue())
			return "EmptyQueue";
		else{
			objectRemoved=que.get(0);
			que.remove(0);
			System.out.println("Removed from Queue.");
			return objectRemoved;
		}
	}
	
	public void displayQueue(){
		System.out.println("Elements in the Queue");
		for(int i=0;i<size;i++){
			System.out.println(que.get(i));
		}
	}
	
	public String getPeek(){
		if(isEmptyQueue())
			return "EmptyQueue";
		else
			return que.getFirst();
	}
}
