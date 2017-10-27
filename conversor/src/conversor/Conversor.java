/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import javax.swing.JOptionPane;

/**
 *
 * @author nestor
 */
public class Conversor extends javax.swing.JFrame
{

	/**
	 * Creates new form Conversor
	 */
	public Conversor()
	{
		initComponents();
		
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        centimetrosTextField = new javax.swing.JTextField();
        pulgadasTextField = new javax.swing.JTextField();
        aPulgadasButton = new javax.swing.JButton();
        aCentimetrosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Centímetros");

        jLabel2.setText("Pulgadas");

        centimetrosTextField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                centimetrosTextFieldFocusLost(evt);
            }
        });
        centimetrosTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                centimetrosTextFieldKeyPressed(evt);
            }
        });

        aPulgadasButton.setText("A Pulgadas");
        aPulgadasButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aPulgadasButtonActionPerformed(evt);
            }
        });

        aCentimetrosButton.setText("A Centímetros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(centimetrosTextField)
                    .addComponent(pulgadasTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aCentimetrosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aPulgadasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centimetrosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aPulgadasButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulgadasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCentimetrosButton)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
	
	
    private void aPulgadasButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aPulgadasButtonActionPerformed
    {//GEN-HEADEREND:event_aPulgadasButtonActionPerformed
        String centimetrosString = centimetrosTextField.getText();
		centimetrosString = centimetrosString.replace(',', '.');
		
		double centimetros;
		try
		{
			centimetros = Double.valueOf(centimetrosString);
		}
		catch(NumberFormatException ex)
		{
			JOptionPane.showMessageDialog(this, "El valor " + centimetrosString + " no es un número", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		double pulgadas = centimetros / 2.54;
		String pulgadasString = String.format("%.2f", pulgadas);
		pulgadasTextField.setText(pulgadasString);
    }//GEN-LAST:event_aPulgadasButtonActionPerformed

    private void centimetrosTextFieldFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_centimetrosTextFieldFocusLost
    {//GEN-HEADEREND:event_centimetrosTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_centimetrosTextFieldFocusLost

    private void centimetrosTextFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_centimetrosTextFieldKeyPressed
    {//GEN-HEADEREND:event_centimetrosTextFieldKeyPressed
        if(evt.getKeyChar() == '\n')
			//conversion
    }//GEN-LAST:event_centimetrosTextFieldKeyPressed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch(ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch(InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch(IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch(javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new Conversor().setVisible(true);
			}
		});
	}
	
	
	private boolean centAPulg;
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aCentimetrosButton;
    private javax.swing.JButton aPulgadasButton;
    private javax.swing.JTextField centimetrosTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField pulgadasTextField;
    // End of variables declaration//GEN-END:variables
}