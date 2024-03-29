public class Main {
    public static void main(String[] args){
        int x = 0;
        int gimes = 0;
        int amzius = 2024;

        do{
            if(x < 2007)
            {
                System.out.println("Asmuo gimęs " + gimes + " metais" + " dabar būtų " + amzius + " metų," + " jis būtų pilnametis.");
                x++; gimes++; amzius--;
            }
            else if(x > 2006)
            {
                System.out.println("Asmuo gimęs " + gimes + " metais" + " dabar būtų " + amzius + " metų," + " jis būtų nepilnametis.");
                x++; gimes++; amzius--;
            }
        }while(x <= 2024);
}}