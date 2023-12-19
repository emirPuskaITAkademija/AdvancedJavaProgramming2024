package ba.smoki.three.product;

import java.util.Iterator;

/**
 * Zadaća:
 * Kreirati mogućnost unosa elemenata u container.
 * Modifikovati iterator na način da se može iterirati kroz elemente.
 * @param <E>
 */
public class Container<E> implements Iterable<E>{
    @Override
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    public void addElement(E e){

    }

    class ElementIterator implements Iterator<E>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
