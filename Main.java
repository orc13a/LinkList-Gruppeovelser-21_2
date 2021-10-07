class Main {
    public static void main(String[] args) {
        // opretter linklist objekt
        LinkedList coolList = new LinkedList();
        Queue coolQueue = new Queue();
        Stack coolStack = new Stack();

        System.out.println("\n#### Linked list ####");

        // tilføjer nodes til listen
        coolList.add(1);
        coolList.add(2);
        coolList.add(3);
        coolList.add(4);
        coolList.add(5);
        coolList.insert(800);
        coolList.insert(9);
        coolList.setSpaceValue(6, 7000);
        coolList.setSpaceValue(5, 7);
        coolList.getBiggestValue();
        coolList.getSmallestValue();

        // print fuktion kaldt
        coolList.print();

        // Queue
        System.out.println("#### Queue ####\n");

        // Tilføje numre til køen
        coolQueue.add(1);
        coolQueue.add(2);
        coolQueue.add(3);
        coolQueue.add(4);
        coolQueue.add(5);
        coolQueue.add(6);
        coolQueue.add(7);
        coolQueue.add(8);
        coolQueue.add(9);
        coolQueue.add(10);
        coolQueue.remove(); // Tager den "forerste" i køen ud af køen
        coolQueue.add(11);
        coolQueue.add(12);

        // printe.r køen ud
        coolQueue.print();

        // Stack
        System.out.println("#### Stack ####\n");

        coolStack.add(1);
        coolStack.add(2);
        coolStack.add(3);
        coolStack.add(4);
        coolStack.add(5);
        coolStack.add(6);
        coolStack.add(7);
        coolStack.add(8);
        coolStack.add(9);
        coolStack.add(10);
        coolStack.remove();
        coolStack.add(11);
        coolStack.add(12);

        coolStack.print();
    }
}
