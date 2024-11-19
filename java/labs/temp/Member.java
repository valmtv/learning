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
    if ( borrowedNumber == 0 ) {
      return "" + name + " has not borrowed any book";
    }
    return "" + name + " has borrowed" + borrowedNumber;
  }
  public int borrowBook(Library library, Book book) {
    if (!library.isInCatalog(book)) {
      System.out.println("not in catalog");
      return -1;
    }
    if (!book.isAvailable()) {
      System.out.println("book is not available");
      return -1;
    }
    if (borrowedNumber == 0) {
      book.setIsAvailable(false);
      book.setWhoBorrowed(this);
      borrowedNumber++;
      borrowedBook = book;
      System.out.println("book is borrowed");
      return 1;
    } else {
      System.out.println("Too many borrowed books");
      return -1;
    }

    public int returnBook(Book book) {
    if (borrowedNumber == 1 && book.equals(borrowedBook)) {
      book.setIsAvailable(true);
      book.setWhoBorrowed(null);
      borrowedNumber--;
      borrowedBook = null;
      System.out.println("The book is returned");
      return 1;
    } else {
      System.out.println("Book is not returned");
      return -1;
    }
  }

}
