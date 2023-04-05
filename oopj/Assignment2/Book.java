class BookEntity {
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    double price;
    int quantity;
    BookEntity(){}
    BookEntity(String title,String author, String publisher, String isbn, int year, double price,int quantity){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.isbn=isbn;
        this.year=year;
        this.price=price;
        this.quantity=quantity;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void increaseQuantity(int quantity){
        this.quantity=this.quantity+quantity;
    }
    void decreaseQuantity(int quantity){
        if(this.quantity>=quantity)
            this.quantity=this.quantity-quantity;
        else
            System.out.println("Decresing the quantity is not possible");
    }
    void getInventoryValue(){
        System.out.println("Inventory Value: " + (price*quantity));
    }
    
}

class Book{
    public static void main(String args[]){
        BookEntity be = new BookEntity("Mrutyunjay", "Shivaji Sawant", "abc", "a1b2c3", 1996, 300, 17);
        be.setPublisher("Dnyanam");
        be.getInventoryValue();
        be.increaseQuantity(17);
        be.getInventoryValue();
        be.decreaseQuantity(7);

        System.out.println("title: "+be.getTitle()+", author: "+be.getAuthor()+", publisher: "+be.getPublisher());
        be.getInventoryValue();
    }
}
