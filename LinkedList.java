class LinkedList {
    Node first;

    public static void main(String[] args) {
    }

    public static void print(){
      //  System.out.println("hey");
        Node link = first.next;
        System.out.print(first.value + ", ");
        while(link.next != null){
        System.out.print(link.value + ", ");
        link = link.next;
    }
}
