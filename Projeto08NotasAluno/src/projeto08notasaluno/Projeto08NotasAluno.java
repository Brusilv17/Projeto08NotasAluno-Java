/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto08notasaluno;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Projeto08NotasAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Solicite ao usuario que informe o nome do aluno e
        // suas três notas de 0 a 10 e calcule a média e teste
        // as condicoes:
        // 1 - se a media for menor ou igual a 5 > Reprovado
        // 2 - se a média for menor ou igual a 7 > Aprovado
        // 3 - se a media for menor ou igual a 9 > muito bom
        // 4 - se a media for maior que 9 > excelente

        Scanner s = new Scanner(System.in);
        String nome, condicao;
        int n1, n2, n3;
        float m;

        System.out.println("Digite o nome do aluno: ");
        nome = s.nextLine();

        System.out.println("Digite a primeira nota: ");
        n1 = s.nextInt();

        System.out.println("Digite a segunda nota: ");
        n2 = s.nextInt();

        System.out.println("Digite a terceira nota: ");
        n3 = s.nextInt();

        m = (n1 + n2 + n3) / 3;
        
        if(m <= 5){
            condicao = "Reprovado";
        }else if(m > 5 && m <= 7){
            condicao = "Aprovado";
        }else if(m > 7 && m <= 9){
            condicao = "Muito Bom";
        }else{
            condicao = "Excelente";
        }
        
        System.out.println("Condição do(a) aluno(a) " + nome + ": " + condicao + " com média " + m);
    }

}
