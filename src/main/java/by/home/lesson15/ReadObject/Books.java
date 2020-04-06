package by.home.lesson15.ReadObject;

public class Books {
    private String authorName;
    private String titleOfTheBook;

    public Books(String authorName, String titleOfTheBook) {
        this.authorName = authorName;
        this.titleOfTheBook = titleOfTheBook;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitleOfTheBook() {
        return titleOfTheBook;
    }


    @Override
    public String toString() {
        return "Books{" +
                "authorName='" + authorName + '\'' +
                ", titleOfTheBook='" + titleOfTheBook + '\'' +
                '}';
    }
}
