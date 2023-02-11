public class Dog {
   int age;
   double weight;
   String name;

    public Dog( String dogName, int dogAge, double dogWeight ) {
//        this.age = 1;
//        this.weight = 4;
//        this.name = "Rony";

        this.age = dogAge;
        this.weight = dogWeight;
        this.name = dogName;
    }

    public void dogBark() {
        System.out.println(this.name + " says woof!");
    }

    public void layDown() {
        System.out.println("laying down");
    }

    public int giveMeFive() {
        int a = 2;
        int b = 3;
        int c = a + b;
        return c;
    }

    public int sum(int firstnum, int secondnum) {
        return firstnum + secondnum;
    }
}

