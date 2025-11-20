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
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
