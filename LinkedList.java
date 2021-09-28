class LinkedList {
    //første node i listen
    Node first;
    //print funktion
    public void print() {
        boolean listEnd = false;
        Node node = first;
        String result = "[";
        //Det følgende sker så længe vi ikke er noget enden af listen
        while (listEnd == false) {
            //checker om næsten node er sidste
            if (node.next == null) {
                result += (node.value + "]");
                listEnd = true;
            } else {
                //ligger node værdi til string
                result += (node.value + ", ");
            }
            //Går vidre til næsten node
            node = node.next;
        }
        //printer reslutat stringen ud
        System.out.println("\n" + result + "\n");
    }
    //funktion til at tilføje node til listen med en sat værdi
    public void add(int v){
      Node n = new Node();
      n.value = v;

      if (first == null) {
          first = n;
      } else {
          boolean listEnd = false;
          Node node = first;
          //Det følgende sker så længe vi ikke er noget enden af listen
          while (listEnd == false) {
              //checker om næste node er den sidste
              if (node.next == null) {
                  node.next = n;
                  //hvis ja slutter den listen
                  listEnd = true;
              } else {
                  //hvis nej så forsætter den.
                  node = node.next;
              }
          }
      }
    }
    //funktion til at indsætte node først i listen
    public void insert(int v){
      //opret ny node.
      Node n = new Node();
      n.value = v;
      //sætter ny node værdi til første node værdi
      n.next = first;
      first = n;

    }
    //funktion til at finde sidste node.
    public Node getLast(){
      Node node = first;

      while(node.next != null){
          node = node.next;
      }
      return node;
    }
}
