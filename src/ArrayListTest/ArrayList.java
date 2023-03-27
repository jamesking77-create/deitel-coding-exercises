package ArrayListTest;

public class ArrayList implements List {
    int count;
    int [] elements = new int[count];

    @Override
    public  boolean isEmpty() {
        return count == 0;
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

    @Override
    public int get(int count) {
        return count;
    }


}
