public class Queue {
    // opstilles de globle variabler
    // arrayDefLen bestemmer vores arrays max længde.
    int arrayDefLen = 10;
    int[] array = new int[arrayDefLen];
    int arrayLength = 0;
    boolean removed = false;

    // Metode der tjekker om arrayen er fuld.
    private boolean isFull() {
        if (arrayLength == arrayDefLen) {
            System.out.println("==> The array is full");
            return true;
        } else {
            return false;
        }
    }

    // metode til at tilføje et nummer til køen, hvis arrayen ikke er fuld
    public void add(int v) {
        if (!isFull()) {
            if (removed) {
                array[0] = v;
            } else {
                pushQueue(v);
            }
        }
        removed = false;
    }

    // Metode
    public void remove() {
        removed = true;
        if (isFull()) {
            arrayLength--;
            pushQueue(0);
            arrayLength--;
        } else {
            array[arrayLength - 1] = 0;
            arrayLength--;
        }
    }

    private void pushQueue(int v) {
        for (int i = arrayLength; i > -1; i--) {
            if (i == arrayDefLen - 1) {
                array[i] = array[i - 1];
            } else {
                array[i + 1] = array[i];
            }
        }
        array[0] = v;
        arrayLength++;
    }

    public void print() {
        String result = "\n[";

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                result += array[i] + "]\n";
            } else {
                result += array[i] + ", ";
            }
        }
        
        System.out.println(result);
    }
}
