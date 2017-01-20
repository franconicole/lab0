public class Fibonacci {

    public static int fibonacci(int n) {
        int result;
        if (n == 0) {
            result = 0;
        } else if (n==1) {
            result=1;
        } else {
            result = fibonacci(n-1) + fibonacci(n-2); 
        }
        return result;
    }


    // NO MODIFICAR A PARTIR DE AQUI

    public static void main(String[] args) {
        if(args.length > 0) {
            int n = Integer.parseInt(args[0]);
            System.out.println("Fibonacci de " + n + ": " + fibonacci(n));
        } else {
            System.err.println("No se paso ningun argumento");
        }
    }

}
