// public class Square implements Shape {
//     Double side;

//     Square(Double side) {
//         this.side = side;
//     }

//     public void area() {
//         System.out.println("Area of Square: " + side * side);
//     }

//     public void volume() {
//         throw new UnsupportedOperationException("Square doesn't have a volume");
//     }
// }

public class Square implements TwoDimentionalShape {
    Double side;

    Square(Double side) {
        this.side = side;
    }

    public void area() {
        System.out.println("Area of Square: " + side * side);
    }

    public void volume() {
        throw new UnsupportedOperationException("Square doesn't have a volume");
    }
}
