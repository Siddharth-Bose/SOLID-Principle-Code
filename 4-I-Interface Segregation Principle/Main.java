public class Main {
    public static void main(String[] args) {
        TwoDimentionalShape square = new Square(10.0);
        ThreeDimentionalShape cube = new Cube(5.0);
        // try {
        // cube.area();
        // cube.volume();
        // square.area();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        square.area();
        cube.area();
        cube.volume();

    }
}