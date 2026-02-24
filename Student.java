public class Student {       
    String name;             
    int score;                
    
    public Student(String name, int score) {   
        this.name = name;
        this.score = score;
    }
    
    public void score() {    
        System.out.println(name + "考了" + score);
    }
}                           