import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class QueueExample {	
	public static void main(String[] args) {
		int input=0;
		String choice=null,name=null;
		
		Queue objectQ = new Queue();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("Queue for addcode for SJSU Course");
			System.out.println("1. Add name");
			System.out.println("2. Remove name");
			System.out.println("3. Peek  Element");
			System.out.println("4. Display Element");
			System.out.println("Enter your choice : ");
			try{
				input=Integer.parseInt(br.readLine());
			}catch(Exception e){
				System.out.println("Exception is : "+e);
			}
			
			switch(input){
				case 1:
					objectQ.enQueue(getName());
					break;
				case 2:
					System.out.println("De-queued element : "+ objectQ.deQueue());
					break;
				case 3:
					System.out.println("First element in Queue : "+ objectQ.getPeek());
					break;
				case 4:
					objectQ.displayQueue();
					break;
				default:
					System.out.println("Default choice selected");
			}
			System.out.println("Do you want to contiue? Yes OR No : ");
			try{
				choice=br.readLine();
			}catch(Exception e){
			System.out.println("Exception is : "+e);
			}	
		}while(choice.equalsIgnoreCase("Yes"));
		
		System.out.println("Enter available seat : ");
		try{
			input=Integer.parseInt(br.readLine());
		}catch(Exception e){
		System.out.println("Exception is : "+e);
		}
		for(int i=0;i<input;i++){
			name=objectQ.deQueue();
			if(name != "EmpltyQueue"){
				System.out.println(name + " will get addcode.");
			}
		}
	}
	
	public static String getName(){
		String name=null;
		System.out.println("Enter Student's Name : ");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			name=br.readLine();
		}catch(Exception e){
			System.out.println("Exception is : "+e);
		}
		return name;
	}	
}


