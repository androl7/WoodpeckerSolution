import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        long[] listA = {1,2,3,4,5};
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
        ArrayList<Long> result1 = new ArrayList<>(arrayListB);

        for (Long aArrayListA : arrayListA) {
            result1.remove(aArrayListA);
        }

        //2.
        ArrayList<Long> result2 = new ArrayList<>(arrayListA);

        for (Long aArrayListB : arrayListB) {
            result2.remove(aArrayListB);
        }

        //3.
        ArrayList<Long> result3 = new ArrayList<>();

        for (Long aArrayListA : arrayListA) {
            if(arrayListB.contains(aArrayListA)){
                result3.add(aArrayListA);
            }
        }

        //add 3 arrayLists to returnArrayList
        ArrayList<ArrayList<Long>> returnArrayList = new ArrayList<>();
        returnArrayList.add(result1);
        returnArrayList.add(result2);
        returnArrayList.add(result3);

        return returnArrayList;
    }

}

