// Block class using Generic
class Block<T> {
    private T item;

    public void addItem(T newItem) {
        this.item = newItem;
    }

    public T getItem() {
        return item;
    }

    public void displayInfo() {
        if (item != null) {
            System.out.println("Block contains: " + item.toString());
        } else {
            System.out.println("Block is empty");
        }
    }
}

// Product classes
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title;
    }
}

class Phone {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone: " + model;
    }
}

class Food {
    private String name;
    
    public Food(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food: " + name;
    }
}

// Main class
public class bailam {
    public static void main(String[] args) {
        // Create blocks for different types
        Block<Book> bookBlock = new Block<>();
        Block<Phone> phoneBlock = new Block<>();
        Block<Food> foodBlock = new Block<>();

        // Add items to blocks
        bookBlock.addItem(new Book("Java Programming"));
        phoneBlock.addItem(new Phone("iPhone 13"));
        foodBlock.addItem(new Food("Pizza"));

        // Display information
        System.out.println("Displaying block contents:");
        bookBlock.displayInfo();
        phoneBlock.displayInfo();
        foodBlock.displayInfo();

        // Get items from blocks
        System.out.println("\nRetrieving items:");
        Book book = bookBlock.getItem();
        Phone phone = phoneBlock.getItem();
        Food food = foodBlock.getItem();

        System.out.println("Retrieved " + book);
        System.out.println("Retrieved " + phone);
        System.out.println("Retrieved " + food);
    }
}
