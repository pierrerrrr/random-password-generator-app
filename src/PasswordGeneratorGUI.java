import javax.swing.*;
import java.awt.*;

// front
public class PasswordGeneratorGUI extends JFrame {
    public PasswordGeneratorGUI() {
        // renderiza o titulo e o GUI
        super("Gerador de Senhas");

        setSize(540, 570);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addGuiComponents();
    }

    private void addGuiComponents() {

        // criando o titulo
        JLabel titleLabel = new JLabel("Gerador de Senha");
        titleLabel.setFont( new Font ("Dialog", Font.BOLD, 32));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(0, 10, 540, 39);
        add(titleLabel);

        // criando o box que apresenta o resultado
        JTextArea passwordOutput = new JTextArea();

        passwordOutput.setEditable(false);
        passwordOutput.setFont( new Font("Dialog", Font.PLAIN, 32));

        JScrollPane passwordOutputPane = new JScrollPane(passwordOutput);
        passwordOutputPane.setBounds(25, 97, 479, 70);

        passwordOutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passwordOutputPane);

        // criando o length do password
        JLabel passwordLengthLabel = new JLabel("Password Length:");
        passwordLengthLabel.setFont( new Font("Dialog", Font.PLAIN, 32));
        passwordLengthLabel.setBounds(25, 215, 272, 39);
        add(passwordLengthLabel);
    }
}
