package chatserver;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
import login.Implement.LoginImplement;

public class StartServer {

    public static void main(String[] args) {
        
        
        try {
            Registry miRegistry = LocateRegistry.createRegistry(1234);
            miRegistry.rebind("Ejemplo", new ServerImplements());
            System.out.println("Servidor corriendo en el puerto 1234");
            Registry reg=LocateRegistry.createRegistry(8080);
            //System.setSecurityManager(new RMISecurityManager());
            //java.rmi.registry.LocateRegistry.createRegistry(1099);
            ChatServerInt b = new ChatServer();
            reg.rebind("rmi://localhost/myabc", b);
            System.out.println("[System] Servidor listo.");
            Registry regs = LocateRegistry.createRegistry(1099);
            LoginImplement lp = new LoginImplement();
            regs.rebind("login", lp);
            System.out.println("Server ready");
        } catch (Exception e) {
            System.out.println("Chat Server failed: " + e);
        }
    }
}
