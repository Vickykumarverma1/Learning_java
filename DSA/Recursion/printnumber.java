public class printnumber {
    public static void main(String[] args) {
        int n = 3;
        printnum(3);
    }

 static void printnum(int i) {
        if(i == 0)
        {
            return;
        }
     System.out.print(i);
        printnum(i-1);
     System.out.print(i);
    }
}
