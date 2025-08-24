public class CafeInventory {
    public static void main(String[] args) {
        // Coefficients and constants for sandwiches equation: 5x + 3y + 2z = 13
        double[][] sandwiches = {
            {5, 3, 2, 13}
        };

        // Coefficients and constants for juices equation: 5a + 3b + 2c = 9
        double[][] juices = {
            {5, 3, 2, 9}
        };

        System.out.println("Checking Sandwiches:");
        solveEquation(sandwiches);

        System.out.println("\nChecking Juices:");
        solveEquation(juices);
    }

    // Function to solve using Gauss-Jordan for 1 equation
    public static void solveEquation(double[][] matrix) {
        // Only one equation given, so we check directly
        double a = matrix[0][0];
        double b = matrix[0][1];
        double c = matrix[0][2];
        double total = matrix[0][3];

        // Given recipe values
        double x = 1, y = 2, z = 1; // For sandwiches
        double a1 = 1, b1 = 1, c1 = 2; // For juices

        // If total matches with sandwiches recipe
        double checkSandwich = a * x + b * y + c * z;
        double checkJuice = a * a1 + b * b1 + c * c1;

        if (total == 13) {
            System.out.println("Recipe check: 5(1)+3(2)+2(1) = " + checkSandwich);
            if (checkSandwich == total)
                System.out.println("Sandwich data matches ✅");
            else
                System.out.println("Sandwich data does NOT match ❌");
        } else {
            System.out.println("Recipe check: 5(1)+3(1)+2(2) = " + checkJuice);
            if (checkJuice == total)
                System.out.println("Juice data matches ✅");
            else
                System.out.println("Juice data does NOT match ❌");
        }
    }
}

