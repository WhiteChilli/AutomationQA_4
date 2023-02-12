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

        int S = 2 * (a * b + a * h + b * h);

        System.out.println(S);
    }
}
