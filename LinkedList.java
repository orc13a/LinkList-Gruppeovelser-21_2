class LinkedList {
    // første node i listen
    Node first;
    int biggestValue = 0;
    int smallestValue = Integer.MAX_VALUE;

    // print funktion
    public void print() {
        boolean listEnd = false;
        Node node = first;
        String result = "[";

        // Det følgende sker så længe vi ikke er noget enden af listen
        while (listEnd == false) {

            // checker om næsten node er sidste
            if (node.next == null) {
                result += (node.value + "]");
                listEnd = true;
            } else {
                // ligger node værdi til string
                result += (node.value + ", ");
            }

            // Går vidre til næsten node
            node = node.next;
        }

        // printer reslutat stringen ud
        System.out.println("\n" + result + "\n");
    }

    // funktion til at tilføje node til listen med en sat værdi
    public void add(int v) {
        Node n = new Node();
        n.value = v;

        if (first == null) {
            first = n;
            saveSmallestValue(v);
        } else {
            boolean listEnd = false;
            Node node = first;

            // Det følgende sker så længe vi ikke er noget enden af listen
            while (listEnd == false) {

                // checker om næste node er den sidste
                if (node.next == null) {
                    node.next = n;
                    saveBiggestValue(v);
                    saveSmallestValue(v);
                    // hvis ja slutter den listen
                    listEnd = true;
                } else {
                    // hvis nej så forsætter den.
                    node = node.next;
                }
            }
        }
    }

    // funktion til at indsætte node først i listen
    public void insert(int v) {
        // opret ny node.
        Node n = new Node();
        n.value = v;
        // sætter ny node værdi til første node værdi
        n.next = first;
        first = n;
        saveBiggestValue(v);
        saveSmallestValue(v);
    }

    // funktion til at finde sidste node.
    public Node getLast() {
        Node node = first;

        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    // Metode til at vælge en plads og ændre dens værdi
    public void setSpaceValue(int k, int value) {
        Node node = first;
        int index = 0;
        while (node != null) {
            if (index == k) {
                node.value = value;
                saveBiggestValue(value);
                saveSmallestValue(value);
                break;
            } else {
                index++;
                node = node.next;
            }

        }
    }

    public void saveBiggestValue(int value) {
        if (biggestValue < value) {
            biggestValue = value;
        }
    }

    public void getBiggestValue() {
        System.out.println("\nBiggest value: " + biggestValue);
    }

    public void saveSmallestValue(int value) {
        if (smallestValue > value) {
            smallestValue = value;
        }
    }

    public void getSmallestValue() {
        System.out.println("Smallest value: " + smallestValue);
    }
}
