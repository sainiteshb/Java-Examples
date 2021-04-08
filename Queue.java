package first;

public class Queue {

	int front,rear;
	int items[];
	 
	Queue(int size){
		front = -1;
		rear = -1;
		items = new int[size];
	}
	
	boolean isFull() {
		if(front == 0 && rear== -1) {
			return true;
		}
		return false;
		
	}
	boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		return false;
	}
	void enQueue(int ele) {
		if(isFull()) {
			System.out.println("Queue Overflow");
		}
		else {
			if(front==-1)
				front =0;
			rear++;
			items[rear] = ele;
		}
	}
	void deQueue() {
		int ele;
		if(isEmpty()) {
			System.out.println("Queue Underflow");
		}
		else {
			ele = items[front];
			if(front>=rear) {
				front = -1;
				rear=-1;
			}
			else {
				front++;
			}
		}
	}
	void display() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.println(items[i]);
			}
		}
	}
	
	public static void main(String args[]) {
		Queue q = new Queue(5);
		
		q.enQueue(55);
		q.enQueue(1);
		q.enQueue(78);
		q.enQueue(99);
		q.enQueue(49);
		
		q.deQueue();
		
		q.display();
	}
}
