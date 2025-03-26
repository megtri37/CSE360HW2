import java.util.HashMap;
import java.util.Map;

/**
 * Manages questions and answers.
 */
public class QuestionService {
    private Map<Integer, Question> questions = new HashMap<>();
    private Map<Integer, Answer> answers = new HashMap<>();
    private int questionCounter = 1;
    private int answerCounter = 1;

    /**
     * Creates and stores a question.
     */
    public Question createQuestion(String text) {
        Question q = new Question(questionCounter++, text);
        questions.put(q.getId(), q);
        return q;
    }

    /**
     * Retrieves a question by ID.
     */
    public Question getQuestion(int id) {
        return questions.get(id);
    }

    /**
     * Updates a question's text.
     */
    public void updateQuestion(int id, String newText) {
        if (questions.containsKey(id)) {
            questions.get(id).setText(newText);
        }
    }

    /**
     * Deletes a question by ID.
     */
    public void deleteQuestion(int id) {
        questions.remove(id);
    }

    /**
     * Creates an answer for a question.
     */
    public Answer createAnswer(int questionId, String text) {
        if (!questions.containsKey(questionId)) return null;
        Answer a = new Answer(answerCounter++, text);
        answers.put(a.getId(), a);
        return a;
    }

    /**
     * Marks an answer as accepted.
     */
    public void acceptAnswer(int answerId) {
        if (answers.containsKey(answerId)) {
            answers.get(answerId).accept();
        }
    }

    /**
     * Retrieves an answer by ID.
     */
    public Answer getAnswer(int id) {
        return answers.get(id);
    }
}
