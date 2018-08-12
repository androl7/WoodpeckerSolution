import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        long[] listA = {1,2,3,4,5,5};
        long[] listB = {1,2,3,5,6,7};

        //print results
        ArrayList<ArrayList<Long>> resultsArray = convertLists(listA,listB);
        for(ArrayList<Long> array:resultsArray){
            System.out.println(array.toString());
        }

    }

    private static ArrayList<ArrayList<Long>> convertLists(long[] listA, long[] listB){

        //Convert Arrays to ArrayLists
        ArrayList<Long> arrayListA = new ArrayList<>();
        for(long aListA:listA){
            arrayListA.add(aListA);
        }

        ArrayList<Long> arrayListB = new ArrayList<>();
        for(long aListB:listB){
            arrayListB.add(aListB);
        }

        //1.
        ArrayList<Long> resultList1 = new ArrayList<>(arrayListB);

        for (Long aArrayListA : arrayListA) {
            resultList1.remove(aArrayListA);
        }

        //2.
        ArrayList<Long> resultList2 = new ArrayList<>(arrayListA);

        for (Long aArrayListB : arrayListB) {
            resultList2.remove(aArrayListB);
        }

        //3.
        ArrayList<Long> resultList3 = new ArrayList<>();

        for (Long aArrayListA : arrayListA) {
            if(arrayListB.contains(aArrayListA)&&!resultList3.contains(aArrayListA)){
                resultList3.add(aArrayListA);
            }
        }

        //add 3 arrayLists to returnArrayList
        ArrayList<ArrayList<Long>> returnArrayList = new ArrayList<>();
        returnArrayList.add(resultList1);
        returnArrayList.add(resultList2);
        returnArrayList.add(resultList3);

        return returnArrayList;
    }
}

