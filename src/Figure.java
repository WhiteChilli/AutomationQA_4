public class Figure {

    int a;
    int b;
    int h;

    // constructor with values
    public Figure(int length, int width, int height) {
        this.h = height;
        this.b = width;
        this.a = length;
    }

    // default constructor
    public Figure() {
    }

    // V = H * W * L
    public int calculateVolume() {
        int volume = this.h * this.b * this.a;
        return volume;
    }

    public void calculateSurfaceVolume() {

        int surface = 2 * (this.a * this.b + this.a * this.h + this.b * this.h);
        System.out.println(surface);
    }
}
