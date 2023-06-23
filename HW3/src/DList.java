public class DList {
    static Node head;
    static Node tail;
    static class Node{
        int value;
        Node next;
        Node prev;
    }

    // добавление в начало
    public void pushFront(int value){
        Node node = new Node();
        node.value = value;

        if(head == null){
            tail = node;
        } else {
            node.next = head;
            head.prev = node;

        }
        head = node;

    }

    // удаление с начала списка
    public void popFront(){
        if(head != null){
            if(head.next == null){
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    // печать списка
    public void print(){
        Node cur = head;
        while (cur != null){
            System.out.printf("%d ", cur.value);
            cur = cur.next;
        }
        System.out.println();
    }

    // поиск вхождения в список
    public static boolean contains(int value){
        Node cur = head;
        while (cur != null){
            if(cur.value == value){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // добавление в конец
    public void pushBack(int value){
        Node node = new Node();
        node.value = value;

        if(tail == null){
            head = node;
        } else {
            node.prev = tail;
            tail.next = node;
        }
        tail = node;
    }

    // удаление в конце списка
    public void popBack(){
        if(tail != null){
            if(tail.prev == null){
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    public void sort(){
        boolean needSort = true;
        do{
            needSort = false;
            Node node = head;
            while(node != null && node.next != null){
                if(node.value > node.next.value){
                    Node before = node.prev;
                    Node cur = node;
                    Node next = node.next;
                    Node after = next.next;

                    cur.next = after;
                    cur.prev = next;
                    next.next = cur;
                    next.prev = before;

                    if(before != null){
                        before.next = next;
                    } else {
                        head = next;
                    }

                    if (after != null){
                        after.prev = cur;
                    } else {
                        tail = cur;
                    }

                    needSort = true;
                }
                node = node.next;
            }
        } while (needSort);
    }

    //разворот списка
    public void revert(){
        Node cur = head;
        while (cur != null){
            Node next = cur.next;
            Node previous = cur.prev;
            cur.next = previous;
            cur.prev = next;
            if (previous == null){
                tail = cur;
            }
            if (next == null){
                head = cur;
            }
            cur = next;
        }
    }
}
