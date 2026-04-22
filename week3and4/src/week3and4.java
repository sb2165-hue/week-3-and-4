import java.util.*;

class Client {
    String name;
    int riskScore;
    double balance;

    Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }

    public String toString() {
        return name + ":" + riskScore;
    }
}

public class week3and4 {

    // Bubble Sort (ascending risk)
    public static void bubbleSort(Client[] arr) {
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Bubble Sort: " + Arrays.toString(arr) + " Swaps=" + swaps);
    }

    // Insertion Sort (desc risk)
    public static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sort DESC: " + Arrays.toString(arr));
    }

    public static void topClients(Client[] arr, int k) {
        System.out.print("Top " + k + ": ");
        for (int i = 0; i < k && i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("C", 80, 5000),
                new Client("A", 20, 2000),
                new Client("B", 50, 3000)
        };

        bubbleSort(arr.clone());
        insertionSort(arr);
        topClients(arr, 3);
    }
}