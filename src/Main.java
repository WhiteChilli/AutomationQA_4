public class Main {
    public static void main(String[] args) {

        Figure box = new Figure(5,15,10);
        int boxVolume = box.calculateVolume();
        System.out.println(boxVolume);

        Figure shelf = new Figure();
        // method with formula: S = 2(a · b + a · h + b · h)
        box.calculateSurfaceVolume();
    }
}