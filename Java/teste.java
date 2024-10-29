import  java.until.Scanner

public class PesquisaLinear {
    public static int pesquisar(int[] vetor, int elemento) {
        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
    return -1;
    }
    

    public static void main (string[] args) {
        int[] vetor = {10,20,30,40,50}
        int elemento = 30

        int resultado = pesquisar(vetor,elemento);

        if (resultado != -1) {
            System.out.println("Elemento encontrado na posição: " + resultado);
        } else {
            System.out.println("Elemento não encontrado no vetor".); 
        }
    }
}