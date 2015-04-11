package UebPattern.strategy;

public class BubbleSort implements SortInterface {
    @Override
    public void sort(int[] list) {
        int temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[i] < list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
