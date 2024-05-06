import java.util.Scanner;

/**
 * StackMain21
 */
public class StackMain21 {

    public static void main(String[] args) {
        Stack21 st = new Stack21(8);
        Scanner sc = new Scanner(System.in);

        char choose;
        do {
            System.out.print("Title : ");
            String title = sc.nextLine();

            System.out.print("Author Name : ");
            String name = sc.nextLine();

            System.out.print("Published year : ");
            int year = sc.nextInt();

            System.out.print("Pages Amount: ");
            int Pages = sc.nextInt();

            System.out.print("Price: ");
            int price = sc.nextInt();

            Book21 bk = new Book21(title, name, year, Pages, price);
            System.out.print("Do you want to add new data to stack (y/n)? ");
            choose = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);

        } while (choose == 'y');

        st.print();
        st.pop();
        st.peek();
        st.print();;
    }
}