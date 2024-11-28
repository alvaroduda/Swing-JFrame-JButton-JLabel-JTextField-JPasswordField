import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {


    public static void main(String[] args) {

     JFrame program = new JFrame();

     //é um texto na tela, em sua instancia se passa o texto nos parametros
     JLabel labelUser = new JLabel("Usário:");
     labelUser.setLocation(120,50);
     labelUser.setSize(100,30);

     //serve para o usuário digitar um texto
     JTextField inputUser = new JTextField();
     inputUser.setLocation(80,80);
     inputUser.setSize(120,25);

     //serve para o usuário digitar um texto em formato de senha
     JPasswordField inputUserPassowrd = new JPasswordField();
     inputUserPassowrd.setLocation(80,110);
     inputUserPassowrd.setSize(120,25);

     //ao instanciar um JButton se passa como parametro o nome que vai estár no botão
     JButton button = new JButton("Login");
     button.setSize(120,30);
     button.setLocation(80,140);
     //Metodo para que faz o botão ter uma ação ao ser clicado
     button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             //Metodo para retornar o texto digitado nesse input
             String user = inputUser.getText();
             //Metodo para retornar o texto digitado nesse input
             String userPassowrd = inputUserPassowrd.getText();
             System.out.println("Login feito!");
             //criamos variáveis acima para armazenar os valores digitados para podermos chamar aqui no sout e exibir
             System.out.println(user + "| |" + userPassowrd);
             //Metodo para limpar os inputs
             inputUser.setText("");
             inputUserPassowrd.setText("");
         }
     });


     //comando para adicionar o JButton na janela JFrame
     program.add(button);
     program.add(labelUser);
     program.add(inputUser);
     program.add(inputUserPassowrd);

     //Metodo que desativa a configuração de Layout geral padrão da janela, deixando em null significa agora se pode alterar no código manualmente as posições dos componentes que eu adicionar, como botões e etc.
     program.setLayout(null);
     program.setSize(300,300);
     program.setLocationRelativeTo(null);
     program.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     program.setVisible(true);

    }


}