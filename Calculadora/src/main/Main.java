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
