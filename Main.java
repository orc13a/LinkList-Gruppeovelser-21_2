
class Main {
  public static void main(String[] args) {

  }

  Node n1 = new Node();
  Node n2 = new Node();
  Node n3 = new Node();
  n1.value = 1;
  n1.next = n2;
  n2.value = 2;
  n2.next = n3;
  n3.value = 3;
  n3.next = null;

}
