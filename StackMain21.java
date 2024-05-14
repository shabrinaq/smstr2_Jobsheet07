import java.util.Scanner;

public class StackMain21 {

    public static void main(String[] args) {
        Stack21<Book21> st = new Stack21<>(8);
        Scanner sc = new Scanner(System.in);

        char choose;
        do {
            System.out.println("Stack Operations");
            System.out.println("----------------");
            System.out.println("1. Push");
            System.out.println("2. Peek");
            System.out.println("3. Pop");
            System.out.println("4. Print");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.println("-----------------------");
            System.out.print("Enter your choice: ");
            choose = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("-----------------------");

            switch (choose) {
                case '1':
                    System.out.print("Title: ");
                    String title = sc.nextLine();
    
                    System.out.print("Author Name : ");
                    String name = sc.nextLine();
    
                    System.out.print("Published year : ");
                    int year = sc.nextInt();
    
                    System.out.print("Pages Amount: ");
                    int pages = sc.nextInt();
    
                    System.out.print("Price: ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    
                    Book21 data = new Book21(title, name, year, pages, price);
                    st.push(data);
                    break;
                case '2':
                    try {
                        System.out.println("Top element: " + st.peek());
                    } catch (Exception e) {
                        System.out.println("Stack is empty");
                    }
                    break;
                case '3':
                    try {
                        Book21 popped = st.pop();
                        System.out.println("Removed data: " + popped);
                    } catch (Exception e) {
                        System.out.println("Stack is empty");
                    }
                    break;
                case '4':
                    st.print();
                    break;
                case '5':
                    st.clear();
                    break;
                case '6':
                    System.out.println("Exiting Program");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }   
        } while (choose != '6');
        sc.close();
    }
}
