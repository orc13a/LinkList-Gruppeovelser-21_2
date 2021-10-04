class Main {
    public static void main(String[] args) {
        //opretter linklist objekt
        LinkedList coolList = new LinkedList();

        //tilføjer nodes til listen
        coolList.add(1);
        coolList.add(2);
        coolList.add(3);
        coolList.add(4);
        coolList.add(5);
        coolList.insert(9);
        coolList.setSpaceValue(5,7);
        coolList.getBiggestValue();
        //print fuktion kaldt
        coolList.print();
    }
}
