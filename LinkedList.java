class LinkedList {
    Node first;

    public void print() {
        boolean listEnd = false;
        System.out.println("");

        Node link = first.next;
        System.out.print("[" + first.value + ", ");

        while (listEnd == false) {
            if (link.next == null) {
                System.out.print(link.value + "]");
                listEnd = true;
            } else {
                System.out.print(link.value + ", ");
            }

            link = link.next;
        }

        System.out.println("");
        System.out.println("");
    }
}
