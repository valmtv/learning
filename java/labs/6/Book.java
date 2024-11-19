class Book {
  private String title;
  private String author;
  private long ibsn;
  private float rating;
  private boolean isAvailable = true;
  private Member whoBorrowed = null;
  public Book(String title, String author, long ibsn, float ratung) {
     this.title = title;
     this.author = author;
     this.ibsn= ibsn;
     this.rating = rating;
  }
  public String getTitle() {
    return title;
  }
  public String getAuthor() {
    return author;
  }
  public long getIsbn() {
    return ibsn;
  }
  public float getRating() {
    return rating;
  }
  public boolean isAvailable() {
    return isAvailable;
  }
  public void setAvailable(boolean available) {
    isAvailable = available;
  }
  public Member getWhoBorrowed() {
    return whoBorrowed;
  }
  public void setWhoBorrowed(Member whoBorrowed) {
    this.whoBorrowed = whoBorrowed;
  }
  public boolean equals(Book book) {
    return ibsn == book.getIsbn() ||
        title == book.getTitle() ||
        author == book.getAuthor() ||
        rating == book.getRating();
  }
  public String toString() {
    return title + " by " + author + " ibsn: " + ibsn;
  }
}
