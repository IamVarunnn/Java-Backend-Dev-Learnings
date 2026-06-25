
import java.util.Scanner;

class QuestionService{

    Question[] questions = new Question[5];
    String[] res = new String[questions.length];
    public QuestionService() {
        questions[0] = new Question(1, "Which language is platform independent?", "Java", "C", "C++", "Python", "Java");
        questions[1] = new Question(2, "Which keyword is used to inherit a class in Java?", "implements", "extends", "inherits", "super", "extends");
        questions[2] = new Question(3, "Which method is the entry point of a Java program?", "start()", "main()", "run()", "init()", "main()");
        questions[3] = new Question(4, "Which company originally developed Java?", "Google", "Microsoft", "Sun Microsystems", "Oracle", "Sun Microsystems");
        questions[4] = new Question(5, "Which of the following is not a Java primitive data type?", "int", "boolean", "String", "double", "String");
    }

    

    public void playQuiz(){
        
        for(int i = 0; i < questions.length; i++){

            System.out.println();
            System.out.println("Question no. " + questions[i].getId());
            System.out.println("Option 1: " + questions[i].getOp1());
            System.out.println("Option 2: " + questions[i].getOp2());
            System.out.println("Option 3: " + questions[i].getOp3());
            System.out.println("Option 4: " + questions[i].getOp4());

           System.out.println();
           
            Scanner sc = new Scanner(System.in);


            res[i] = sc.nextLine();
        }
         System.out.println();
         
    }

    public void printScore(){

        int score = 0;

        for(int i = 0; i < res.length; i++){

            String right = questions[i].getAns();
            String user = res[i];

            if(right.equals(user)){
                score++;
            }
        }

        System.err.println("Your Total Score is: " + score);
    }
}