public class for loop {

    public static void main(String[] args) {
        String[] shoppingCart = {"Apple", "Banana", "Orange", "Milk", "Bread"};

        System.out.println("Items in your shopping cart:");

        // Using a for loop to print the items in the shopping cart
        for (int i = 0; i < shoppingCart.length; i++) {
            System.out.println("Item " + (i + 1) + ": " + shoppingCart[i]);
        }
    }
}
       
 


