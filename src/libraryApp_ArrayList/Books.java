package libraryApp_ArrayList;

/*
Store books name
Add to the library
Remove from teh library
Search on the basis of subject
 */
public class Books {
    String title, author, subject;
    int price;
    int isbn;

    public Books(){
        title = "";
        author = "";
        subject = "";
        price = 0;
        isbn = 0;
    }

    public Books(String title, String author, String subject, int price, int isbn){
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.price = price;
        this.isbn = isbn;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getSubject(){
        return subject;
    }

    public int getPrice(){
        return price;
    }

    public int getIsbn(){
        return isbn;
    }


    public String toString(){
        return "The book you have added is: \nTitle : " + this.title + "\nAuthor: " + this.author + "\nSubject: " + this.subject + "\nPrice: " + this.price + "\nISBN: " + this.isbn;
    }
}
