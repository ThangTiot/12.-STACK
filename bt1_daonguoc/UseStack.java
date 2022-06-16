package bt1_daonguoc;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        System.out.println(list);
        Stack<Integer> listNew = new Stack<>();
        while (list.size() != 0) {
            listNew.push(list.pop());
        }
        System.out.println(listNew);
    }
}
