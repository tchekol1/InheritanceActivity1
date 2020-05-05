import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        System.out.print("Enter the Book Code: ");
        String code = keybd.nextLine();
        Book b = new Book();
        b.setCode(code);
        b.setAuthor("Dave W.");
        b.setPrice(59.99);
        b.setDescription("Java programming book");
        System.out.println(b.toString());
        System.out.println();
        Book c = new Book();
        c.setCode("Book 8910");
        c.setAuthor("Dave W.");
        c.setPrice(49.99);
        c.setDescription("Python programming book");
        Book d=new Book();
         d=c;
        System.out.println(c.toString());
        System.out.println();
        Software s = new Software();
        s.setCode("Program1234");
        s.setDescription("Spreadsheet");
        s.setPrice(999.99);
        s.setOs("Windows");
        s.setProgrammer("Fi");
        s.setPlatform("Mac");
        System.out.println(s.toString());
        System.out.println("======");
        //Number of products
        System.out.println("Number of Products "+ Product.getCount());
//      comparing book two books
        System.out.println(b.equals(c));
        System.out.println(d.equals(c));



    }
}

