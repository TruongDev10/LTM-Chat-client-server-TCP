package chatbot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class Client extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private PrintWriter out;
    private BufferedReader in;

    public Client() {
        setTitle("Client Chat");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        sendButton = new JButton("Send");

        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);
        add(panel, BorderLayout.SOUTH);

        setVisible(true);

        sendButton.addActionListener(e -> sendMessage());
        inputField.addActionListener(e -> sendMessage());
    }

    private void sendMessage() {
        String msg = inputField.getText();
        if (!msg.isEmpty()) {
            chatArea.append("Me: " + msg + "\n");
            out.println(msg);
            inputField.setText("");
        }
    }

    public void startClient() {
        try (Socket socket = new Socket("localhost", 12345)) {
            chatArea.append("Connected to server.\n");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            String msg;
            while ((msg = in.readLine()) != null) {
                chatArea.append("Server: " + msg + "\n");
            }
        } catch (IOException e) {
            chatArea.append("Error: " + e.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        new Thread(client::startClient).start();
    }
}
