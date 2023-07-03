public class Bank {
    long capital;

    public Bank(long capital) {
        this.capital = capital;
    }

    void acceptCredit(Human human) {
        if (human.capital >= 100000) {
            System.out.println("Кредит одобрен!");
        } else {
            System.out.println("Кредит отклонён!");
        }
    }

    void saving(Human human, float contribution, int yearsOfSaving) {
        if (human.capital < contribution) {
            System.out.println("Ошибка!");
        } else {
            human.capital = (human.capital - contribution) + (contribution * yearsOfSaving * 1.15f);
            human.age += yearsOfSaving;
        }
    }
}
