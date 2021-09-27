public class Main {
  public static void main(String[] args) {
    int[] array1 = {2,4,6,-8};
    int value = 5;
    int[] newArray = insertShiftArray(array1, value);
    for (int i =0 ; i<newArray.length; i++) {
      System.out.print(newArray[i]);
    }
  }

  public static int[] insertShiftArray(int[] array,int n){

    int middleIndex= (int) Math.ceil((double)(array.length)/2);

    int[] newArray= new int[array.length+1];
    for (int i=0; i < newArray.length; i++){
      if(i < middleIndex){
        newArray[i]=array[i];
      }else if(i == middleIndex){
        newArray[middleIndex]=n;
      }
      else if(i > middleIndex){
        newArray[i]=array[i-1];
      }
    }

    return newArray ;
  }
}
