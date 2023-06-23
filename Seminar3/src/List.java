public class List {
    static Node head;

    static class Node{
        int value;
        Node next;
    }

    // добавление в начало
    public void pushFront(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    // удаление с начала списка
    public void popFront(){
        if(head != null){
            head = head.next;
        }
    }

    // печать списка
    public void print(){
        Node cur = head;
        while (cur != null){
            System.out.printf("%d", cur.value);
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

        if(head == null){
            head = node;
        } else {
            Node cur = head;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    // удаление в конце списка
    public void popBack(){
        if(head != null){
            if(head.next == null){
                head = null;
            } else {
                Node cur = head;
                while (cur.next.next != null){
                    cur = cur.next;
                }
                cur.next = null;
            }
        }
    }
}

