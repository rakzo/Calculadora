package main;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1er cambio en rama master");
		System.out.println("2do cambio en rama master");
	}
	public class Operaciones extends javax.swing.JFrame {

		public Operaciones() {
		initComponents();
		    }
		    
		String numero1 = "";//creo una variable string, van a contener un espacio, donde no tienen nada
		String numero2 = "";
		Int contador = 0;//


		 private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {                                          
		        if(etiqueta1.getText().equals("")|| contador != 0){
		           operaciones();
		           etiqueta2.setText("");
		        }
		    }                                         

		    private void borradorActionPerformed(java.awt.event.ActionEvent evt) {                                         
		        numero1 = "";
		        numero2 = "";
		        etiqueta1.setText("");
		        etiqueta2.setText("");
		        etiqueta3.setText("");//muestre espacio
		        contador = 0;//vuelve el contador a reinicarse
		    } 


}


 private void num1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "1";//+=porque es una variable tipo string, donde cada vez que oprima este
          //boton lo voy a agregar ese caracter a ese sting
          etiqueta3.setText(numero1);//utilizo la primera etiqueta
    }                                    

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "2";
          etiqueta3.setText(numero1);
    }                                    

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "3";
          etiqueta3.setText(numero1);
    }                                    

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "4";
          etiqueta3.setText(numero1);
    }                                    

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "5";
          etiqueta3.setText(numero1);
    }                                    

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "6";
          etiqueta3.setText(numero1);
    }                                    

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "7";
          etiqueta3.setText(numero1);
    }                                    

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "8";
          etiqueta3.setText(numero1);
    }                                    

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "9";
          etiqueta3.setText(numero1);
    }                                    

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {                                      
          numero1 += ".";
          etiqueta3.setText(numero1);
    }                                     

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
          numero1 += "0";
          etiqueta3.setText(numero1);
    }                                    
 private void sumaActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(etiqueta3.getText().equals("")|| contador != 0){
           operaciones();
           etiqueta2.setText("+");
        }
    }                                    

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //si etiqueta 3 no tiene ningun texto o contador sea diferente de 0
        //entonces operaciones
        if(etiqueta3.getText().equals("")|| contador != 0){
           operaciones();
           etiqueta2.setText("-");//aqui coloco que me aparesca la resta en etiqueta 2
        }
        
          private void divisionActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(etiqueta3.getText().equals("")|| contador != 0){
           operaciones();
           etiqueta2.setText("/");
        }
    }                  

    }                       
    
