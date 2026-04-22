import java.util.*;

public class week3and4 {

    public static int linearSearch(String[] arr, String target) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(target)) {
                System.out.println("Linear found at " + i + " comps=" + comparisons);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1, comps = 0;

        while (low <= high) {
            comps++;
            int mid = (low + high) / 2;

            if (arr[mid].equals(target)) {
                System.out.println("Binary found at " + mid + " comps=" + comps);
                return mid;
            }
            if (arr[mid].compareTo(target) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accB", "accC"};

        linearSearch(arr, "accB");
        binarySearch(arr, "accB");
    }
}