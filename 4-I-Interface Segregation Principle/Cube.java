// public class Cube implements Shape {
//     Double side;

//     Cube(Double side) {
//         this.side = side;
//     }

//     public void area() {
//         System.out.println("Area of Cube: " + side * side);
//     }

//     public void volume() {
//         System.out.println("Area of Cube: " + side * side * side);
//     }
// }

public class Cube implements ThreeDimentionalShape {
    Double side;

    Cube(Double side) {
        this.side = side;
    }

    public void area() {
        System.out.println("Area of Cube: " + 6 * side * side);
    }

    public void volume() {
        System.out.println("Area of Cube: " + side * side * side);
    }
}
