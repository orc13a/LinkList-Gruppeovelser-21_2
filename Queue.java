public class Queue {
    // Opstilles de globle variabler
    // ArrayDefLen bestemmer vores arrays max længde.
    private int arrayDefLen = 10;
    int[] array = new int[arrayDefLen];
    int arrayLength = 0;
    private boolean removed = false;

    // Metode der tjekker om arrayen er fuld.
    private boolean isFull() {
        if (arrayLength == arrayDefLen) {
            System.out.println("==> The queue is full");
            return true;
        } else {
            return false;
        }
    }

    private boolean isFullRemove() {
        if (arrayLength == arrayDefLen) {
            // System.out.println("==> The array is full");
            return true;
        } else {
            return false;
        }
    }

    // Metode til at tilføje et nummer til køen, hvis arrayen ikke er fuld
    public void add(int v) {
        if (!isFull()) {
            if (removed) {
                array[0] = v;
            } else {
                pushQueue(v);
            }
        }
        removed = false;
        arrayLength++;
    }

    // Metode der fjerner fra køen
    public void remove() {
        removed = true;
        if (isFullRemove()) {
            arrayLength--;
            pushQueue(0);
        } else {
            array[arrayLength - 1] = 0;
            arrayLength--;
        }
    }

    // Rykker køen mod højre
    private void pushQueue(int v) {
        // Vi starter bagfra i køen
        for (int i = arrayLength; i > -1; i--) {
            // Hvis vi er ved slutningen af køen
            if (i == arrayDefLen - 1) {
                array[i] = array[i - 1];
            } else {
                array[i + 1] = array[i];
            }
        }

        array[0] = v;
    }

    // Skriver køen ud
    public void print() {
        String result = "\n[";

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                result += array[i] + "]\n";
            } else {
                result += array[i] + ", ";
            }
        }
        // System.out.println(arrayLength);
        System.out.println(result);
    }
}
