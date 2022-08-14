public class main {
    public static void main(String[] args) {
        int initialAccount = 200;
        int addend = 150;
        int bonus;

        if (addend > 1000) {
            bonus = addend / 100;
        } else {
            bonus = 0;
        }
        int finalAccount = initialAccount + addend + bonus;
        System.out.println("Итоговый счет: " + finalAccount);

        System.out.println("Количество бонусных рублей: " + bonus);
    }
}