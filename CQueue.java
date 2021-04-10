package first;

public class CQueue {
	int size = 5;
	int front,rear;
	int items[];
	
	CQueue(){
		front =-1;
		rear =-1;
		items = new int[size];
	}

	boolean isFull() {
		if(front==0 && rear==size-1) {
			return true;
		}
		if(front==rear+1) {
			return true;
		}
		
		return false;
	}
	
	boolean isEmpty() {
		if(front==-1)
			return true;
		else 
			return false;
	}
	
	void enQueue(int ele) {
		if(isFull()) {
			System.out.println("Queue Overflow");
		}
		else {
			if(front==-1)
				front= 0;
			rear= (rear+1)% size;
			items[rear]=ele;
		}
	}
	
	void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
		}
		else {
			if(front==rear) {
				front=-1;
			    rear=-1;
			}
			else {
				front = (front+1)%size;
		}
	}
}
	
	void display() {
		int i;
		if(isEmpty()) {
			System.out.println("Queue Underflow");
		}
		else
		{
			System.out.println("Front--> "+front);
			System.out.println("Items-->");
			for( i=front;i!=rear;i=(i+1)%size) {
				System.out.println(items[i]);
			}
			System.out.println(items[i]);
			System.out.println("Rear--> "+rear);
			
		}
	}
	
	
	public static void main(String args[]) {
		CQueue q = new CQueue();
		
		q.enQueue(55);
		q.enQueue(3);
		q.enQueue(99);
		q.enQueue(49);
		q.enQueue(33);
		
		q.deQueue();
		
		q.display();
	}
}
