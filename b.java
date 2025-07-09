class Mythri {
    public static void main(String args[]) {
        Mythri o = new Mythri();
        int[] res = o.sorting(new int[]{12, 40, 78, 9, 4});

        // Print the sorted array
        System.out.print("Sorted array in descending order: ");
        for (int num : res) {
            System.out.print(num + " ");
        }
        System.out.println();

        String res1 = o.binarySearch(res, 40);
        System.out.println(res1);
    }

    int[] sorting(int a[]) {
        for (int x = 0; x <= a.length - 2; x++) {
            for (int y = x + 1; y <= a.length - 1; y++) {
                if (a[x] < a[y]) { // Descending order
                    int temp = a[x];
                    a[x] = a[y];
                    a[y] = temp;
                }
            }
        }
        return a;
    }

    String binarySearch(int a[], int search) {
        int f = 0, l = a.length - 1, m;
        while (f <= l) {
            m = (f + l) / 2;
            if (search == a[m]) {
                return "Element found";
            } else if (search > a[m]) {
                l = m - 1; // Descending order logic
            } else {
                f = m + 1;
            }
        }
        return "Element not found";
    }
}
