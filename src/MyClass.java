import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.*/
public class MyClass {
    private LinkedList list;

    MyClass(LinkedList cap){
        list = new LinkedList<>(cap);
    }

    void enqueue(LinkedList list, int x){
        list.addLast(list.get(x));
        list.remove(x);

    }

    void dequeue(LinkedList list){
        System.out.println(list.peekFirst());
        list.removeFirst();
    }

    void first(LinkedList list){
        System.out.println(list.getFirst());
    }
}
