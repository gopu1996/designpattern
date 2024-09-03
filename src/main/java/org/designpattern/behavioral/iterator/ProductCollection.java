package org.designpattern.behavioral.iterator;

public class ProductCollection implements Collection{

    int nnOfProduct = 0;
    Product[] products;

    public ProductCollection() {
        products =new Product[10];
    }

    void addProduct(Product product){

        products[nnOfProduct] = product;
        nnOfProduct++;

    }

    @Override
    public Iterator createIterator() {
         return  new ProductIterator(products);
    }
}
