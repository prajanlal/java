public class area {
String shape;
    int length;
    int breadth;
    int area;
    area(int length, int breadth, String shape) {
        this.length = length;
        this.breadth = breadth;
        this.shape = shape;
    }
    public void getarea() {
        int area = length * breadth * shape;
        System.out.println("area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        area rectangle = new area(5, 6, square);
        rectangle.getarea();
    }
}
