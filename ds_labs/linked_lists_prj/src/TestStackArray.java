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

        System.out.println(myStackArray.size());
        System.out.println(myStackArray.isFull());
        System.out.println(myStackArray.peek());
        System.out.println(myStackArray.size());

        System.out.println(myStackArray.pop());
        System.out.println(myStackArray.size());

        System.out.println(myStackArray.isEmpty());
        System.out.println(myStackArray.pop());
        System.out.println(myStackArray.pop());
        System.out.println(myStackArray.pop());

        //System.out.println(myStackArray.pop());

         myStackArray.push(5);
        myStackArray.push(8);
        myStackArray.push(2);
        myStackArray.push(9);
        myStackArray.push(10);

        System.out.println(myStackArray.size());


    }
}
