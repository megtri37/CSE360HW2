/**
 * Represents a question with an ID and text.
 */
public class Question {
    private int id;
    private String text;

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        this.text = newText;
    }
}
