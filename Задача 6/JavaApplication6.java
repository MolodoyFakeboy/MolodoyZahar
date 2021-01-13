package javaapplication6;
import java.util.ArrayList;
import java.util.List;

public class JavaApplication6 {


    public static void main(String[] args) {
    List<Item> items = new ArrayList<>();
    items.add(new Item("Книга", 1, 600));
    items.add(new Item("Нож", 2, 5000));
    items.add(new Item("Аптечка", 4, 1500));
    items.add(new Item("Ноутбук", 2, 40000));
    items.add(new Item("Повербанк", 1, 500));
    Backpack backpack = new Backpack(8);
    backpack.makeAllSets(items);
    System.out.println("В рюкзак лучше всего поместить");
    System.out.println(backpack.getBestItems());
    }


   
}   
