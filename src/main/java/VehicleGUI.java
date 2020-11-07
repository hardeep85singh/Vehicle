import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class VehicleGUI implements ActionListener {
    JFrame frame;
    JButton button;
    JPanel panel;
    JTextField x, y;
    VehicleComponent component;
    VehicleImpl vehicle1 = new VehicleImpl();

    public void go() {
        frame = new JFrame();
        button = new JButton("Move");
        x = new JTextField(5);
        y = new JTextField(5);

        button.addActionListener(this);

        component = new VehicleComponent();

        panel = new JPanel();
        panel.add(button);
        panel.add(x);
        panel.add(y);


        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(component);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Vehicle");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // x.getText();
//        x.addActionListener(this);
//        y.addActionListener(this);
        int i = 5;
        vehicle1.moveTo(vehicle1.getCurrentLocation().getX() + i,
                vehicle1.getCurrentLocation().getY() + i);
        component.repaint();
    }

    class VehicleComponent extends JComponent {

        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            int x = vehicle1.getCurrentLocation().getX();
            int y = getHeight() - 20 - vehicle1.getCurrentLocation().getY();
            Ellipse2D.Double vehicle =
                    new Ellipse2D.Double(x, y, 20, 20);
            g2.setColor(Color.RED);
            g2.fillOval(x, y, 20, 20);
            g2.draw(vehicle);
        }
    }
}
