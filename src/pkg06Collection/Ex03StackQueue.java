package pkg06Collection;

import java.util.*;

public class Ex03StackQueue {
    public static void main(String[] args) {
        //Stack은 후입선출 LIFO
        Stack stack = new Stack();
        stack.push(0);stack.push(1);stack.push(2);
        System.out.println(stack);
        System.out.println(stack.size()); //스택 사이즈
        System.out.println(stack.contains(1)); //스택에 그 값이 포함되어있는가
        System.out.println(stack.pop()); //마지막 인덱스에 있는 데이터 삭제
        System.out.println(stack.size());
        System.out.println(stack.peek()); //다음 꺼낼 데이터 확인
        System.out.println(stack.empty()); //스택이 비었는지 안비었는지 확인

        //Queue는 선입선출 FIFO
        Queue q = new LinkedList();
        q.offer("a"); q.offer("b");q.offer("c"); //큐에 값 추가
        System.out.println(q);
        System.out.println(q.poll()); //0번 인덱스에 있는 값 삭제
        System.out.println(q.peek()); //다음 꺼낼 데이터 확인

        //
        Vector v = new Vector();
        v.add(0);v.add(1);v.add(2);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        e = v.elements();

        Iterator it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        it = v.iterator();
    }
}
