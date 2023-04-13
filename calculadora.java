package calculadora;

import java.util.Scanner;


public class calculadora {
 
    public static void main(String[] args) {
	
	float n1;
	float n2;
/*Declararando os números a serem utilizados como floats, caso a
        operação à ser feita não tenha como resultado um número inteiro.*/
        
	String  operacao = "";
	float control=0;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite a operação desejada (+, -, *, /, !): ");
	operacao = entrada.nextLine();
        
	System.out.println("Digite um valor: ");
	n1 = Integer.parseInt(entrada.nextLine());
        	
        
        if(operacao.equals("!")) {
		System.out.println("O resultado da exponenciação é: " +(n1 * n1));
		control++; 
/*Coloquei a exponenciação de fora do else pra quando fosse selecionada a,
  opção de "!", o programa não printasse novamente a opção de digitar um valor.*/                
	}
        else{
	System.out.println("Digite um valor: ");
	n2 = Integer.parseInt(entrada.next());
	
        if(operacao.equals("+")) {
		System.out.println("O resultado da subtração é: " +(n1 + n2));
		control++;			
	}
	
	if(operacao.equals("-")) {
		System.out.println("O resultado da subtração é: " +(n1 - n2));
		control++;		
	}
	
	if(operacao.equals("*")) {
		System.out.println("O resultado da multiplicação é: " +(n1 * n2));
		control++;			
	}
	
	if(operacao.equals("/")) {
		System.out.println("O resultado da divisão é: " +(n1 / n2));
		control++;			
	}
/*Igualei cada sinal à sua respectiva operação que seria realizada na
          calculadora.*/      
	
	if(control == 0) {
		System.out.println("Operação inválida, Tente novamente!");					
	}
        }
}
}
