package projeto;

public class testes {

    public static void main(String[] args) {
        float[] notas = {2, 3, 4, 6, 17, 1, 0};
        
        float soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        
        float media = soma / notas.length;
        System.out.println("Média: " + media);
    }
}

