package main.java.by.bsuir.alekseeva.Task8;

public class Main {
    public static void main(String[] args) {
        double[] firstSequence = {2.2, 3.4, 4, 5.6, 7.8};
        double[] secondSequence = {1.2, 2.6, 3, 4.3, 5, 6.8, 7};
        int[] indexes = SequencesMerging.getInsertedElementsIndexes(secondSequence, firstSequence);
        for (int index : indexes) {
            System.out.print(index + " ");
        }
    }
}
