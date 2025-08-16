import java.util.*;
public class QuestionService{
    Question[] questions=new Question[10];
    String [] selectedAnswer=new String[10];
    public QuestionService(){
        questions[0]=new Question(1,"What is the capital of India?","Delhi","Mumbai","Kolkata","Chennai","Delhi");
        questions[1]=new Question(2,"What is the largest planet in our solar system?","Earth","Mars","Jupiter","Saturn","Jupiter");
        questions[2]=new Question(3,"Who wrote 'To Kill a Mockingbird'?","Harper Lee","Mark Twain","Ernest Hemingway","F. Scott Fitzgerald","Harper Lee");
        questions[3]=new Question(4,"What is the chemical symbol for water?","H2O","CO2","O2","NaCl","H2O");
        questions[4]=new Question(5,"Who painted the Mona Lisa?","Vincent van Gogh","Pablo Picasso","Leonardo da Vinci","Claude Monet","Leonardo da Vinci");
        questions[5]=new Question(6,"What is the capital of France?","Berlin","Madrid","Paris","Rome","Paris");
        questions[6]=new Question(7,"What is the largest mammal?","Elephant","Blue Whale","Giraffe","Great White Shark","Blue Whale");
        questions[7]=new Question(8,"Who discovered penicillin?","Marie Curie","Alexander Fleming","Louis Pasteur","Albert Einstein","Alexander Fleming");
        questions[8]=new Question(9,"What is the hardest natural substance on Earth?","Gold","Diamond","Iron","Platinum","Diamond");
        questions[9]=new Question(10,"What is the main ingredient in guacamole?","Tomatoe", "Avocado", "Onion", "Pepper", "Avocado");
    }

    public void startExam() {
    System.out.println("Welcome to the Quiz!");
    int i = 0;
    Scanner sc = new Scanner(System.in);

    for (Question obj : questions) {
        boolean valid = false; // flag to check valid input
        while (valid!=true) { // keep asking until valid input
            System.out.println("Question ID: " + obj.getId());
            System.out.println("Question: " + obj.getQuestions());
            System.out.println("1. " + obj.getOption1());
            System.out.println("2. " + obj.getOption2());
            System.out.println("3. " + obj.getOption3());
            System.out.println("4. " + obj.getOption4());

            System.out.print("Enter your answer (1 to 4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer >= 1 && userAnswer <= 4) {
                switch (userAnswer) {
                    case 1:
                        selectedAnswer[i] = obj.getOption1();
                        break;
                    case 2:
                        selectedAnswer[i] = obj.getOption2();
                        break;
                    case 3:
                        selectedAnswer[i] = obj.getOption3();
                        break;
                    case 4:
                        selectedAnswer[i] = obj.getOption4();
                        break;
                }
                valid = true; // exit while loop if input is valid
            } else {
                System.out.println("Invalid option! Please try again.\n");
            }
        }
        i++;
    }
}

    public void scoreExam(){
        int score = 0;
        for(int i = 0; i < questions.length; i++) {
            if(selectedAnswer[i].equals(questions[i].getAnswer())) {
                score++;
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);
    }

}
