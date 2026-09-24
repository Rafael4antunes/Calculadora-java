
package project;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operacao;
        double num1, num2;
        System.out.println("Bem-Vindo a calculadora Digital");
        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextDouble();
        
        System.out.println("Selecione a operação da conta: ");
        operacao = scanner.next().charAt(0);
        
        switch (operacao) {
            
            case '-':
                System.out.println("O resultado e: " + (num1 - num2));
                break;
            
            case '+':               
                System.out.println("O resultado e: " + (num1 + num2));
                break;
                                
            case '*':               
                System.out.println("O resultado e: " + (num1 * num2));
                break;
                
            case '/':
                System.out.println("O resultado e: " + (num1 / num2));
                break;
                
            default:
                System.out.println("Digite uma operação existente!!");
                
        }
        scanner.close();
                
        }
                
        

    }
    
