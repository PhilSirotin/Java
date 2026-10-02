public class MainBook {
  public static void main(String[] args) {
    Library library = new Library();
    
    library.addBook(new Book("Master and Margarita", "Mikhail Bulgakov", 1967));
    library.addBook(new Book("Prestuplenie i Nakazanie", "Fedor Dostoevskiy", 1866));

    Book foundBook = library.searchBook("Master and Margarita");
    if(foundBook != null) {
      System.out.println("Book found: " + foundBook);
    } else {
      System.out.println("Book didn't found");
    }

    library.removeBook("Prestuplenie i Nakazanie");
  }
  
}
