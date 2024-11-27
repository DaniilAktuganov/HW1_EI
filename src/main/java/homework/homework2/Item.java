package homework.homework2;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public  Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int sell(int amount) {
        if (amount < 0) {
            System.out.println("Количество товаров должно быть положительным");
        }
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            System.out.println("Недостаточно товаров");
        }
        return quantity;
    }

     public int restock(int amount) {
         if (amount > 0) {
             quantity += amount;
         } else {
             System.out.println("Количество товаров должно быть положительным");
         }
         return quantity;
     }

     public String getInfo() {
        return "Название товара: " + name + ", Цена товара: " + price  + ", Количество на складе: " + quantity;
     }
}