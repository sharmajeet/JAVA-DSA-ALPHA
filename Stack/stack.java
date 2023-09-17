import java.util.ArrayList;

public class stack {
    public static class stack1 {
        // declare static Arraylist
        static ArrayList<Character> list = new ArrayList<>();

        // isEmpty()
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push()
        public static void push(Character data) {
            list.add(data);
        }

        // pop()
        public static Character pop() {
            Character top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek()
        public static Character peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        stack1 s1 = new stack1();
        s1.push('t');
        s1.push('e');
        s1.push('e');
        s1.push('j');

        while (!s1.isEmpty()) {
            System.out.print(s1.peek() + " ");
            s1.pop();

        }

    }
}
