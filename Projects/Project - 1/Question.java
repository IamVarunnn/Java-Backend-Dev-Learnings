public class Question {
    private int id;
    private String question;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    private String correctAns;

    public Question(int id, String question, String op1, String op2, String op3, String op4, String correctAns) {
        
        this.id = id;
        this.question = question;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        
        this.correctAns = correctAns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question{");
        sb.append("id=").append(id);
        sb.append(", question=").append(question);
        sb.append(", op1=").append(op1);
        sb.append(", op2=").append(op2);
        sb.append(", op3=").append(op3);
        sb.append(", op4=").append(op4);
        sb.append(", correctAns=").append(correctAns);
        sb.append('}');
        return sb.toString();
    }


}
