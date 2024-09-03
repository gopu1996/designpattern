package org.designpattern.behavioral.iterator;

public class Test {

    public static void main(String[] args) {
          ProductCollection productCollection =  new ProductCollection();
          productCollection.addProduct(new Product().setProductName("I Phone"));;
          productCollection.addProduct(new Product().setProductName("Samsung"));
          productCollection.addProduct(new Product().setProductName("Rog 3"));

          Iterator i = productCollection.createIterator();

            while (i.hasNext()){
                Product next = (Product) i.next();
                System.out.println(next.productName());
            }


    }
}
