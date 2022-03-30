import ds.stacks.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        s.print();
        s.pop();
        s.print();
        s.pop();
        s.print();
        s.pop();
        s.print();
        s.pop();
        s.print();
        s.push("A");
        s.print();
        s.push("B");
        s.print();
        s.push("C");
        s.print();
        s.push("D");
        s.print();
        System.out.println("===============================");
        Stack<Integer> s2 = new Stack<Integer>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        s2.print();
        s2.pop();
        s2.print();
        s2.pop();
        s2.print();
        s2.pop();
        s2.print();
        s2.pop();
        s2.print();
        s2.push(1);
        s2.print();
        s2.push(2);
        s2.print();
        s2.push(3);
        s2.print();
        s2.push(4);
        s2.print();
    }
}
