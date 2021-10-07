class Main {
    public static void main(String[] args) {
        // opretter linklist objekt
        LinkedList coolList = new LinkedList();
        Queue coolQueue = new Queue();

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
        System.out.println("\n#### Queue ####\n");

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
        //coolQueue.add(11);

        coolQueue.remove();

        coolQueue.print();
    }
}
