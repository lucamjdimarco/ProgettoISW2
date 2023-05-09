package org.example;

public class Commit {
    private String id;
    private String author;
    private String date;
    private String ticket;

    public Commit(String id, String message, String author, String date, String url) {
        this.id = id;

        this.author = author;
        this.date = date;
        this.ticket = ticket;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getTicket() {
        return ticket;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /*public String toString() {
        return "Commit [id=" + id + ", author=" + author + ", date=" + date + ", ticket=" + ticket + "]";
    }*/
}
