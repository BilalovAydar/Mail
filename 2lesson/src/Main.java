public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0){arr[i] = 1;}
            else {arr[i] = 0;}
            System.out.print(arr[i] + ", ");
        }

        System.out.println("\n");

        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = i*3;
            System.out.print(arr1[i] + ", ");
        }

        System.out.println("\n");

        int[] arr2 ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr4 ={1, 5, 3, 2, 11};

        for (int i = 0; i < arr2.length; i++){
            if (arr2[i] < 6){
                arr2[i] = arr2[i] * 2;}
            System.out.print(arr2[i] + ", ");
        }

        System.out.println("\n");

        int n = 10;
        int[][] arr3 = new int[n][n];
        for (int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                if ((i == j) || (j ==  arr3.length - 1 - i)){arr3[i][j] = 1;}
                else{arr3[i][j] = 0;}
                System.out.print(arr3[i][j] + ", ");
            }
            System.out.print("\n");
        }

        int max = arr2[0];
        int min = max;
        for (int i = 1; i < arr2.length; i++){
            if (arr2[i] >= max){
                max = arr2[i];}
            if (arr2[i] <= min){
                min = arr2[i];}
        }

        System.out.println("min = " + min + " max = " + max);

        System.out.println(Check(arr) + "\n");
        System.out.println(Check(arr4) + "\n");
        Replace(arr4, 1);




    }
    public static boolean Check(int[] arr){
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int l = 0;
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        if (sum == 0){return true;}
        else if (sum % 2 == 0) {
            m = arr.length - 1;
            while (l <= m){

                    if (sum1 <= sum2) {
                        sum1 = sum1 + arr[l];
                        l++;
                    }
                    else if (sum2 <= sum1) {
                        sum2 = sum2 + arr[m];
                        m--;
                    }
            }
            if (sum1 == sum2){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static void Replace(int[] arr, int n){
        int s = 0;
        int k = arr.length;
        for (int i = 0; i < k; i++)
        {
            s = (i + n + 1) % k;
            if (s <= 0) {
                s = s + k;
                System.out.print(arr[s - 1] + ", ");
            }
            else {
                System.out.print(arr[s - 1] + ", ");
            }
        }
        System.out.println("\n");

        return;
    }


}
