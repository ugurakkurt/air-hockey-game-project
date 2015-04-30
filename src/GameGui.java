package gamegui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author inciboduroglu
 */
public class GameGui extends JPanel{
    JTextField signInField = new JTextField();
    JPasswordField passField = new JPasswordField();
    String username;
    String password;
    static Dimension dim = new Dimension (1100, 730);
    static Dimension but = new Dimension (140, 60);
    
    public GameGui(){       //Gui Constructor
        setSize(dim);
        //startGameSetup();
        //mainMenuSetup();
        //setupRegister();
        signInSetup();
        setBackground(Color.black);
/*
 * Start with login screen
 */
        
        
    }

    /** Setup method
     *
     */
    public static void setup() {
        // Frame initialization
        JFrame frame = new JFrame();
        frame.getContentPane().add(new GameGui());
        frame.setLayout(null);
        frame.setPreferredSize(dim);

        // Frame specifications
        frame.setTitle("Sign In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
    /**
     * Sign In Panel Setup
     */
    public void signInSetup(){
        JPanel signInPanel = new JPanel();
        ImageIcon signInImage = new ImageIcon("login-screen.jpg");
        JLabel label = new JLabel();
        label = new JLabel("", signInImage, JLabel.CENTER);
        signInPanel.add(label);
        label.setLocation(0, 0);
        
        //Sign in field
        signInField.setLocation(390, 415);
        signInField.setSize(400, 40);
        signInField.setBorder(null);
        label.add(signInField);
        
        // Password Field
        passField.setLocation(390, 470);
        passField.setSize(400, 40);
        passField.setBorder(null);
        label.add(passField);
        
        //Sign In button
        JButton signInButton = new JButton("Sign In");
        signInButton.setLocation(520, 520);
        signInButton.setSize(140, 60);
        signInButton.addActionListener(new ButtonListener());
        label.add(signInButton);
        
        //Register Button
        JButton registerButton = new JButton("Register");
        registerButton.setLocation(520, 625);
        registerButton.setSize(140, 60);
        registerButton.addActionListener(new ButtonListener());
        label.add(registerButton);
        
        add(signInPanel);
        repaint();
    }
    private void registerSetup() {
        JPanel registerPanel = new JPanel();
        JLabel label = new JLabel();
        ImageIcon registerImage = new ImageIcon("biktim.jpg");    //***** Not found *******
        label = new JLabel("", registerImage, JLabel.CENTER);
        label.setLocation(0, 0);
        label.setPreferredSize(dim);
        
        /////////////////////////////
        // Buttons and fields
        /////////////////////////////
        
        JButton backBut = new JButton("Back");
        backBut.setSize(but);
        backBut.setLocation(10, 10);
        backBut.addActionListener(new ButtonListener());
        label.add(backBut);
        registerPanel.add(label);
        
        add(registerPanel);
        repaint();
    }
    
    private void mainMenuSetup(){
        int buttonW = 165;
        int buttonH = 63;
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLocation(0, 0);    //Bu kayıyö
        
        //Label
        JLabel label = new JLabel();
        ImageIcon mainImage = new ImageIcon("play-screen.jpg");    
        label = new JLabel("", mainImage, JLabel.CENTER);
        label.setLocation(0, 0);
        label.setPreferredSize(dim);
        
        // Buttons
        //Exit Button
        JButton mainBack = new JButton("Exit");
        mainBack.setSize(70, 70);
        mainBack.setLocation(1014, 621);
        mainBack.setForeground(Color.red);
        ImageIcon exitImg = new ImageIcon("biktim.jpg");    // exit image
        JLabel exitLabel = new JLabel("", exitImg, JLabel.CENTER);
        mainBack.add(exitLabel);
        mainBack.addActionListener(new ButtonListener());
        
        // Start Game Button
        JButton startGame = new JButton("Start Game");
        startGame.setSize(buttonW, buttonH);
        startGame.setLocation(536, 315);
        startGame.addActionListener(new ButtonListener());
        label.add(startGame);
        
        JButton maps = new JButton("Maps");
        maps.setSize(buttonW, buttonH);
        maps.setLocation(717, 315);
        maps.addActionListener(new ButtonListener());
        label.add(maps);
        
        JButton highScores = new JButton("High Scores");
        highScores.setSize(buttonW, buttonH);
        highScores.setLocation(898, 315);
        highScores.addActionListener(new ButtonListener());
        label.add(highScores);
                
        JButton options = new JButton("Options");
        options.setSize(buttonW, buttonH);
        options.setLocation(536, 395);
        options.addActionListener(new ButtonListener());
        label.add(options);
                
        JButton credits = new JButton("Credits");
        credits.setSize(buttonW, buttonH);
        credits.setLocation(717, 395);
        credits.addActionListener(new ButtonListener());
        label.add(credits);
                
        JButton help = new JButton("Help");
        help.setSize(buttonW, buttonH);
        help.setLocation(898, 395);
        help.addActionListener(new ButtonListener());
        label.add(help);
        
        label.add(mainBack);
        
        mainPanel.add(label);
        
        add(mainPanel);
        repaint();
    }
    
    private void startGameSetup() {
        int buttonW = 160;
        int buttonH = 160;
        JPanel gamePanel = new JPanel();
        gamePanel.setLocation(0, 0);    //Bu kayıyö
        
        //Label
        JLabel label = new JLabel();
        ImageIcon mainImage = new ImageIcon("play-game-step1.jpg");    
        label = new JLabel("", mainImage, JLabel.CENTER);
        label.setLocation(0, 0);
        label.setPreferredSize(dim);
        
        ///Buttons
        JButton sel1 = new JButton("");
        sel1.setSize(buttonW, buttonH);
        sel1.setLocation(281, 378);
        sel1.setActionCommand("sel1");
        sel1.addActionListener(new ButtonListener());
        label.add(sel1);
        
        JButton sel2 = new JButton("");
        sel2.setSize(buttonW, buttonH);
        sel2.setLocation(467, 378);
        sel2.setActionCommand("sel2");
        sel2.addActionListener(new ButtonListener());
        label.add(sel2);
        
        JButton sel3 = new JButton("");
        sel3.setSize(buttonW, buttonH);
        sel3.setLocation(660, 378);
        sel3.setActionCommand("sel3");
        sel3.addActionListener(new ButtonListener());
        label.add(sel3);
        
        gamePanel.add(label);
        add(gamePanel);
        
        repaint();
    }
    
    private void mapsSetup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void highScoreSetup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void optionsSetup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void creditsSetup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void helpSetup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public void destruct(){
        removeAll();
        updateUI();
    }
public class ButtonListener implements ActionListener{

        ButtonListener(){}
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            
            switch (e.getActionCommand()) {
                case "Sign In":         //Sign In is clicked
                    System.out.println("username: " + signInField.getText());
                    System.out.println("password: " + passField.getText());
                    username = signInField.getText();
                    password = passField.getText();
                   
                    if (username.equals("")) {
                        System.out.println("usernameEmpty");
                        JOptionPane.showMessageDialog(new JFrame(), "No Username No Cry", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    } else if (password.equals("")){
                        System.out.println("passwordEmpty");
                        JOptionPane.showMessageDialog(new JFrame(), "No Password No Cry", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    
                    // ***************** authorization ************************
                    destruct();
                    mainMenuSetup();
                    break;
                    
                case "Register":        // Register is clicked
                    System.out.println(e.getActionCommand());       // Go to Register Screen
                    destruct();
                    registerSetup();
                    break;
                    
                case "Back":
                    destruct();
                    signInSetup();
                    break;
                    
                case "Exit":
                    destruct();
                    signInSetup();
                    break;
                    
                case "Start Game":
                    destruct();
                    startGameSetup();
                    break;
                    
                case "Maps":
                    destruct();
                    mapsSetup();
                    break;
                
                case "High Scores":
                    destruct();
                    highScoreSetup();
                    break;
                
                case "Options":
                    destruct();
                    optionsSetup();
                    break;
                    
                case "Credits":
                    destruct();
                    creditsSetup();
                    break;
                  
                case "Help":
                    destruct();
                    helpSetup();
                    break;
                    
                case "sel1":
                    break;
                    
                case "sel2":
                    break;
                    
                case "sel3":
                    break;
                
            }
            
        }
    
    }
    
}
