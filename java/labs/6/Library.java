public class Library {
  private String name;
  private byte bookNumber = 0;
  private Book[] catalog = new Book[20];

  public Library(String name) {
    this.name = name;
  }

  public Book[] getCatalog() {
    Book[] availableBooks = new Book[bookNumber];
    System.arraycopy(catalog, 0, availableBooks, 0, bookNumber);
    return availableBooks;
  }

  public int addBook(Book book) {
    if (bookNumber >= 20) {
      return -1;
    }
    catalog[bookNumber++] = book;
    System.out.println("Book " + book + " was added");
    return 1;
  }

  public boolean isInCatalog(Book book) {
    for (Book b : catalog) {
      if (b != null && b.equals(book)) {
        return true;
      }
    }
    return false;
  }

  public int removeBookFromCatalog(Book book) {
    int index = -1;
    for (int i = 0; i < bookNumber; i++) {
      if (catalog[i].equals(book) && catalog[i].isAvailable()) {
        index = i;
        break;
      }
    }
    if (index == -1) return -1;

    for (int i = index; i < bookNumber - 1; i++) {
      catalog[i] = catalog[i + 1];
    }
    catalog[--bookNumber] = null;
    return index;
  }
}

