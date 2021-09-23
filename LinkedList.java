class LinkedList {
    Node first;

    //Metode der printer værdierne af vores nodes i vores liste
    public void print() {
        boolean listEnd = false;
        System.out.println("");

        //link variablen holder den næste node i listen
        Node link = first.next;

        //Her printes første node værdi
        System.out.print("[" + first.value + ", ");

        //Et while loop, som tjekker om vi er nået ved enden af listen
        while (listEnd == false) {
            //if statement som tjekker om vi er ved den sidste node i listen
            if (link != null && link.next == null) {
                System.out.print(link.value + "]");
                listEnd = true;
            } else if (link != null) {
                System.out.print(link.value + ", ");
            }

            //Det der gør at vi går videre i listen
            if (link.next != null) {
                link = link.next;
            }
        }

        System.out.println("");
        System.out.println("");
    }

    public void add(int v){
      Node n = new Node();
      n.value = v;

      if(first == null){
        first = n;

      } else {
        boolean listEnd = false;
        Node link = first.next;
        while(listEnd == false){
          if(link.next == null){
            link.next = n;
          } else {
            link = link.next;
          }
        }
      }
    }
}
