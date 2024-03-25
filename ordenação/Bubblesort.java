public class Bubblesort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            if (arr[i] > arr[i+1]) {
                // troca arr[j+1] e arr[i]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
    }

    // Método para testar a funcionalidade
    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        Bubblesort bs = new Bubblesort();
        bs.bubbleSort(arr);
        
        System.out.println("Array ordenado:");
        for(int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}