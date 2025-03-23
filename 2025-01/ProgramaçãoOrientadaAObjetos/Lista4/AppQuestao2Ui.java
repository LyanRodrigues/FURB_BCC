/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4.View;

import com.mycompany.lista4.Model.Retangulo;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author liandrar
 */
public class AppQuestao2Ui {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o comprimento do retangulo: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura do retangulo: "));
        Retangulo retangulo = new Retangulo();
        JOptionPane.showMessageDialog(null, "A area do seu retangulo é de: " + retangulo.calcularArea());
        JOptionPane.showMessageDialog(null, "O perimetro do seu retangulo é de: " + retangulo.calcularPerimetro());
    }
}
