import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = sc.nextDouble();

        System.out.println("Enter b: ");
        double b = sc.nextDouble();

        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double discriminant = quadraticEquation.getDiscriminant();

        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        if (discriminant > 0) {
            System.out.println("QuadraticEquation has two results: " + root1 + "\t" + root2);

        } else if (discriminant == 0) {
            System.out.println("QuadraticEquation has one result: " + root1);

        } else {
            System.out.println("The equation has no roots");
        }

    }
}
