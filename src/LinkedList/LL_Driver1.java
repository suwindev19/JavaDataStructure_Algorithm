package LinkedList;

public class LL_Driver1 {
    public static void main(String[] args) {
        LL_List1<Integer> list = new LL_LinkedList1<>();
        list.insert(10);
        list.insert(-2);
        list.insert(9);
        list.insert(100);

        LL_List1<String> cities = new LL_LinkedList1<>();
        cities.insert("Osaka");
        cities.insert("Tokyo");
        cities.insert("Nagoya");
        cities.insert("Gufi");

//        System.out.println(cities.size());
//        cities.traverseList();

        LL_List1<Person> persons = new LL_LinkedList1<Person>();

        Person p = new Person(11, "Lyla");

        persons.insert(new Person(10, "Kimi"));
        persons.insert(new Person(12, "John"));
        persons.insert(new Person(11, "liLi"));
        persons.insert(new Person(11, "Sansu"));

        persons.size();
        persons.insert(p);
        persons.traverseList();
        persons.remove(p);


    }
}
