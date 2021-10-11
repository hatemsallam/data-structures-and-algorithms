package interfaces;

public interface Queue<G> {
  void enqueue(G data);
  G dequeue();
}
