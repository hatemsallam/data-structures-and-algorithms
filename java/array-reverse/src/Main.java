public class Main {
  public static void main(String[] args){
    int[] numberList={89, 2354, 3546, 23, 10, -923, 823, -12};
    int[] ReverseList = reverseArray(numberList);
    for(int i=0 ; i<ReverseList.length ; i++){
      System.out.print(" "+ReverseList[i]);
    }
  }

  public static int[] reverseArray(int[] array){

    int[] reversedArray=new int[array.length];
    for (int i=0 ; i<array.length ; i++){
      reversedArray[i]=array[array.length-1-i];
    }

    return reversedArray;
  }
}
