package Project1pck;

public class student {
    


    private int score;
    private String name;
    
    student(int initScore, String initName) {
        this.score = initScore;
        this.name = initName;
    }
    
    public void setName(String nameParam) {
        this.name = nameParam;
    }
    
    public void setScore(int scoreParam) {
        this.score = scoreParam;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getScore() {
        return this.score;
    }
    

    public int compareTo(student element) {
        // TODO Auto-generated method stub
        if (this.score > element.getScore()) {
            return -1;
        } else {
            return 1;
        }
    }
}
