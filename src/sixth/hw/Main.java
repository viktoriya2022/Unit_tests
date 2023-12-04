package sixth.hw;

public class Main {
    public static void main(String[] args){

        Lists lists = new Lists();

        int[] array1 = lists.createArray();
        double firstAverage = lists.averageArray(array1);

        int[] array2 = lists.createArray();
        double secondAverage = lists.averageArray(array2);

        lists.compareArrays(firstAverage, secondAverage);
    }
}
