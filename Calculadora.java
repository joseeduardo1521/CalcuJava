/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author josee
 */
public class Calculadora extends JFrame implements ActionListener {
 private JButton btnsuma,btnresta,btnmulti,btndiv,btnlimpiar,btnpor,btnpotencia,btnsalir;
 private JTextField valor1,valor2,camporesultado;
 JLabel label1,label2;
  
 
 public void Controles(){
   
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout());
   label1 = new JLabel("Numero 1");
      contenedor.add(label1);
      valor1 = new JTextField(10);
      contenedor.add(valor1);
     label2 = new JLabel("Numero 2");
      contenedor.add(label2);
      valor2 = new JTextField(10);
      contenedor.add(valor2);
      btnsuma = new JButton("+");
      contenedor.add(btnsuma);
      btnsuma.addActionListener(this);
      btnresta = new JButton("-");
      contenedor.add(btnresta);
      btnresta.addActionListener(this);
      btnmulti = new JButton("x");
      contenedor.add(btnmulti);
      btnmulti.addActionListener(this);
      btndiv = new JButton("/");
      btndiv.addActionListener(this);
      contenedor.add(btndiv);
      btnpor=new JButton("%");
      btnpor.addActionListener(this);
      contenedor.add(btnpor);
      btnpotencia=new JButton("Pot");
      btnpotencia.addActionListener(this);
      contenedor.add(btnpotencia);
      camporesultado = new JTextField(10);
      contenedor.add(camporesultado);
      btnlimpiar = new JButton("Limpiar");
      contenedor.add(btnlimpiar);
      btnlimpiar.addActionListener(this);
      btnsalir=new JButton("Salir");
      btnsalir.setBackground(Color.red);
      //contenedor.add(btnsalir);
      btnsalir.addActionListener(this);
 }
  
 public Calculadora(){
  
      super("Calculadora");

      Controles();
      setSize(380,200);
      setLocationRelativeTo(null);
      setVisible(true);
 }
  
 public void actionPerformed(ActionEvent e) {
     double  num1,num2,resu;
     String resultado;
        if (e.getSource()==btnsuma) {
         if(valor1.getText().equals("") || valor2.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.WARNING_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=num1+num2;
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);
         }          
        }
        if (e.getSource()==btnresta) {
         if(valor1.getText().equals("") || valor2.getText().equals("")){
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=num1-num2;
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);
         }          
        } 
        if (e.getSource()==btnmulti) {
         if(valor1.getText().equals("") || valor2.getText().equals("")){
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=num1*num2;
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);
         }          
        }
        if (e.getSource()==btndiv) {
         if(valor1.getText().equals("") || valor2.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null, "Los datos no están Incompletos",
          "Error",JOptionPane.ERROR_MESSAGE);
         }
         
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          try{
           resu=num1/num2;
           resultado=String.valueOf(resu);
           camporesultado.setText(resultado);
          }
          catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, "División entre cero NO PERMITIDA!",
            "Error",JOptionPane.ERROR_MESSAGE);
          }
           
         }  
        }
        if (e.getSource()==btnpotencia) {
         if(valor1.getText().equals("") || valor2.getText().equals(""))
         {
          JOptionPane.showMessageDialog(null, "Los datos no están completos",
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{
          num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=Math.pow(num1,num2);
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);
         }          
        }
        if(e.getSource()==btnpor)
        {
         if(valor1.getText().equals("") || valor2.getText().equals("")){
          JOptionPane.showMessageDialog(null, "Dejaste en blanco el campo.",
          "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{
           num1=Double.parseDouble(valor1.getText());
          num2=Double.parseDouble(valor2.getText());
          resu=num1*num2/100;
          resultado=String.valueOf(resu);
          camporesultado.setText(resultado);
         }    
        }
          
        
        if (e.getSource()==btnlimpiar){
         valor1.setText("");
            valor2.setText("");
            camporesultado.setText("");
       } 
        if(e.getSource()==btnsalir)
        {
         System.exit(0);   
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calc = new Calculadora();
      calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
