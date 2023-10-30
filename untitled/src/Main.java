public class Main {
    public static void main(String[] args) {

        char x = 'o';
        checkChar(x);
    }



    static void checkChar(char c){
        if (Character.isDigit(c)){
            System.out.println("Il carattere è un numero");
        } else {
            throw new ArithmeticException("carattere non è un numero");
        }
    }
}