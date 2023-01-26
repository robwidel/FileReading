package common.filehandling;

public class Point {
    int x;
    int y;
    int z;

    Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
