package stack.and.queue;

public class Queue {
  Node front;
  Node rear;

  public Queue(){

  }

  public boolean isEmpty() {
    return(front == null);
  }


  public void enqueue(String data) {
    if (isEmpty()) {
      Node newNode = new Node(data);
      front = newNode;
      rear = newNode;
    } else {
      Node newNode = new Node(data);
      rear.setNext(newNode);
      rear = newNode;
    }
  }


  public String dequeue() {
    if(isEmpty()) {
      return "queue is empty";
    } else {
      String data = front.getData();
      front=front.getNext();
      return data;
    }
  }

public String peek() {
  if(isEmpty()) {
    return "queue is empty";
  } else {
    return front.getData();
  }
}


}
