import java.util.Scanner;

public class QuestionService {
    
    Question questions[] = new Question[5];
    String[] res = new String[5];

    public QuestionService() {

        questions[0] = new Question(1, "2 + 2 = ?", "1", "2", "3", "4", "4");

        questions[1] = new Question(2, "Capital of India?", "Mumbai", "Delhi", "Chennai", "Kolkata", "Delhi");

        questions[2] = new Question(3, "Java is a?", "Language", "Browser", "OS", "Database", "Language");

        questions[3] = new Question(4, "5 * 3 = ?", "10", "15", "20", "25", "15");

        questions[4] = new Question(5, "Sun rises in?", "North", "South", "East", "West", "East");
    }

    public void playQuiz(){
        int ind = 0;
        for(Question q : questions){
            System.out.println("Question no: " + q.getId());
            System.out.println("Q -> : " + q.getQuestion());
            System.out.println("A : " + q.getOp1());
            System.out.println("B : " + q.getOp2());
            System.out.println("C : " + q.getOp3());
            System.out.println("D : " + q.getOp4());

            Scanner sc = new Scanner(System.in);

            String ans = sc.nextLine();

            res[ind] = ans;
            ind++;
 
        }
    }

    public void showScore(){

        int score = 0;

        for(int i = 0; i < questions.length; i++){

            if(res[i].equals(questions[i].getCorrectAns())){
                score++;
            }
        }
        System.out.println("You scored " + score + " points");
    }

    
}
