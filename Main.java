import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        long[] listA = {1,2,3,4,4,5,5};
        long[] listB = {1,2,3,5,6,7};

        //print results
        ArrayList<ArrayList<Long>> resultsArray = convertLists(listA,listB);
        for(ArrayList<Long> array:resultsArray){
            System.out.println(array.toString());
        }

    }

    private static ArrayList<ArrayList<Long>> convertLists(long[] listA, long[] listB){

        //Convert Arrays to ArrayLists without duplicates
        //A
        Set<Long> arrayListAWithoutDuplicates = new LinkedHashSet<>();

        for(long aListA:listA){
            arrayListAWithoutDuplicates.add(aListA);
        }

        ArrayList<Long> arrayListA = new ArrayList<>(arrayListAWithoutDuplicates);

        //B
        Set<Long> arrayListBWithoutDuplicates = new LinkedHashSet<>();

        for(long aListB:listB){
            arrayListBWithoutDuplicates.add(aListB);
        }

        ArrayList<Long> arrayListB = new ArrayList<>(arrayListBWithoutDuplicates);


        //1.
        ArrayList<Long> resultList1 = new ArrayList<>(arrayListB);

        resultList1.removeAll(arrayListA);

        //2.
        ArrayList<Long> resultList2 = new ArrayList<>(arrayListA);

        resultList2.removeAll(arrayListB);

        //3.
        ArrayList<Long> resultList3 = new ArrayList<>(arrayListA);

        resultList3.retainAll(arrayListB);


        //add 3 arrayLists to returnArrayList
        ArrayList<ArrayList<Long>> returnArrayList = new ArrayList<>();
        returnArrayList.add(resultList1);
        returnArrayList.add(resultList2);
        returnArrayList.add(resultList3);

        return returnArrayList;
    }

}

