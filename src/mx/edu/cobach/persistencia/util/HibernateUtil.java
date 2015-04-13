/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia.util;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *Hibernate Util es una clase con un metodo conveniente para obtener un objeto 
 *de la fabrica de sesiones
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
    
    private static void createSessionFactory(){
        Configuration config = new Configuration();
        config.configure();
        StandardServiceRegistry sr = new StandardServiceRegistryBuilder().
                applySettings(config.getProperties()).build();
        sessionFactory = config.buildSessionFactory(sr);
    }
    
    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null){
            createSessionFactory(); 
        }
        return sessionFactory;
    }
}
