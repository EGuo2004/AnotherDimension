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

  public static int[] largestInRows(int[][] matrix) {
    int [] LargestEach = new int[matrix.length];
    for (int j = 0; j < matrix.length; j++) {
      LargestEach[j] = largest(matrix[j]);
    }
    return LargestEach;
  }

  public static int sum(int[][] arr) {
    return sum(sumRows(arr));
  }

  public static int[][] ColsToRows(int[][] matrix) {
    int [][] RowsToCols = new int [matrix[0].length][matrix.length];
    for (int j = 0; j < matrix[0].length; j++) {
      for (int k = 0; k < matrix.length; k++) {
        RowsToCols[j][k] = matrix[k][j];
      }
    }
    return RowsToCols;
  }

  public static int[] sumCols(int[][] matrix) {
    return sumRows(ColsToRows(matrix));
  }

  public static boolean isEqual(int[] arr) {
    boolean equal = true;
    for (int k = 0; k < arr.length - 1; k++) {
      if (arr[k] != arr[k + 1]) {
        equal = false;
      }
    }
    return equal;
  }

  public static boolean isRowMagic(int[][] matrix) {
    return isEqual(sumRows(matrix));
  }

  public static boolean isColMagic(int[][] matrix) {
    return isEqual(sumRows(ColsToRows(matrix)));
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    int [] RowCheck = new int[matrix.length];
    int [] ColumnCheck = new int[matrix[0].length];
    RowCheck = sumRows(matrix);
    ColumnCheck = sumCols(matrix);
    return RowCheck[row] == ColumnCheck[col];
  }
}
