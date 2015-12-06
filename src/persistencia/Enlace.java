/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author jdosornio
 */
public class Enlace {

    /**
     * La interface por la cuál se accederá a todos los métodos remotos de la
     * persistencia.
     */
    private static Persistencia persistencia;
    /**
     * La ip del servidor.
     */
    public static String ip;
    /**
     * Puerto por el que escuchara el servidor.
     */
    public static int puerto;
    
    /**
     * Nombre del servicio de persistencia
     */
    public static String nombreServicio;

    /**
     * Obtiene una nueva interface Persistencia si no existe, enlazando esta
     * aplicación con la aplicación de persistencia remotamente
     *
     * @return una interface Persistencia que permitirá acceder a la aplicación
     * de persistencia
     * @throws RemoteException en caso de que haya error de conexión remota
     * @throws NotBoundException en caso de que el registro no exista
     */
    public static Persistencia getPersistencia() throws RemoteException,
            NotBoundException {
        if (persistencia == null) {
            Registry registro = LocateRegistry.getRegistry(ip, puerto);
            persistencia = (Persistencia) registro.lookup(nombreServicio);
        }
        return persistencia;
    }
    
}
