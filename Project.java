package project;

import javax.swing.JOptionPane;

public class Project {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bem-Vindo à Calculadora Digital!");
       
        while(true){
                   
        try {            
            String operacao = JOptionPane.showInputDialog(
                    "Selecione a operação da conta: \n" +
                    "- = Subtração\n" +
                    "+ = Soma\n" +
                    "* = Multiplicação\n" +
                    "/ = Divisão"
            );
            String text = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
                if (text == null) return;

            String text1 = JOptionPane.showInputDialog(null, "Digite o segundo número: ");
                if (text1 == null) return;
                
            double num1 = Double.parseDouble(text);
            double num2 = Double.parseDouble(text1);
        
            if (operacao == null) return;
            
            double resultado = 0;
            boolean operacaoValida = true;
            
            // Usando switch com Strings (compatível com Java 7+)
            switch (operacao.trim()) {
                case "-":
                    resultado = num1 - num2;
                    break;
                case "+":
                    resultado = num1 + num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Não é possível dividir por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                        operacaoValida = false;
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma operação existente!!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    operacaoValida = false;
            }
            

            if (operacaoValida) {
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, digite apenas números válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        int outra = JOptionPane.showConfirmDialog(null, "Fazer outra conta??", "Calculadora", JOptionPane.YES_NO_OPTION);
            if (outra != JOptionPane.YES_NO_OPTION) {
                return;
            }
        }
    }
}
