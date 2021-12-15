package SuperKeyword;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        //inisialisasi
        shape.corner = 5;
        shape.setCorner(10);
        System.out.println(shape.getCorner());

        Rectangle rectangle = new Rectangle();
        rectangle.name = "Segitiga";

        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
        System.out.println(rectangle.namaBentuk());
        System.out.println(rectangle.namaBentukParent());
    }
}
