package ArrayListTest;

public class ArrayList implements List {
    int count = 0;
    int [] elements = new int[count];

    @Override
    public  boolean isEmpty() {
        if (count  == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void add(int value, int i) {
        count++;
    }

    @Override
    public void remove(int value) {
        count--;
        if (count < 0){
            throw new IllegalArgumentException("index out of bound");
        }
    }

    @Override
    public int size() {
        return count;
    }


}
