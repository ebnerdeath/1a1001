package br.com.potencial.view;
/**O método Calcula() dessa classe verifica quantos números 1 tem de 1 a 1001.
 * @author Ebner Matias Trigo da Silva
 * Turma - ANAS 4 - Período Noturno
 */
public class Calcula {
    
    public static void Calcula(){
        int inicio = 1;
        int fim = 1001;
        int tamanho = 0;
        int cont = 0;
        String caractere;

        for(int i = inicio;i<=fim;i++){
            caractere = String.valueOf(i);
            tamanho = caractere.length();
            for(int t=0;t<tamanho;t++){
                if(caractere.charAt(t)=='1'){
                    cont++;
                }
            }
        }
        System.out.println("A quantidade de números 1 de acordo com o período de 1 a 1001 é de: "+cont); 
    } 
}
