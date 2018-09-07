public abstract class ListItem {
    protected Object value;
    protected ListItem next = null;
    protected ListItem previous = null;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract int compareTo(ListItem item);

    abstract ListItem getNext();

    abstract ListItem setNext(ListItem next);

    abstract ListItem getPrevious();

    abstract ListItem setPrevious(ListItem previous);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
