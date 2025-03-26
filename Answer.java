/**
 * Represents an answer associated with a question.
 */
public class Answer {
    private int id;
    private String text;
    private boolean accepted;

    public Answer(int id, String text) {
        this.id = id;
        this.text = text;
        this.accepted = false;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void accept() {
        this.accepted = true;
    }
}
