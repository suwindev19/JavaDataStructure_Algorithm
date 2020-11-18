package DataStructure_CourseNotes.week1.LinkedLIst;

public class App {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
//        list.insert("Japan");
//        list.insert("Nagoya");
//        list.insert("Okinawa");
//        list.insert("Sapporo");
//        System.out.println("List size : " + list.size());
//
//        list.remove("Sapporo");
//
//        System.out.println("Traversing the list");
//        System.out.println("===================");
//        list.traverseList1();
//-------------------------------------------------------------------
//        List<Integer> number = new LinkedList<Integer>();
//        number.insert(10);
//        number.insert(-3);
//        number.insert(100);
//        number.insert(3);
//        number.insert(40);
//
//        System.out.println("Number size : " + number.size());
//        number.remove(-3);
//        number.traverseList1();
//-------------------------------------------------------------------

        List<Person> person = new LinkedList<Person>();

        Person p = new Person(14, "Lily");


        person.insert(new Person(10, "Adam"));
        person.insert(new Person(9, "Hanako"));
        person.insert(new Person(12, "Eli"));
        person.insert(new Person(14, "Lily"));

        System.out.println(person.size());
        person.traverseList1();
        System.out.println();
        person.remove(p);
        person.traverseList1();





    }
}
