import java.util.Scanner;

/**
 * PostMain21
 */
public class PostMain21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Insert mathematical expression (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix21 post = new Postfix21(total);
        P = post.convert(Q);
        System.out.println("PostFix : " + P);
    }
}