public class Client {

    String name;
    double money;
    int code;

    // constructor
    public Client(String name, double moneyLeft, int clientCode) {
        this.code = clientCode;
        this.name = name;
        this.money = moneyLeft;
    }

    public String sayTere() {
        return "Tere";
    }

    public int diff(int first, int second) {
        int diff = first - second;
        return diff;
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