public class Main {
    public static void main(String[] args) {

//      Task 1
        Figure box = new Figure(5,15,10);
        int boxVolume = box.calculateVolume();
        System.out.println(boxVolume);

        Figure shelf = new Figure();
        // method with formula: S = 2(a · b + a · h + b · h)
        box.calculateSurfaceVolume();

//      Task 2
        Client one = new Client("Beatrix", 22.5, 15245);
        Client two = new Client("Rhonda", 105.3, 148625);
        Client three = new Client("Gita", 74.5, 7852156);

        String text = one.sayTere();
        int difference = two.diff(5,2);
    }
}

