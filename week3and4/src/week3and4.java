import java.util.*;

class Asset {
    String name;
    double returnRate;
    double volatility;

    Asset(String name, double returnRate, double volatility) {
        this.name = name;
        this.returnRate = returnRate;
        this.volatility = volatility;
    }

    public String toString() {
        return name + ":" + returnRate;
    }
}

public class week3and4 {

    // Merge Sort (ascending return)
    public static void mergeSort(List<Asset> list) {
        list.sort(Comparator.comparingDouble(a -> a.returnRate));
    }

    // Quick Sort (desc return, asc volatility)
    public static void quickSort(List<Asset> list) {
        list.sort((a, b) -> {
            if (a.returnRate != b.returnRate)
                return Double.compare(b.returnRate, a.returnRate);
            return Double.compare(a.volatility, b.volatility);
        });
    }

    public static void main(String[] args) {
        List<Asset> list = Arrays.asList(
                new Asset("AAPL", 12, 3),
                new Asset("TSLA", 8, 5),
                new Asset("GOOG", 15, 2)
        );

        mergeSort(list);
        System.out.println("Merge: " + list);

        quickSort(list);
        System.out.println("Quick: " + list);
    }
}