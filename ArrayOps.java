public class ArrayOps {
  public static int sum(int[] arr) {
    int ArraySum = 0;
    for( int i = 0; i < arr.length; i++) {
      ArraySum += arr[i];
    }
    return ArraySum;
  }
  public static int largest(int[] arr) {
    int BiggestValue = 0;
    for ( int i = 0; i < arr.length; i++) {
      if (BiggestValue < arr[i]) {
        BiggestValue = arr[i];
      }
    }
    return BiggestValue;
  }
}
