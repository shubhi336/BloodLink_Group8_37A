package Controller;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Dao.UserDao;
import javax.swing.JOptionPane;
import view.Signupp;
import model.User;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class SignupController {
    private final UserDao userDao=new UserDao();
    private final Signupp userview;
    
    public SignupController(Signupp userview){
        this.userview=userview;
        
        userview.addAddUserListener(newUserListener());
        
    }
    public void open(){
        this.userview.setVisible(true);
    }
    public void close(){
        this.userview.dispose();
    }
    
    class AddUserListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                String name=userview.getusernameField().username();
                String email=userview.getemailField().getText();
                String password =userview.getpasswordField().getText();
                User user=new User(name,email,password);
                boolean check=userDao.checkUser(user);
                if (check){
                    JOptionPane.showMessageDialog(userview, "Duplicate user");
                    
                }else{
                    userDao.signin(user);
                }
            }catch(Exception ex){
                System.out.println("Error adding user:"+ ex.getMessage());
            }
        }
    }
    
    
    
}
