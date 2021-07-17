package exercicios.s13e02.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();


    // constructors

/*    public Post() {
    }*/

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    // getters and setters

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // when one wants to print an object that is made of the concatenation of several small strings,
    // override toString method would be too memory consuming. In those cases, it's better to create
    // a String Builder object, that will receive and assemble every string and format them in a more
    // printable-friendly way.

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title)
                .append("\n")
                .append(likes)
                .append(" Likes - ")
                .append(moment.format(formatter))
                .append("\n")
                .append(content)
                .append("\n")
                .append("Comments: ")
                .append("\n");
        for (Comment c : comments) {
            stringBuilder.append(c.getText()).append("\n");
        }
        return stringBuilder.toString();

/*
        return title
                + "\n"
                + likes +
                + " Likes - "
                + moment
                + "\n"
                + content
                + "\n"
                + "Comments: \n";
            for (Comment c : comments) {
            stringBuilder.append(c.getText());
*/
    }


    // class methods

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

}
