package UebPattern.strategy;

public class SortingClient {
    public static void main(String[] args) {
        int[] list = { 1, 2, 7, 3, 1, 0, 10, 22, 19, 14, 12, 16, 17 };
        SortingContext context = new SortingContext();
        context.setSorter(new BubbleSort());
        context.sortInt(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
