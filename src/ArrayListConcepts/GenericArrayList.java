package ArrayListConcepts;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {

        // Generic , only that particular data type, use wrapper , autoboxing and upcasting
        ArrayList<Integer> marksList = new ArrayList<Integer>();
        marksList.add(98);
        marksList.add(87);

        ArrayList<Double> marksListDouble= new ArrayList<Double>();
        marksListDouble.add(12.0);

        ArrayList<String> marksListString = new ArrayList<String>();

    }
}
