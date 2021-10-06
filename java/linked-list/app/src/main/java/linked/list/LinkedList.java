package linked.list;

public class LinkedList {

  private Node head;

  public LinkedList() {
    head = null;
  }

  public void insert(String value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      newNode.setNext(head);
      head = newNode;
    }
  }


  public Boolean include(String value) {
    Node current = head;
    while (current != null) {
      if (current.getData() == value) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }


  @Override
  public String toString() {
    Node current = head;
    String sortedList = "";
    while (current != null) {
      sortedList = sortedList + "{ " + current.getData() + " } ->";
      current = current.getNext();
    }
    sortedList = sortedList + " null";
    return sortedList;
  }

  public Node getHead() {
    return head;
  }


  public int size() {
    Node current;
    int count = 0;
    current = head;
    while (current != null) {
      count++;

      current = current.getNext();
    }
    return count;
  }

  public String kth(int k) {
    int length = size();
    if ((k < length) && (k >= 0)) {
      Node search = head;
      while (length-- >= 0) {
        if (length == k) {
          return search.getData();
        }
        search = search.getNext();
      }

    } else if (k < 0) {
      try {
        throw new Exception("Negative Not accept");
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else if (k >= length) {
      try {
        throw new Exception("Out of Range");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return "error";
  }


  public void append(String value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);
    }
  }

  public void insertBefore(String value, String newValue) {
    Node newNode = new Node(newValue);
    if (head == null)
      head = newNode;
    else if (head.getData() == value) {
      newNode.setNext(head);
      head = newNode;
    } else {
      Node current = head;
      while (current != null) {
        if (current.getNext().getData() == value) {
          newNode.setNext(current.getNext());
          current.setNext(newNode);
          break;
        }
        current = current.getNext();
      }
    }
  }

  public void insertAfter(String value, String newValue) {
    Node newNode = new Node(newValue);
    Node current = head;
    while (current != null) {
      if (current.getData() == value) {
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        break;
      }
      current = current.getNext();
    }
  }


  public static LinkedList zipLists(LinkedList list1, LinkedList list2) throws Exception {
    if (list1.size() == 0 && list2.size() == 0) {
      throw new Exception("You can't zip two empty lists");
    } else if (list1.size() == 0)
      return list2;
    else if (list2.size() == 0)
      return list1;
    else {
      Node current = list1.head;
      Node current2 = list2.head;
      int length1 = list1.size();
      int length2 = list2.size();
      int counter = 0;

      while (current.getNext() != null) {
        list1.insertAfter(counter, current2.getData());
        if (current2.getNext() == null)
          break;
        else {
          current2 = current2.getNext();
          current = current.getNext().getNext();
          counter += 2;
        }
      }

      if (length2 >= length1)
        while (current2 != null) {
          list1.append(current2.getData());
          current2 = current2.getNext();
        }

      return list1;
    }
  }


  public Boolean insertAfter(int idx, String Data) {
    Node newNode = new Node(Data);
    if (head == null) {
      head = newNode;
      return true;
    } else {
      int idxCount = 0;
      Node current = head;
      while (current != null) {
        if (idxCount == idx) {
          newNode.setNext(current.getNext());
          current.setNext(newNode);
          idxCount++;
          break;
        }
        idxCount++;
        current = current.getNext();
      }
      return true;
    }
  }

  public LinkedList listReverser(LinkedList list1) {
    Node current = list1.head;
    LinkedList list2 = new LinkedList();
    if (list1.size() == 0) {
      System.out.println("(\"You can't reverse an empty list\")");

    } else {

    while (current != null) {
      list2.insert(current.getData());
      current=current.getNext();
    } }
    return list2;


  }

}

