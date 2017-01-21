public class Perm {

    // Asuma que todos los parametros son validos
    public static String permutation(String message, int spaces) {
        String result = "";
        int pivote = 0;
        if (spaces==26) {
            return message;
        } else if (spaces>26){
            spaces=spaces-26;
        }
            for (int i = 0; i<message.length();i++){
                result = result.concat(  String.valueOf  ( (char) (((int)message.charAt(i)) + spaces)  ) );
               
            }
        return result;
    }

    // NO MODIFICAR A PARTIR DE AQUI

    public static void main(String[] args) {
        if(args.length > 0) {
            String entry = args[0];
            int spaces = Integer.parseInt(args[1]);
            System.out.println(permutation(entry, spaces));
        } else {
            System.err.println("No se paso ningun argumento");
        }
    }

}
