public class IT26101661Lab2Q2 {
    public static void main(String[] args) {

        double side = 10;
        double perimeter;
        double radius;
        double pi = 3.14;

        // Calculate the perimeter of the square
        perimeter = 4 * side;

        // Calculate the radius of the circle
        radius = perimeter / (2 * pi);

        System.out.println("Radius of the circular fence: " + radius);
    }
}
