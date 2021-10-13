package stack.and.queue;

public class MaxValueStack {
  Stack<Integer> stack = new Stack<>();
Stack<Integer> maxStack = new Stack<>();

public void push(int num) {
  int max = num;
  if(!maxStack.isEmpty()&& max <maxStack.peek()) {
    max = maxStack.peek();
  }
  stack.push(num);
  maxStack.push(max);
}

public void pop() {
  stack.pop();
  maxStack.pop();
}

public int getMax() {
  if (maxStack.isEmpty()) {
    System.out.println("Stack is Empty");
    return 0;
  }
  return maxStack.peek();
}

}
