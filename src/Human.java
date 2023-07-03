public class Human {
    String FIO;
    int age;
    float capital;

    public Human(String FIO, int age, float capital) {
        this.FIO = FIO;
        this.age = age;
        this.capital = capital;
    }

    void work(int hoursOfWork) {
        capital += 1000 * hoursOfWork;
    }

    void walk(int hoursOfWalk) {
        capital -= 1000 * hoursOfWalk;
    }
}
