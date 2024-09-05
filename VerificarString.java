import java.util.Scanner;

public class VerificarString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        char[] letras = palavra.toCharArray();

        int soma = 0;

        for (char letra : letras) {
            if (letra == 'a' || letra == 'A') {
                soma += 1;
            }
        }

        if (soma != 0) {
            System.out.println("A palavra contem a letra A " + soma + " vezes");
        }
        else {
            System.out.println("A palavra não contem a letra A");
        }


        sc.close();
    }
}
