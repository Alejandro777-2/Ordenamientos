import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTabbedPane tabbedPane1;
    private JList lstTaller;
    private JButton ordenarPorCodigoButton;
    private JButton ordenarPorPrecioButton;
    private JButton ordenarPorCilindrajeButton;
    private JButton btnEliminar;
    private JButton eliminarIndiceButton;
    private Taller miTaller = new Taller();
    public void llenarJlist(){
        DefaultListModel<Motocicleta> dml = new DefaultListModel<>();
        for(Motocicleta m : miTaller.getTaller()){
            dml.addElement(m);
        }
        lstTaller.setModel(dml);
    }
    public Ventana() {
        llenarJlist();
        ordenarPorCodigoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miTaller.ordenarID();
                llenarJlist();
            }
        });
        ordenarPorPrecioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miTaller.ordenarPrecio();
                llenarJlist();
            }
        });
        ordenarPorCilindrajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miTaller.odenarCilindraje();
                llenarJlist();
            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(lstTaller.getSelectedIndex() != -1){
                  Motocicleta aux = (Motocicleta) lstTaller.getSelectedValue();
                  miTaller.getTaller().remove(aux);
                  llenarJlist();
              }else {
                  JOptionPane.showMessageDialog(null, "Seleccione al menos 1 ");
              }

            }
        });
        eliminarIndiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lstTaller.getSelectedIndex() != -1){
                    miTaller.getTaller().remove(lstTaller.getSelectedIndex());
                    llenarJlist();
                }else {
                    JOptionPane.showMessageDialog(null, "Seleccione al menos 1 ");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
