package homework.homework2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Задача 1
        System.out.println("Задача 1");
        Rectangle rectangle = new Rectangle(10, 15);
        double area = rectangle.calculateAre();
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Площадь прямоугольника: " + area + " кв. м");
        System.out.println("Периметр прямоугольника " + perimeter + " м");
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        BankAccount bankAccount = new BankAccount(1);
        double balanceAfterDeposit = bankAccount.deposit(500);
        double balanceAfterWithdraw = bankAccount.withdraw(200);
        double balance = bankAccount.getBalance();
        System.out.println("Баланс после пополнения: " + balanceAfterDeposit + " руб.");
        System.out.println("Баланс после снятия: " + balanceAfterWithdraw + " руб.");
        System.out.println("Баланс: " + balance + " руб.");
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        Item item = new Item("Item", 100, 10);
        int quantityAfterSell = item.sell(5);
        int quantityAfterRestock = item.restock(2);
        String infoAboutItem = item.getInfo();
        System.out.println("Количество товаров после продажи: " + quantityAfterSell);
        System.out.println("Количество товаров после пополнения: " + quantityAfterRestock);
        System.out.println(infoAboutItem);
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        Person personOne = new Person("Person", 27);
        Person personTwo = new Person("Person", 27);
        System.out.println(personOne.equals(personTwo));
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        Student studentOne = new Student("Student", 12345, 4.8);
        Student studentTwo = new Student("Student", 12345, 4.8);
        System.out.println(studentOne.equals(studentTwo));
        studentOne.toString();
        studentOne.clone();
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        Student productOne = new Student("Product", 12345, 4.8);
        Student productTwo = new Student("Product", 12345, 4.8);
        System.out.println(productOne.equals(productTwo));
        productOne.toString();
        productOne.clone();
        System.out.println();
    }
}
