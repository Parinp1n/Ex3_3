
package ex3_3;

import java.util.Scanner;

public class Ex3_3 {

    public static void main(String[] args) {
        Observer1 o1 = new Observer1();
        Observer2 o2 = new Observer2();
        User u = new User();
        u.register(o1);
        u.register(o2);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Score ");
        String score = in.nextLine();
        u.setScore(score);
        in.close();
    }
    
}
