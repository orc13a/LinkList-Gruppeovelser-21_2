class LinkedList {
    Node first;

    public void print() {
      boolean listEnd = false;
        System.out.println("");

        Node link = first.next;
        System.out.print(first.value + ", ");

        while(listEnd == false) {
            System.out.print(link.value + ", ");
            try{
              link = link.next;
              if(link.next != null){
                listEnd = true;
              }

            } catch(Exception e) {
              link.next = null;

            }

        }

        System.out.println("");
    }
}
