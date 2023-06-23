public class Main {
    public static void main(String[] args) {
//        List list = new List();
//        for (int i = 1; i <= 5 ; i++) {
//            list.pushFront(i);
//        }
//
//        list.print();
//
//        list.popFront();
//        list.popFront();
//
//        list.print();
//
//        list.pushBack(7);
//
//        list.print();
//
//        list.popBack();
//
//        list.print();
        dList dlist = new dList();
        for (int i = 1; i <= 10 ; i++) {
            dlist.pushFront(i);
        }

        dlist.sort();
        dlist.print();
    }
}
