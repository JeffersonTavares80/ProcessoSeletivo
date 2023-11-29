public class App {
    public static void main(String[] args) {
        String palavra = "Ana";
        palavra = palavra.toLowerCase();
        String palavraDeTrasParaFrente = "";

        for(int i = palavra.length()-1;i>=0;i--){
            palavraDeTrasParaFrente = palavraDeTrasParaFrente + palavra.charAt(i);
        }

        boolean palindromo = palavra.equals(palavraDeTrasParaFrente);
        System.out.println("É um palíndromo? "+ palindromo);
    }
}
