import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> q=new MyQueue<>(3);

        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println("заполненная очередь");

        q.dequeue();
        q.dequeue();
        q.display();
        System.out.println("Очередь после удаления");

        q.add(4);
        q.add(5);
        q.display();
        System.out.println("очередь после обратного заполнения");

        q.clear();
        q.add(6);
        q.add(7);
        q.add(8);
        q.display();
        System.out.println("удаления и создание новой очереди того же размера");


    }
}