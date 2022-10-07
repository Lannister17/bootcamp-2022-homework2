package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product =new Product(16,"Laptop","Aplle Notebook",20000,5);
//        Product product= new Product();
//        product.setName("Laptop");
//        product.setId(17);
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setPrice(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
