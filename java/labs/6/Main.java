class Main {
  public static void main(String[] args) {

    Library library = new Library("City Library");

    Book book1 = new Book("Java Programming", "A", 3438753856385L, 3.4f);
    Book book2 = new Book("Data Structures", "B", 3578385738553L, 4.5f);
    Book book3 = new Book("Numerical Methods", "C", 7929473567385L, 4.9f);
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    Member member = new Member("Lukas");
    member.borrowBook(library, book1);
    member.borrowBook(library, book2);
    member.returnBook(book1);

    for( Book b: library.getCatalog()) {
      System.out.println(b);
    }
    library.removeBookFromCatalog(book1);
    for( Book b: library.getCatalog()) {
      System.out.println(b);
    }
  }
}
