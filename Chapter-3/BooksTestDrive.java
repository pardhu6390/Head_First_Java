class Books {
    String title;
    String author;
}

public class BooksTestDrive {
    public static void main(String[] args){
        Books [] myBooks = new Books[3];
        int x = 0;
       myBooks[0]   = new Books(); // Objects Declaration
       myBooks[1]   = new Books(); // Objects declaration
        myBooks[2]  = new Books(); // Objects declaration
        myBooks[0].title = "The grapes of java";
        myBooks[1].title = "The java Gatsby";
        myBooks[2].title = "The java cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        
        while (x < 3) {
            System.out.print(myBooks[x].title); // first it prints title
            System.out.print(" by ");     //it prints by with space
            System.out.println(myBooks[x].author); // author name - the grapes of java by bob
            x = x + 1;
        
        }
    }
 
}