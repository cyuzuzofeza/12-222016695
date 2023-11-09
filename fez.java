// Define an interface for describing fruits
interface FruitDescription {
    void describeFruit();
}

// Create a base Fruit class that all specific fruit classes will extend
class Fruit implements FruitDescription {
    protected String name;
    protected String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void describeFruit() {
        System.out.println("Fruit: " + name);
        System.out.println("Color: " + color);
    }
}

// Create specific fruit classes that extend the base Fruit class
class Apple extends Fruit {
    private String variety;

    public Apple(String name, String color, String variety) {
        super(name, color);
        this.variety = variety;
    }

    public void describeFruit() {
        super.describeFruit();
        System.out.println("Variety: " + variety);
    }
}

class Banana extends Fruit {
    private boolean isRipe;

    public Banana(String name, String color, boolean isRipe) {
        super(name, color);
        this.isRipe = isRipe;
    }

    public void describeFruit() {
        super.describeFruit();
        System.out.println("Ripe: " + (isRipe ? "Yes" : "No"));
    }
}

// You can create classes for other fruits in a similar way

class FruitDemo {
    public static void main(String[] args) {
        FruitDescription apple = new Apple("Apple", "Red", "Fuji");
        FruitDescription banana = new Banana("Banana", "Yellow", true);

        apple.describeFruit();
        banana.describeFruit();
    }
}