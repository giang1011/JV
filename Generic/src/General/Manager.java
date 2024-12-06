package General;
import java.util.ArrayList;
import java.util.List;


public class Manager<T> {
    private List<T> items = new ArrayList<>();


    public void addItem(T item) {
        items.add(item);
    }


    public List<T> getAllItems() {
        return items;
    }


    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

