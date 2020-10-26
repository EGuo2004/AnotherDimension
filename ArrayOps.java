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
  public static int[] sumRows(int[][] matrix) {
    int[] SumEach = new int[matrix.length];
    for (int j = 0; j < matrix.length; j++) {
      SumEach[j] = sum(matrix[j]);
    }
    return SumEach;
  }
  public static int[] largestRows(int[][] matrix) {
    int [] LargestEach = new int[matrix.length];
    for (int j = 0; j < matrix.length; j++) {
      LargestEach[j] = largest(matrix[j]);
    }
    return LargestEach;
  }
  public static int sum(int[][] arr) {
    return sum(sumRows(arr));
  }
}
