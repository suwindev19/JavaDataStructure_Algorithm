package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();

        addCitiesInOrder(cities, "Sydney");
        addCitiesInOrder(cities, "Melbourne");
        addCitiesInOrder(cities, "Brisbane");
        addCitiesInOrder(cities, "Perth");
        addCitiesInOrder(cities, "Canberra");
        addCitiesInOrder(cities, "Adelaide");
        addCitiesInOrder(cities, "Darwin");
        addCitiesInOrder(cities, "Towoonba");



        addCitiesInOrder(cities, "Alice Springs");
        addCitiesInOrder(cities, "Darwin");
        printCitiesList(cities);
        visit(cities);

    }

    private static void printCitiesList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }

        System.out.println("Thanks for visiting Australia.\n===========================");
    }

    private static boolean addCitiesInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparision = stringListIterator.next().compareTo(newCity);
            if (comparision == 0) {
                // cities are equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparision > 0) {
                // new city should appear before this one
                // Brisbane -> If adelaide as a parameter
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0) {
                // move on to the next city , brisbane does not come before adelaide
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No city in the itenerary");
            return;
        }else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the cities list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }

        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                " 1 - go to next city\n"+
                " 2 - go to previous city\n"+
                " 3 - print menu options");
    }

}
