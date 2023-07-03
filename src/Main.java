public class Main {
    public static void main(String[] args) {

        Human mans = new Human("Kost Mans Kazb", 23, 500000.00f);
        Bank sber = new Bank(50000000000L);

        mans.work(50);
        System.out.println(mans.capital);

        mans.walk(7);
        System.out.println(mans.capital);

        sber.saving(mans, 300000f, 10);
        System.out.println(mans.capital);
        System.out.println(mans.age);

        sber.acceptCredit(mans);
    }
}