/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lista3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author liandrar
 */
public class Lista3 {
    static Scanner scan = new Scanner(System.in);
    static Funcionario[] funcs = new Funcionario[5];
    
   
    
    public static void exibirFuncionarioPane(Funcionario funcs) {
        String texto = "Nome: " + funcs.getNome()
                + "\nSalario: " + funcs.getSalario()
                + "\nIRPF: " + funcs.calcularIrpf();
        JOptionPane.showInputDialog(null, texto);
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Mensagem de Erro","Erro", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"AVISO","AVISO", JOptionPane.WARNING_MESSAGE);
        //Funcionario func = cadastrarFuncionarioPane();
        //exibirFuncionarioPane(func);
    }
    
    public static Funcionario cadastrarFuncionarioPane(){
        
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionario: ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o salario"));
       
        Funcionario func = new Funcionario();

        func.setNome(nome);
        func.setSalario(salario);
        
        return func;
    }
}
