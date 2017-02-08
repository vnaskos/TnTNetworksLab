package com.ourwork.tntnetworkslab.core.io;

/**
 *
 * @author Vasilis Naskos
 * @param <T>
 */
public class IONumeric<T> implements IOItem {
    
    protected T value;

    public IONumeric(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }

    public int getInt() {
        return Integer.parseInt(value.toString());
    }
    
    public float getFloat() {
        return Float.parseFloat(value.toString());
    }
    
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public IOItem next() {
        return this;
    }
}
