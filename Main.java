public class Main {
    public static void main(String[] args) {
        String message = "Olá, mundo!";

        // length(): retorna o tamanho da string
        System.out.println("Tamanho da string: " + message.length()); // retorna 12

        // charAt(): retorna o caractere na posição especificada
        System.out.println("Caractere na posição 4: " + message.charAt(4)); // retorna ','

        // substring(): retorna uma substring a partir da string original
        System.out.println("Substring a partir da posição 5: " + message.substring(5)); // retorna "mundo!"

        // indexOf(): retorna a posição da primeira ocorrência da substring especificada
        System.out.println("Índice de 'mundo' na string: " + message.indexOf("mundo")); // retorna 5
    }
}
