public class Home{
    public static void main(String args[]){
        QuestionService questionService = new QuestionService();
        questionService.startExam();
        questionService.scoreExam();
    }
}
