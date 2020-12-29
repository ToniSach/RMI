/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Implement;

/**
 *
 * @author Navy
 */
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import login.Interface.LoginInterface;
public class LoginImplement extends UnicastRemoteObject implements LoginInterface{
    
    public LoginImplement() throws RemoteException{
    }
    String name = "";
    public boolean getLogin(String user) throws RemoteException { 
        boolean found = false;
        try{
            if (user.equals("")) {
                return found = false;
            }
            else{
                return found = true;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return found;
    }
    public void setName(String user) throws RemoteException {
        try{
            name = user;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public String getName() throws RemoteException {
        return name;
    }

}
