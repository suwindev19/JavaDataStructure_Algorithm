package libraryApp;

import java.util.ArrayList;
import java.util.Scanner;

public class A_0_StudySession {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 color names: ");
        for(int i = 0; i < 5; i++){
            String s = sc.next();
            colors.add(s);
        }
        System.out.println("Enter the color name to be search: ");
        String colourSearch = sc.next();
        int j;
        int flag = 0;
        for(j = 0; j < colors.size(); j++){
            if(colourSearch.equals(colors.get(j))){
                System.out.println("Found at the position " + (j+1));
                flag = 1;
                break;
            }


            //else if( j == colors.size()-1){
             //   System.out.println("Not Found");
            //}
        }
//        if(j == colors.size()){
//            System.out.println("Not found");
//        }

        if(flag == 0){
            System.out.println("Not found");
        }


    }

    // Write a java program to create a list of String values and search if a particular string exitst in the list or not
    private static void searchString(){

    }
}
