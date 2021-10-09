package stack.and.queue;

public class Stack {
  Node top;


public Stack() {

}

  public boolean isEmpty() {
    return (top==null);
  }






  public void push(String data) {
    if(isEmpty()) {
      Node newNode = new Node(data);
      top = newNode;
    } else {
      Node newNode = new Node(data);
      newNode.setNext(top);
      top = newNode;
    }
  }

  public String pop() {
    if(isEmpty()) {
      return "stack is empty";
    } else {
      String data = top.getData();
     top=top.getNext();
      return data;
    }
  }


  public String peek() {
    if(isEmpty()) {
      return "stack is empty";
    } else {
      return top.getData();
    }
  }



}



