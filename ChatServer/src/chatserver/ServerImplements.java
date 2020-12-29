/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

/**
 *
 * @author tonis
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ServerImplements extends UnicastRemoteObject implements RemoteInterface {

    public ServerImplements() throws RemoteException{
        super();
    }
    
    @Override
    public double suma(double x, double y) throws RemoteException {
        
        return(x+y);
        
    }

    @Override
    public double resta(double x, double y) throws RemoteException {
        double res = x-y;
        return(res);
    }

    @Override
    public double multiplicacion(double x, double y) throws RemoteException {
        double res = x*y;
        return(res);
    }

    @Override
    public double division(double x, double y) throws RemoteException {
        
        return(x/y);
    }

    @Override
    public double potencia(double x, double y) throws RemoteException {
        double res = Math.pow(x, y);
        return(res);
    }

    @Override
    public double raiz(double x, double y) throws RemoteException {
        double res = Math.pow(y,(1/x));
        return(res);
    }
    
}
