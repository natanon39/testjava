import static java.lang.System.out;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class javatest {
    static void Palindrome() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--)
            result += input.charAt(i);
        if (result.toLowerCase() == input.toLowerCase())
            out.println(input + " : " + result + " is palindrome");
        else
            out.println(input + " : " + result + " is not palindrome");
    }

    static int[] RemoveFromArray(int[] n, int index) {
        if (n.length <= 1 || n == null)
            return n;
        int[] temp = new int[n.length - 1];
        for (int i = 0; i < index; i++)
            temp[i] = n[i];
        for (int k = index; k < n.length - 1; k++)
            temp[k] = n[k + 1];
        return temp;
    }

    static int[] RemoveDuplicateNumber(int n[]) {
        if (n.length <= 1) {
            return n;
        }
        int[] temp = n;
        for (int i = 0; i <= n.length - 1; i++) {
            for (int j = 0; j <= n.length - 1; j++) {
                if (temp[i] == n[j] && i != j) {
                    temp = RemoveFromArray(temp, i);
                }
            }
        }
        return temp;
    }

    static String Trim(String t) {
        char[] input = t.toCharArray();
        String text = "";
        for (int i = 0; i <= input.length - 1; i++) {
            if (input[i] != ' ') {
                text += input[i];
            }
        }
        return text;
    }

    static void primeNumber(int num) {
        int k;
        for (int i = 0; i <= num; i++) {
            for (k = 2; k <= 9; k++) {
                if (i % k == 0 && i != k) {
                    out.println(i + " : is not prime");
                    break;
                }
            }
            if (k == 10) {
                out.println(i + " : is prime");
            }
        }
    }

    static int indexOf(String text, String word) {
        char[] temptext = text.toCharArray();
        char[] tempword = word.toCharArray();
        int j = 0;
        for (int i = 0; i <= temptext.length - tempword.length; i++) {
            for (; j <= tempword.length - 1; j++) {
                out.println(tempword[j] + " : " + temptext[i + j]);
                if (tempword[j] != temptext[i + j]) {
                    break;
                }
            }
            if (j == tempword.length) {
                return i;
            }
        }
        return j;
    }

    static void quicksort(int[] arr, int left, int right) {
        int i = left, j = right;
        // get middle position
        int mid = arr[left + (right - left) / 2];
        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than middle
            // element then get the next element from the left list
            while (arr[i] < mid) {
                i++;
            }
            while (arr[j] > mid) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (left < j)
            quicksort(arr, left, j);
        if (i < right)
            quicksort(arr, i, right);
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    swap(arr, j - 1, j);
                }

            }
        }

    }

    static void selectionSort(int arr[])  
{  
    int i, j, min_idx;  
  
    // One by one move boundary of unsorted subarray  
    for (i = 0; i < arr.length-1; i++)  
    {  
        // Find the minimum element in unsorted array  
        min_idx = i;  
        for (j = i+1; j < arr.length; j++)  
        if (arr[j] < arr[min_idx])  
            min_idx = j;  
  
        // Swap the found minimum element with the first element  
        swap(arr,min_idx,i);  
    }  
}

static void insertionSort(int[] arr)  
{  
    int i, key, j;  
    for (i = 1; i < arr.length; i++) 
    {  
        key = arr[i];  
        j = i - 1;  
  
        /* Move elements of arr[0..i-1], that are  
        greater than key, to one position ahead  
        of their current position */
        while (j >= 0 && arr[j] > key) 
        {  
            arr[j + 1] = arr[j];  
            j -= 1;  
        }  
        arr[j + 1] = key;  
    }  
} 
static void mergeSort(int a[], int left, int right)  
{  
    int mid;  
    if(left<right)  
    {  
        mid = (left+right)/2;  
        mergeSort(a,left,mid);  
        mergeSort(a,mid+1,right);  
        merge(a,left,mid,right);  
    }  
}  
static void merge(int a[], int left, int mid, int right)  
{  
    int i=left,j=mid+1,k,index = left;  
    int[] temp=new int[a.length];  
    while(i<=mid && j<=right)  
    {  
        if(a[i]<a[j])  
        {  
            temp[index] = a[i];  
            i = i+1;  
        }  
        else   
        {  
            temp[index] = a[j];  
            j = j+1;   
        }  
        index++;  
    }  
    if(i>mid)  
    {  
        while(j<=right)  
        {  
            temp[index] = a[j];  
            index++;  
            j++;  
        }  
    }  
    else   
    {  
        while(i<=mid)  
        {  
            temp[index] = a[i];  
            index++;  
            i++;  
        }  
    }  
    k = left;  
    while(k<index)  
    {  
        a[k]=temp[k];  
        k++;  
    }  
}  

    public static void main(String[] args) {
        // out.println(Trim("Hello World"));
        // out.println(indexOf("Hello World", "World"));
        // primeNumber(20);
        // Palindrome();
        // int[] k = new int[] { 1, 2, 2, 4, 5, 6, 7, 8, 9, 10 };
        // out.println(Arrays.toString(RemoveDuplicateNumber(k)));
        int[] numbers = new int[] { 3, 24, 1, 0, 323, 58, 3, 21, 3, 9, 87, 6, 5, 3, 13 };
        mergeSort(numbers,0,numbers.length-1);
        out.println(Arrays.toString(numbers));
    }
}