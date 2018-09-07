import java.util.LinkedList;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    int compareTo(ListItem item) {


        return 0;
    }

    @Override
    ListItem getNext() {
        return this.next;
    }

    @Override
    ListItem setNext(ListItem next) {
        this.next = next;
        return this.next;
    }

    @Override
    ListItem getPrevious() {
        return this.previous;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        this.previous = previous;
        return this.previous;
    }
}
