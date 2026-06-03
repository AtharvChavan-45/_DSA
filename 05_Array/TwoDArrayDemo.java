public class TwoDArrayDemo {

    public static void main(String[] args) {

        // Creating a 2D array
        int[][] myNumbers = {
                {1, 4, 2},        // Row 0
                {3, 6, 8, 5, 2}  // Row 1
        };

        // ========================================
        // Accessing an element
        // Syntax: array[row][column]
        // ========================================
        System.out.println("Element at row 1 and column 2: " + myNumbers[1][2]);
        // Output: 8


        // ========================================
        // Changing an element
        // ========================================
        myNumbers[1][2] = 9;

        System.out.println("After updating:");
        System.out.println("Element at row 1 and column 2: " + myNumbers[1][2]);
        // Output: 9


        // ========================================
        // Finding number of rows and columns
        // ========================================
        System.out.println("\nRows: " + myNumbers.length);
        // Output: 2

        System.out.println("Columns in row 0: " + myNumbers[0].length);
        // Output: 3

        System.out.println("Columns in row 1: " + myNumbers[1].length);
        // Output: 5


        // ========================================
        // Traversing using normal for loops
        // ========================================
        System.out.println("\nUsing normal for loops:");

        for (int row = 0; row < myNumbers.length; row++) {

            for (int col = 0; col < myNumbers[row].length; col++) {

                System.out.println(
                        "myNumbers[" + row + "][" + col + "] = "
                        + myNumbers[row][col]
                );
            }
        }


        // ========================================
        // Traversing using enhanced for-each loops
        // ========================================
        System.out.println("\nUsing for-each loops:");

        // row represents each 1D array
        for (int[] row : myNumbers) {

            // num represents each element inside that row
            for (int num : row) {

                System.out.println(num);
            }
        }

    }
}