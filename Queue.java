public class Queue {
    //opstilles de globle variabler
    // arrayDefLen bestemmer vores arrays max længde.
    int arrayDefLen = 10;
    int[] array = new int[arrayDefLen];
    int arrayLength = 0;

    //Metode der tjekker om arrayen er fuld.
    public boolean isFull() {
        if (arrayLength == arrayDefLen) {
            System.out.println("\n==> The array is full\n");
            return true;
        } else {
            return false;
        }
    }
    //metode til at tilføje et nummer til køen, hvis arrayen ikke er fuld
    public void add(int v) {
        if (!isFull()) {
            pushQueue(v);
        }
    }
    //Metode
    public void remove() {
        //tager den sidste plads i arrayen og sætter værdien til nul
        array[arrayLength - 1] = 0;
        arrayLength --;
        pushQueue(0);
        arrayLength --;

    }

    public void pushQueue(int v) {
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
        String result = "[";

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                result += array[i] + "]";
            } else {
                result += array[i] + ", ";
            }
        }

        System.out.println(result);
    }
}
