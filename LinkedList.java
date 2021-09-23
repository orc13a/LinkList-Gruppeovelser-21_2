class LinkedList {
    Node first;

    public void print() {
        System.out.println("");

        Node link = first.next;
        System.out.print(first.value + ", ");

        while(link.next != null) {
            System.out.print(link.value + ", ");
            link = link.next;
        }

        System.out.println("");
    }
}
