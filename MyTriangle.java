import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter edge A: ");
        double edgeA = input.nextDouble();
        System.out.println("Enter edge B: ");
        double edgeB = input.nextDouble();
        System.out.println("Enter edge C: ");
        double edgeC = input.nextDouble();

        if (isValid(edgeA, edgeB, edgeC)) {
            System.out.println("Area triangle: " + calculateAreaTriangle(edgeA, edgeB, edgeC));
        } else {
            System.out.println("Not Trianle !");
        }
    }

    public static boolean isValid(double edgeA, double edgeB, double edgeC) {
        boolean edgeCompare0 = edgeA > 0 && edgeB > 0 && edgeC > 0;
        boolean compareBetweenEdge = (edgeA + edgeB) > edgeC && (edgeA + edgeC) > edgeB && (edgeB + edgeC) > edgeA;
        if (edgeCompare0) {
            if (compareBetweenEdge) {
                return true;
            } else
                return false;
        } else
            return false;
    }

    public static double calculateAreaTriangle(double edgeA, double edgeB, double edgeC) {
        double areaTriangle;
        double perimeterTriangle = (edgeA + edgeB + edgeC) / 2;
        return areaTriangle = Math.sqrt(perimeterTriangle * (perimeterTriangle - edgeA) * (perimeterTriangle - edgeB) * (perimeterTriangle - edgeC));
    }
}
