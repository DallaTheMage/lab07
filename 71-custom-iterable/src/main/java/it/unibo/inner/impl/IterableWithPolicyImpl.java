package it.unibo.inner.impl;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import it.unibo.inner.api.IterableWithPolicy;

public class IterableWithPolicyImpl<T> implements IterableWithPolicy<T> {

    private List<T> array;
    private int index;

    public IterableWithPolicyImpl (final T[] array) {
        this.array = List.of(array);
        this.index = 0;
    } 

    public Iterator<T> iterator() {
       return new InnerIterator();
    }

    public void setIterationPolicy(Predicate<T> filter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIterationPolicy'");
    }
    
    class InnerIterator implements Iterator<T> {
        
        public boolean hasNext() {
            return index < array.size();
        }

        public T next() {
            return array.get(index++);
        }

    }
    
}
