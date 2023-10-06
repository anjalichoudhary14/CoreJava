package task1;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
 class Main {
    public static void main(String[] args) {

        Product[] products = {new Product(1, 4000),
                              new Product(2, 3000),
                              new Product(3, 569)};

        for (Product product : products) {
            System.out.println(product.toString());
            if(product.id == 1) {
                product.increaseBalanceBy(2000);
            }
            System.out.println(product.toString());
            //product.printdetails(1);

        }

        int searchId=3;

        for(int i=0; i<products.length; i++){
            Product p = products[i];
            if(searchId == p.id){
                System.out.println("output: "+p);
            }
        }



    }
}
