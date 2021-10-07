public class Queue {
    int arrayDefLen = 10;
    int[] array = new int[arrayDefLen];
    int arrayLength = 0;

    public boolean isFull() {
        if (arrayLength == arrayDefLen) {
            System.out.println("\n==> The array is full\n");
            return true;
        } else {
            return false;
        }
    }

    public void add(int v) {
        if (!isFull()) {
            pushQueue(v);
        }
    }

    public void remove() {
        array[arrayLength - 1] = 0;
        arrayLength--;
        pushQueue(0);
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
