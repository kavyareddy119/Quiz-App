public class QuestionsFactory {
    public Questions getQuestions(String topic) {
        if (topic.equals("AOOP")) {
            return new AOOPQuestions();
        } else if (topic.equals("DSA")) {
            return new DSAQuestions();
        } else if (topic.equals("FDS")) {
            return new FdsQuestions();
        } else if (topic.equals("OS")) {
            return new OSQuestions();
        }
        return null;
    }
}
