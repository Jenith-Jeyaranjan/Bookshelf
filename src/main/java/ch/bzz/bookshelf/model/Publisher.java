package ch.bzz.bookshelf.model;

import java.util.List;

/*the publisher of one or more books */
public class Publisher {
    private String publisherUUID;
    private String publisher;
    private List<Book>booklist;

    public String getPublisherUUID() {
        return publisherUUID;
    }

    public void setPublisherUUID(String publisherUUID) {
        this.publisherUUID = publisherUUID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(List<Book> booklist) {
        this.booklist = booklist;
    }
}
