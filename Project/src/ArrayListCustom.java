public class ArrayListCustom<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENTDATA = {};
    private int size = 0 ;
    Object[] elementData;

    public ArrayListCustom() {
        this.elementData = DEFAULT_CAPACITY_EMPTY_ELEMENTDATA;
    }

    public ArrayListCustom(int initialCapacity) {
        if (initialCapacity > 0){
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Указан неверный размер: "+ initialCapacity);
        }
    }
    public int getSize(){
        return size;
    }
    /*public void add(E element){
        if
    }*/

}
