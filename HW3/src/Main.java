public class Main {
    public static void main(String[] args) {
        DList dlist = new DList();
        for (int i = 1; i <= 10 ; i++) {
            dlist.pushBack(i);
        }

        dlist.print();
        dlist.revert();
        dlist.print();
    }
}
