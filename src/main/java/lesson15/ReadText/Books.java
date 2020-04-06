package main.java.lesson15.ReadText;

public class Books {

    private String authorName;
    private String titleOfTheBook;

    public String getAuthorName() {
        return authorName;
    }

    public String getTitleOfTheBook() {
        return titleOfTheBook;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setTitleOfTheBook(String titleOfTheBook) {
        this.titleOfTheBook = titleOfTheBook;
    }

    @Override
    public String toString() {
        return "Books{" +
                "authorName='" + authorName + '\'' +
                ", titleOfTheBook='" + titleOfTheBook + '\'' +
                '}';
    }
}

