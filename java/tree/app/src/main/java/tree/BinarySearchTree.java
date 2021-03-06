package tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> {
  private BinaryNode<T> root;


  public Boolean isEmpty() {
    return root==null;
  }


  public void add(T data) {
    if (isEmpty()) {
      root = new BinaryNode<>(data);
    } else {
      addHelper(data,root);
    }
  }

  private void addHelper(T data, BinaryNode<T> root) {
    BinaryNode<T> newBinaryNode = new BinaryNode<>(data);
    if(data.compareTo(root.getData())<0) {
      if(root.getLeftNode() == null) {
        root.setLeftNode(newBinaryNode);
      }
      else {
        addHelper(data,root.getLeftNode());
      }
    } else if (data.compareTo(root.getData())>0) {
      if (root.getRightNode() == null) {
        root.setRightNode(newBinaryNode);
      } else {
        addHelper(data,root.getRightNode());
      }
    }
  }

  public Boolean contain(T data) {
    if (isEmpty()) {
      return false;
    } else {
      return containHelper(data,root);
    }
  }

  private Boolean containHelper(T data,BinaryNode<T> root){
if(root == null) {
  return false;
}
if (data.compareTo(root.getData())==0) {
  return true;
} else if (data.compareTo(root.getData())>0) {
  return containHelper(data,root.getRightNode());
    } else  {
  return containHelper(data,root.getLeftNode());
    }
  }


  public T getMax() throws Exception{
    if (root==null) {
      throw new Exception("Tree is empty");
    } else {
      return getMaxHelper(root);
    }
  }

  private T getMaxHelper(BinaryNode<T> root ) {
if (root.getRightNode()==null) {
  return root.getData();
} else {
  return getMaxHelper(root.getRightNode());
}
  }



  public List<Integer> breadthFirst(BinarySearchTree<T> tree){
    if(root==null) {return null;}
    Queue<BinaryNode<T>>queue = new Queue<>();
    List<Integer> list = new ArrayList<>();
    queue.enqueue(root);
    list.add((Integer) root.getData());
    while (!queue.isEmpty()){
      try {
        BinaryNode<T> node = queue.dequeue();
        if(node.getLeftNode()!=null){
          queue.enqueue(node.getLeftNode());
          list.add((Integer) node.getLeftNode().getData());
        }if(node.getRightNode()!=null){
          queue.enqueue(node.getRightNode());
          list.add((Integer) node.getRightNode().getData());
        }
      }catch (Exception e){e.printStackTrace();}
    }
    return list;
  }

public  int sumOfOdds() {
    int sum = 0 ;
  if(root==null) {return 0;}
  Queue<BinaryNode<T>>queue = new Queue<>();
  List<Integer> list = new ArrayList<>();
  queue.enqueue(root);
  list.add((Integer) root.getData());
  while (!queue.isEmpty()){
    try {
      BinaryNode<T> node = queue.dequeue();
      if(node.getLeftNode()!=null){
        queue.enqueue(node.getLeftNode());
        list.add((Integer) node.getLeftNode().getData());
      }if(node.getRightNode()!=null){
        queue.enqueue(node.getRightNode());
        list.add((Integer) node.getRightNode().getData());
      }

    }catch (Exception e){e.printStackTrace();}
  }
  for(int i =0 ;i<list.size();i++) {
    if (list.get(i) %2!=0) {
      sum+=list.get(i);
    }
  }
  return sum;

}



}
