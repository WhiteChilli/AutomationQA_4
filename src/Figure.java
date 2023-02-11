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














//        Часть 2
//        Создайте класс Сlient
//        1 Определите поля - имя, остаток средств на счете, личный код
//        2 Создайте конструктор класса Сlient
//        3 В классе Main создайте три разных объекта класса
//        4 Дополните описание класса методом без параметров, возвращающим
//        слово “Tere”
//        5 Вызовите метод из п.4 и проинициализируйте переменную
//        возвращаемым значением метода
//        6 Дополните описание класса методом с двумя входными
//        параметрами, возвращающим разность этих параметров
//        7 Вызовите метод из п.6 и проинициализируйте переменную
//        возвращаемым значением метода