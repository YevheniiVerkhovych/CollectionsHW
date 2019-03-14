package ArrayList;

import java.util.Iterator;


public class MyArrayList<E> implements Simple<E> {

    public static void main(String[] args) {
        Simple<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");

        for (String s : strings) {
            System.out.println(s);
        }
    }

    private E[] values;

    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try{
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0 , index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(
                    temp, index + 1, values, index, amountElemAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {

        return values.length;
    }

    @Override
    public void update(int index, E e) {

    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
