
package ex3_3;
import java.util.ArrayList;

public class User implements Source{
    private final ArrayList<MyObserver> list;
    private String Score;
    
    public User(){
        this.list = new ArrayList<>();
    }
    
    public void setScore(String nScore){
        Score = nScore; 
        notifyObserver();
    }
    
    public String getScore(){
        return Score;
    }
    
    @Override
    public void notifyObserver(){
        for (int j = 0; j < list.size();j++){
            list.get(j).update(this);
        }
    }
    
    @Override
    public void register(MyObserver obsever){
        list.add(obsever);
    }
}
