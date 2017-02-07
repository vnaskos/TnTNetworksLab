package com.ourwork.tntnetworkslab.core.io;

/**
 *
 * @author Vasilis Naskos
 */
public class IOArray implements IOItem {
    
    private final IOItem[] items;
    private int currentIndex;
    
    public IOArray(IOItem[] items) {
        this.items = items;
        this.currentIndex = 0;
    }
    
    @Override
    public IOItem next() {
        return items[currentIndex++];
    }
}
