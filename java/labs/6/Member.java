class Member {
  private String name;
  private byte borrowedNumber = 0;
  private Book borrowedBook = null;

  public Member(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public byte getBorrowedNumber() {
    return borrowedNumber;
  }
  public Book getBorrowedBook() {
    return borrowedBook;
  }
  public String toString() {
    if(borrowedNumber == 0) {
      return "" + name + " has borrowed no books";
    }
    return "" + name + " has borrowed: " + borrowedBook.toString();
  }
  public int borrowBook(Library library, Book book) {
    if (!library.isInCatalog(book)) {
      System.out.println("not is catalog");
      return -1;
    }
    if (!book.isAvailable()) {
      System.out.println("not is available");
      return -1;
    }
    if (borrowedNumber == 0) {
      System.out.println("borrowing the book");
      book.setAvailable(false);
      book.setWhoBorrowed(this);
      borrowedNumber++;
      borrowedBook = book;
      System.out.println("the book " + book + " is borrowed by "+ name);
      return 1;
    }
    else {
      System.out.println("too many borrowed");
      return -1;
    }
  }
    public int returnBook(Book book) {
      if (borrowedNumber == 0 || !borrowedBook.equals(book)) {
        System.out.println("Book is not returned");
        return -1;
      }
      book.setAvailable(true);
      book.setWhoBorrowed(null);
      borrowedNumber--;
      borrowedBook = null;
      System.out.println("The book " + book + " is returned");
      return 1;
    }

  

}
