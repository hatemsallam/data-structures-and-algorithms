/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

public class App {

    public static void main(String[] args) {

//      Stack stack = new Stack();
//
//      stack.push("H");
//      stack.push("A");
//      stack.push("T");
//      stack.push("E");
//      stack.push("M");
//
//      System.out.println(stack.peek());
//
//      stack.pop();
//      System.out.println(stack.peek());
//
//
//
//      Queue queue = new Queue();
//
//      queue.enqueue("H");
//      queue.enqueue("A");
//      queue.enqueue("T");
//      queue.enqueue("E");
//      queue.enqueue("M");
//
//      System.out.println(queue.peek());
//
//      queue.dequeue();
//      System.out.println(queue.peek());



//PseudoQueue queue1 = new PseudoQueue();
//
//queue1.enqueue("20");
//      queue1.enqueue("1");
//      queue1.enqueue("2");
//      queue1.enqueue("3");
//      queue1.enqueue("4");
//
//
//      System.out.println(queue1.dequeue());


//      AnimalShelter shelter = new AnimalShelter();
//      shelter.enqueue(new Animal("cat"));
//      shelter.enqueue(new Animal("dog"));
//      shelter.enqueue(new Animal("cat"));
//      shelter.enqueue(new Animal("dog"));
//
//      System.out.println(shelter.getDogs());


//ValidateBrackets validateBrackets = new ValidateBrackets();
//
//      System.out.println(validateBrackets.check("()"));

MaxValueStack stack = new MaxValueStack();

stack.push(5);
stack.push(10);
stack.push(15);
stack.push(2);

      System.out.println(stack.getMax());

stack.pop();
stack.pop();

      System.out.println(stack.getMax());


    }
}
