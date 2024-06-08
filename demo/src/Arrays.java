public class Arrays {
  
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    String[] names = {"Alice", "Bob", "Charlie"};

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    names[0] = "David";

    // 2D array
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    for (int i = 0; i < matrix.length; i++) {
      System.out.println();
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
    }
    System.out.println();

    String[][] cars = new String[3][2];

    cars[0][0] = "Ford";
    cars[0][1] = "Mustang";
    cars[1][0] = "Chevy";
    cars[1][1] = "Camaro";
    cars[2][0] = "Dodge";
    cars[2][1] = "Challenger";

    for (int i = 0; i < cars.length; i++) {
      System.out.println();
      for (int j = 0; j < cars[i].length; j++) {
        System.out.print(cars[i][j] + " ");
      }
    }
    System.out.println();
  }
}
