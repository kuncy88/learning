package hu.kuncystem.designpattern.iterator;

/**
 * Class Comment
 *
 * @author Csaba Kun <kuncy88@gmail.com>
 * @date Aug 18, 2018
 *  
 * @version 1.0
 */
public class NameRepository implements Container{
    public String names[] = {"user1", "user2", "user3", "user4", "user5"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    
    private class NameIterator implements Iterator{
        int index = 0;
        
        @Override
        public boolean hasNext() {
            if(index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return names[index++];
            }
            return null;
        }
        
    }
}
