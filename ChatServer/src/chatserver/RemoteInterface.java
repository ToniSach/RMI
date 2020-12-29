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
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RemoteInterface extends Remote {
    public double suma(double x, double y) throws RemoteException;
    public double resta(double x, double y) throws RemoteException;
    public double multiplicacion(double x, double y) throws RemoteException;
    public double division(double x, double y) throws RemoteException;
    public double potencia(double x, double y) throws RemoteException;
    public double raiz(double x, double y) throws RemoteException;
}
