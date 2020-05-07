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
public class Produto {
    
     //Atributos
    int codigo;
    String descricao;
    char setor;
    double preco,desconto;
    boolean disponivel;
    
    public void ExibirProduto(){
        
        if(setor =='P'){
            
            System.out.println("Setor: Produto");
            System.out.println("Código: " + codigo);
            System.out.println("Descrição: " + descricao);
            System.out.println("Preço:R$ " + preco);
            System.out.println(disponivel?"Disponivel em estoque":"não Disponível");
        
        } 
        
        else if( setor =='M'){
            
            System.out.println("Setor: Mercearia");
            System.out.println("Código: " + codigo);
            System.out.println("Descrição: " + descricao);
            System.out.println("Preço:R$ " + preco);
            System.out.println(disponivel?"Disponivel em estoque.":"não Disponível.");
            
        }
        
        else{
           System.out.println("Produto não cadastrado.");
        }
            
    }
    
    public void CalcularDesconto(){
        
        desconto = preco - (preco * 0.1);
        System.out.println("Valor final com o desconto de 10%: R$ " + desconto);
    }
}

