package SortingTechniques;

public class MergeSort {   // ALT SHIFT F to format code

    static int[] table = null;

    private static void mergeSort() {

        sort(0, table.length - 1);

    }

    private static void sort(int i, int j) {

        if (i >= j) {

            return;
        }

        int m = i + (j - i) / 2;

        sort(i, m);

        sort(m + 1, j);

        merge(i, m, j);
    }

    private static void merge(int l, int m, int e) {

        int[] left = new int[m - l + 1];
        int[] right = new int[e - m];

        for (int i = l; i <= m; i++) {
            left[i - l] = table[i];
        }

        for (int i = m + 1; i <= e; i++) {
            right[i - m - 1] = table[i];
        }

        int x = 0;
        int y = 0;

        int z = l;

        int l1 = m - l + 1;
        int l2 = e - m;

        while (x < l1 && y < l2) {

            if (left[x] <= right[y]) {
                table[z] = left[x];
                x++;
            } else {
                table[z] = right[y];
                y++;
            }

            z++;
        }

        while (x < l1) {

            table[z] = left[x];
            x++;
            z++;

        }

        while (y < l2) {

            table[z] = right[y];
            y++;
            z++;

        }

    }

    public static void main(String[] args) {

        table = new int[]{12, 11, 13, 5, 6, 7};

        printArray();

        mergeSort();

        printArray();

    }

    private static void printArray() {

        System.out.println("====================================");
        
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }

        System.out.println();
    }

}
