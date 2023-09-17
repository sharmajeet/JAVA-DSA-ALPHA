import java.util.ArrayList;

public class Scratch_stack {
    public static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty()
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        stack s = new stack();
        s.push(20);
        s.push(2);
        s.push(40);
        s.push(60);
        s.push(27);
        s.push(26);
        s.push(24);
        s.push(28);
        s.push(45);
        s.push(67);
        s.push(64);

        while (!s.isEmpty()) {

            System.out.println(s.peek());
            s.pop();
        }

    }
}