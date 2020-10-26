public class ArrayOps {
  public static int sum(int[] arr) {
    int ArraySum = 0;
    for( int i = 0; i < arr.length; i++) {
      ArraySum += arr[i];
    }
    return ArraySum;
  }
}
