public class Stack {
    private int arrayDefLen = 10;
    int[] array = new int[arrayDefLen];
    int arrayLength = 0;

    // Kigger om stacken er fuld
    private boolean isFull() {
        if (arrayLength == arrayDefLen) {
            System.out.println("==> The stack is full");
            return true;
        } else {
            return false;
        }
    }

    // Tilføj til stacken
    public void add(int v) {
        if (!isFull()) {
            pushStackDown();
            array[0] = v;
            arrayLength++;
        }
    }

    // Fjern fra stacken
    public void remove() {
        pushStackUp();
        array[arrayLength - 1] = 0;
        arrayLength--;
    }

    // Skub alle værdierne ned
    private void pushStackDown() {
        for (int i = arrayLength; i > -1; i--) {
            // Hvis vi er ved slutningen af køen
            if (i == arrayDefLen - 1) {
                array[i] = array[i - 1];
            } else {
                array[i + 1] = array[i];
            }
        }
    }

    // Skub alle værdierne op
    private void pushStackUp() {
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
    }

    // Skriver køen ud
    public void print() {
        System.out.println("\n+-+");

        for (int i = 0; i < array.length; i++) {
            System.out.println("|" + array[i] + "|");
        }
        // System.out.println(arrayLength);
        System.out.println("+-+");
    }
}
