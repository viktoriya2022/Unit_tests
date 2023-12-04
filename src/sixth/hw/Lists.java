package sixth.hw;

public class Lists {
    SecondList secondList;

    public Lists(){
        this.secondList = new SecondList();
    }

    public double averageArray(int[] array) {
        return secondList.averageArray(array);
    }

    public void compareArrays(double firstAverage, double secondAverage){
        secondList.compareArrays(firstAverage, secondAverage);
    }

    public int[] createArray() {
        return secondList.createArray();
    }
}
