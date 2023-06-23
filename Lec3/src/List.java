import org.w3c.dom.Node;

public class List {
    Node head;

    //поиск в списке
    public Node find(int value){
        Node currentNode = head;
        while (currentNode != null){
            if(currentNode.value == value){
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    //разворот списка
    public void revert(){
        if (head != null && head.next != null){
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }
    private void revert(Node currentNode, Node previousNode){
       if (currentNode.next == null){
           head = currentNode;
       } else {
           revert(currentNode.next, currentNode);
       }
       currentNode.next = previousNode;
    }

    //стек
    //добаление
    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    //извлечение
    public Integer pop(){
        Integer result = null;
        if (head != null){
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public class Node{
        int value;
        Node next;
    }
}
