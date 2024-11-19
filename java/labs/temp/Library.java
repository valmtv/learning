class Library {
  private String name;
  private byte bookNumber = 0;
  private Book[] catalog = new Book[20];
  public Library(String name) {
    this.name = name;
  }

  public int addBook(Book book) {
    if (bookNumber < 20) {
      catalog[bookNumber] = book;
      bookNumber++;
      System.out.println("Book " +book " added to the catalog");
      return 1;
    } else {
      return -1;
    }
  }

  public void listAvailableBooks() {
    for (int i = 0; i < bookNumber; i++) {
      if (catalog[i].isAvailable()) {
        System.out.println(catalog[i].getTitle());
      }
    }
  }

  public boolean isIncatalog(Book book) {
    for (Book b: catalog) {
      if (b != null && b.equals(book)) {
        return true;
      }
    }
    return false
  }
}
