package libraryApp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;

public class Library {
    ArrayList<Books> booksCollection;
    Scanner s;
    public Library(){
        booksCollection = new ArrayList<Books>();
        s = new Scanner(System.in);
    }

    public void addBook(){
        System.out.print("Enter book title: ");
        String title = s.next();
        System.out.print("Enter book author: ");
        String author = s.next();
        System.out.print("Enter book subject: ");
        String subject = s.next();
        System.out.print("Enter book price: ");
        int price = s.nextInt();
        System.out.print("Enter book isbn: ");
        int isbn = s.nextInt();
        Books b = new Books(title, author, subject, price, isbn);
        booksCollection.add(b);

    }

    public void removeBook(){
        System.out.println("Book title : ");
        String title = s.next();
        for(int i = 0; i < booksCollection.size(); i++){
            Books b = booksCollection.get(i);
            if(booksCollection.get(i).getTitle().equals(title)){
                booksCollection.remove(b);
            }
        }
    }

    public void searchTitle(){
        System.out.println("Enter the title you want to search: ");
        String title = s.next();
        int flag = 0;
        for(int i = 0; i < booksCollection.size(); i++){
            Books b = booksCollection.get(i);
            if(b.getTitle().equals(title)){
                System.out.println(b.toString());
                flag =1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Sorry, we cannot find the title you have requested.");
        }
    }

    public void searchAuthor(){
        System.out.println("Enter the author you want to search: ");
        String author = s.next();
        System.out.println("These are the books the author you have requested written: ");
        boolean flag = false; // indicator int flag = 0;
        int i;
        for(i = 0; i < booksCollection.size(); i++){
            Books b = booksCollection.get(i);
            if(b.getAuthor().equals(author)){
                System.out.println(b.toString());
                flag = true; // flag = 1;
//                break; // if you find the author, break
            }
            /*
            1. Use indicator - flag indicator variable set it to 0. If you find the match, flag set to 1.
            2. else if condition
            3. method 3
             */
        }
        // Method -1 : check for flag
       if(flag == false){ // flag == 1
          System.out.println("Sorry, we cannot find the author you have requested.");
    }
        // Method-3
        // if i becomes 10, the entire loop is searched and cannot find the match
        if(i == booksCollection.size()){
            System.out.println("Sorry, we cannot find the author you have requested.");
        }
    }

    public void searchSubject(){
        System.out.println("Enter the subject you are interested in: ");
        String subject = s.next();
        int flag = 0;
        for(int i = 0; i < booksCollection.size(); i++){
            Books b = booksCollection.get(i);
            if(b.getSubject().equals(subject)){
                System.out.println("The subject is available.");
                System.out.println(b.toString());
                flag = 1;

            }
        }
        if(flag == 0){
            System.out.println("The subject is NOT available.");
        }
    }

    public void display(){
        System.out.println("Thanks for using our library service.");
        System.out.println(booksCollection.toString());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int choice;
        Library library = new Library();
        while(true){

            System.out.println("1. Add new book to collections\n2. Remove books from collection\n3.Search for book on the basis of title\n4.Search for books author wise\n5.Search for books subject wise\n6.Display all books\n7. Exit");
            System.out.println("Enter your choice: ");
            s = sc.next();
            System.out.println(s);
            if(Pattern.matches("\\D*", s)) { // * check for presence of 0 or non digits characters
                System.out.println("Enter valid option.");
                continue;
            }

//                choice = sc.nextInt();
            choice = Integer.parseInt(s);
                switch (choice){
                    case 1: library.addBook();
                        break;
                    case 2: library.removeBook();
                        break;
                    case 3: library.searchTitle();
                        break;
                    case 4: library.searchAuthor();
                        break;
                    case  5: library.searchSubject();
                        break;
                    case 6: library.display();
                        break;
                    case 7: System.exit(0);
                    default:
                        System.out.println("Enter the valid choice: ");
                }
            }


            }

        }

