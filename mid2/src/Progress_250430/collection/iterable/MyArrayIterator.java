package Progress_250430.collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {
    private int currentIndex = -1;
    private int[] tatgetArr;

    public MyArrayIterator(int[] tatgetArr) {
        this.tatgetArr = tatgetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < tatgetArr.length -1;
    }

    @Override
    public Integer next() {
        return tatgetArr[++currentIndex];
    }
}
