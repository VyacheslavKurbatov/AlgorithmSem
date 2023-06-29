import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tree {
    Node root;

    public class Node{
        int value;
        List<Node> children;
    }
    public boolean exist(int value){
        if (root != null){
            Node node = findDepth(root, value);
            if (node != null){
                return true;
            }
        }
        return false;
    }

    // Поиск с обходом в глубину
    private Node findDepth(Node node, int value){
        if (node.value == value){
            return node;
        } else {
            for (Node child : node.children){
                Node result = findDepth(child, value);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    // Поиск с обходом в ширину
    private Node findWidth(int value){
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0){
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line){
                if (node.value == value){
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }
}
