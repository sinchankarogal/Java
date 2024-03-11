package com.company;

class Book
{
    String title;
    int book_id;
    int price;

    public Book(String title,int book_id,int price){
        this.title=title;
        this.book_id=book_id;
        this.price=price;
    }
    public String getTitle(){
        return title;
    }
    public int getBook_id(){
        return book_id;
    }
    public int getPrice(){
        return price;
    }

}

class Author {
    String name;
    int author_id;

    public Author(String name, int author_id) {
        this.name = name;
        this.author_id = author_id;
    }

    public String getName(){
        return name;
    }
    public int getAuthor_id(){
        return author_id;
    }
}
class BookStore{
    int book_store_no;
    String location;
    public BookStore(int book_store_no,String location)
    {
        this.book_store_no=book_store_no;
        this.location=location;
    }
    public int getBook_store_no(){
        return book_store_no;
    }
    public String getLocation(){
        return location;
    }
}
public class lab2_Book {
    public static void main(String[] args) {
        System.out.println("Book details:");
        Book b=new Book("Forest of Enchantments",1,500);
        System.out.println(b.getTitle());
        System.out.println(b.getBook_id());
        System.out.println(b.getPrice());

        System.out.println("Author details:");
        Author a=new Author("Chaitra",1);
        System.out.println(a.getName());
        System.out.println(a.getAuthor_id());

        System.out.println("Book store Details:");
        BookStore b1=new BookStore(1,"Dharwad");
        System.out.println(b1.getBook_store_no());
        System.out.println(b1.getLocation());
    }
}
