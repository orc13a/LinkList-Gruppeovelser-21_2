class LinkedList {
    Node first;

    public void print() {
        boolean listEnd = false;
        Node node = first;
        String result = "[";

        while (listEnd == false) {
            if (node.next == null) {
                result += (node.value + "]");
                listEnd = true;
            } else {
                result += (node.value + ", ");
            }

            node = node.next;
        }

        System.out.println("\n" + result + "\n");
    }

    public void add(int v){
      Node n = new Node();
      n.value = v;

      if (first == null) {
          first = n;
      } else {
          boolean listEnd = false;
          Node node = first;

          while (listEnd == false) {
              if (node.next == null) {
                  node.next = n;
                  listEnd = true;
              } else {
                  node = node.next;
              }
          }
      }
    }
}
