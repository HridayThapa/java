package com.wipro.java.interface1;

//Can implement multiple interfaces which is not possible to achieve using classes
//Multiple inheritance is not supported for classes in Java
public class Document implements Showable, Printable {

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("print");
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("show");
    }

    public static void main(String a[]) {
        Document doc1 = new Document();
        doc1.show();
        doc1.print();
    }
}
