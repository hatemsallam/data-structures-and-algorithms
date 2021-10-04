package linked.list;

public class LinkedList {

  private Node head;

  public LinkedList() {
    head=null;
  }

  public void insert( String value) {
    Node newNode = new Node(value);
    if (head== null) {
      head = newNode;
    } else {
      newNode.setNext(head);
      head= newNode;
    }
  }


  public Boolean include(String value) {
    Node current = head;
    while (current != null ) {
      if(current.getData()==value) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }



  @Override
  public String toString() {
   Node current = head;
   String sortedList = "" ;
   while (current!=null) {
     sortedList = sortedList + "{ " + current.getData() + " } ->";
     current = current.getNext();
   }
    sortedList= sortedList + " null";
   return sortedList;
  }

  public Node getHead() {
    return head;
  }

  public int size () {
    Node current;
    int count=0;
    current=head;
    while(current != null){
      count++;

      current=current.getNext();
    }
    return count;
  }

  public String kth(int k) {
    int length = size();
    if((k<length)&&(k>=0)){
      Node search = head;
      while (length-->=0) {
        if(length ==k) {
          return search.getData();
        }
        search=search.getNext();
      }

    } else if(k<0) {
      try {
        throw new Exception("Negative Not accept");
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else if (k >=length) {
      try {
        throw new Exception("Out of Range");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return "error";
  }






}

