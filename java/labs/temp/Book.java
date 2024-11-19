class Book {
  private String title;
  private String author;
  private long isbn;
  private  float rating;
  boolean isAvailable = true;
  Member whoBorrowed = null;
  Book(String title, String author, long isbn, float rating) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.rating = rating;
  }
  public float getRating() {
    return rating;
  }
  public boolean getIsAvailable() {
    return isAvailable;
  }
  public Member getWhoBorrowed() {
    return whoBorrowed;
  }
  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }
  public void setWhoBorrowed(Member whoBorrowed) {
    this.whoBorrowed = whoBorrowed;
  }
  public boolean equals(Book book) {
    return this.isbn == book.isbn;
  }
  public String toString() {
    return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
  }
}
