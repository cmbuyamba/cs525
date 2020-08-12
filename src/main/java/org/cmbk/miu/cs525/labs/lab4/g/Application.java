package org.cmbk.miu.cs525.labs.lab4.g;

public class Application {
    public static void main(String[] args) {
        Category main = new Category("Root");
        Category books = new Category("Book");
        Category textBooks = new Category("Text books");
        Product java = new Product("Java", 10);
        Product sql = new Product("SQL", 10);
        textBooks.addComponent(java);
        textBooks.addComponent(sql);
        Category childrenBooks = new Category("Children books");
        Product math = new Product("Math", 5);
        childrenBooks.addComponent(math);
        books.addComponent(textBooks);
        books.addComponent(childrenBooks);
        main.addComponent(books);
        Category computers = new Category("Computer");
        Category laptops = new Category("Laptop");
        Category software = new Category("Software");
        computers.addComponent(laptops);
        computers.addComponent(software);
        main.addComponent(computers);
        Category foods = new Category("Food");
        main.addComponent(foods);

        main.print();
    }
}
