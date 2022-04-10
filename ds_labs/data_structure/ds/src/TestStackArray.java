
import ds.stacks.StackArray;

public class TestStackArray {
    public static void main(String[] args) {
        // Declare a stack of maximum size 4
        StackArray myStackArray = new StackArray(4);

        assert myStackArray.isEmpty();
        assert !myStackArray.isFull();

        // Populate the stack
        myStackArray.push(5);
        myStackArray.push(8);
        myStackArray.push(2);
        myStackArray.push(9);

        assert !myStackArray.isEmpty();
        assert myStackArray.isFull();
        assert myStackArray.peek() == 9;
        assert myStackArray.pop() == 9;
        assert myStackArray.peek() == 2;
        assert myStackArray.size() == 3;
    }

}
