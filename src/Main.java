public class Main {
    public static void main(String[] args) {
        Dog husky = new Dog("Looney",4,3.5);
        husky.dogBark();
        husky.layDown();

        int result;
        result = husky.giveMeFive();

        Dog poodle = new Dog("Verbena",2, 2.1);
        poodle.dogBark();
        poodle.layDown();

        int sumResult;
        sumResult = husky.sum(1,3);
    }
}