import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLayeredPane;
import java.awt.ScrollPane;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.LineBorder;

class Simples extends JFrame {

    private JPanel contentPane;
    private JTextField textvalor1;
    private JTextField textvalor2;
    private JTextField texttotal;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Simples frame = new Simples();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Simples() {
        setTitle("Calculadora Simples");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 670, 530);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setForeground(Color.GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblvalor1 = new JLabel("1\u00B0Valor:");
        lblvalor1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblvalor1.setBounds(81, 137, 73, 17);
        contentPane.add(lblvalor1);

        JLabel lblvalor2 = new JLabel("2\u00B0Valor:");
        lblvalor2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblvalor2.setBounds(81, 209, 73, 17);
        contentPane.add(lblvalor2);

        JLabel lbltotal = new JLabel("Total:");
        lbltotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbltotal.setBounds(92, 286, 46, 14);
        contentPane.add(lbltotal);

        textvalor1 = new JTextField();
        textvalor1.setBounds(148, 134, 176, 20);
        contentPane.add(textvalor1);
        textvalor1.setColumns(10);

        textvalor2 = new JTextField();
        textvalor2.setBounds(148, 209, 176, 20);
        contentPane.add(textvalor2);
        textvalor2.setColumns(10);

        texttotal = new JTextField();
        texttotal.setBounds(148, 285, 176, 20);
        contentPane.add(texttotal);
        texttotal.setColumns(10);

        JButton btnsoma = new JButton("+");
        btnsoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                double n1= Double.parseDouble(textvalor1.getText());
                double n2= Double.parseDouble(textvalor2.getText());

                double total = n1+n2;

                texttotal.setText(String.valueOf(total));


            }
        });
        btnsoma.setBounds(367, 155, 68, 46);
        contentPane.add(btnsoma);

        JButton btndiv = new JButton("/");
        btndiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                double n1= Double.parseDouble(textvalor1.getText());
                double n2= Double.parseDouble(textvalor2.getText());

                double total = n1/n2;

                texttotal.setText(String.valueOf(total));
            }
        });
        btndiv.setBounds(367, 229, 68, 46);
        contentPane.add(btndiv);

        JButton btnmult = new JButton("*");
        btnmult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                double n1= Double.parseDouble(textvalor1.getText());
                double n2= Double.parseDouble(textvalor2.getText());


                double total = n1*n2;

                texttotal.setText(String.valueOf(total));
            }
        });
        btnmult.setBounds(460, 229, 68, 46);
        contentPane.add(btnmult);

        JButton btnsub = new JButton("-");
        btnsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                double n1= Double.parseDouble(textvalor1.getText());
                double n2= Double.parseDouble(textvalor2.getText());
                double total = n1-n2;

                texttotal.setText(String.valueOf(total));
            }
        });
        btnsub.setBounds(460, 155, 68, 46);
        contentPane.add(btnsub);

        JButton btnlimpar = new JButton("LIMPAR");
        btnlimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                textvalor1.setText("");
                textvalor2.setText("");
                texttotal.setText("");



            }
        });
        btnlimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnlimpar.setBounds(115, 388, 150, 39);
        contentPane.add(btnlimpar);

        JButton btnsair = new JButton("SAIR");
        btnsair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                System.exit(0);
            }
        });
        btnsair.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnsair.setBounds(298, 388, 160, 39);
        contentPane.add(btnsair);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setToolTipText("Opera\u00E7\u00F5es");
        layeredPane.setBackground(Color.GRAY);
        layeredPane.setForeground(Color.GRAY);
        layeredPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        layeredPane.setBounds(349, 144, 198, 144);
        contentPane.add(layeredPane);
        layeredPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Operações");
        lblNewLabel.setBounds(352, 130, 73, 14);
        contentPane.add(lblNewLabel);
    }
}
