
package ex3_3;

public class Observer2 implements MyObserver{
    
    @Override
    public void update(Source o){
        System.out.println("live result: "+((User)o).getScore());
    }
}
