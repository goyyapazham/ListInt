public interface ListInt {

    //appends new value to end of meaningful array
    void add(int newVal);

    //inserts new value at specified index, returns error if index out of range
    void add(int index, int newVal);

    //removes value at specified index
    void remove(int index);

    //returns size of meaningful array
    int size();

    //accessor (returns value at specified index)
    int get(int index);

    //mutator (modifies value at specified index; returns old value)
    int set(int index, int newVal);

}
