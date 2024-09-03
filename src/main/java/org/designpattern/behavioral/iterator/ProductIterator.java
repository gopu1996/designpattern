package org.designpattern.behavioral.iterator;

public class ProductIterator  implements Iterator{

    Product[] products;

    public ProductIterator(Product[] products){
        this.products = products;

    }

    int pos =0;

    @Override
    public boolean hasNext() {
        if(pos >= products.length || products[pos] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        return products[pos++];
    }
}
