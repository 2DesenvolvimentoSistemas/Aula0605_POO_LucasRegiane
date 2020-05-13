/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Akio
 */
public class TesteProduto {
    
    public static void main(String[] args) {
        
     // Construção do objeto produto
     
     Produto produto = new Produto();
     
       
       produto.codigo = 2545;
       produto.descricao= "Chocolate Lacta Diamante negro";
       produto.preco  = 5;
       produto.setor = 'M'; //P = Privado e M = Mercearia
       produto.disponivel =true;
       
       
       // Imprimir os dados do Produto
       
       System.out.println("\n\t\t ------ Produto ------\n");
       produto.ExibirProduto();
       
        
       // Calcular o desconto do Produto
       
       produto.CalcularDesconto();
       
       // Imprimir o Produto com desconto 

        System.out.println("\n\t\t ------Produto com desconto ------\n");
       produto.ExibirProduto();
           
      
               
    }
      
    }
    

