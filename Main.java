import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        long[] listA = {3, 4, 4, 5, 5, 8, 15, 15, 15, 16, 19};
        long[] listB = {3, 5, 6, 7, 10, 12, 15, 15, 16, 16, 20, 20, 20};

        //print results
        ArrayList<ArrayList<Long>> resultsArray = convertLists(listA, listB);
        for (ArrayList<Long> array : resultsArray) {
            System.out.println(array.toString());
        }

    }

    private static ArrayList<ArrayList<Long>> convertLists(long[] listA, long[] listB) {

        ArrayList<Long> resultList1 = new ArrayList<>();
        ArrayList<Long> resultList2 = new ArrayList<>();
        ArrayList<Long> resultList3 = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < listA.length && j < listB.length) {
            if (listA[i] == listB[j]) {
                resultList3.add(listA[i]);

                do {
                    i++;
                    if (i == listA.length) break;
                } while (listA[i] == listA[i - 1]);


                do {
                    j++;
                    if (j == listB.length) break;
                } while (listB[j] == listB[j - 1]);


            } else if (listA[i] < listB[j]) {
                resultList2.add(listA[i]);

                do {
                    i++;
                    if (i == listA.length) break;
                } while (listA[i] == listA[i - 1]);

            } else {
                resultList1.add(listB[j]);

                do {
                    j++;
                    if (j == listB.length) break;
                } while (listB[j] == listB[j - 1]);

            }
        }


        while (i < listA.length) {
            if (resultList2.get(resultList2.size() - 1) != listA[i]) resultList2.add(listA[i]);
            i++;
        }

        while (j < listB.length) {
            if (resultList1.get(resultList1.size() - 1) != listB[j]) resultList1.add(listB[j]);
            j++;
        }


        //add 3 arrayLists to returnArrayList
        ArrayList<ArrayList<Long>> returnArrayList = new ArrayList<>();
        returnArrayList.add(resultList1);
        returnArrayList.add(resultList2);
        returnArrayList.add(resultList3);

        return returnArrayList;
    }


}

