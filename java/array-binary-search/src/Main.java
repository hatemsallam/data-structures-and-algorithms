public class Main {

  public static int binarySearch(int[] Array , int searchKey) {
    int left = 0, right = Array.length -1 ;
    while (left <= right) {
      int mid = left + (right - left) / 2 ;
      if (Array[mid] == searchKey)
        return mid ;
      if(Array[mid] < searchKey)
        left = mid + 1;
      else
        right = mid -1;

    }
    return -1;
  }
  public static void main (String[] args) {
    int arr[] = {-131, -82, 0, 27, 42, 68, 179};
    System.out.println(binarySearch(arr , 42));
  }
}





