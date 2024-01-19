/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entornos;


import javax.swing.JFrame;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Augustus Gloop !ayuda paquito¡ xd
he he */
public class Entornos {

    public static void main(String[] args) {
               
        VentanaPrincipal programa = new VentanaPrincipal();
        
        programa.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        programa.setVisible(true);
        
    }
    
    public static Session getCurrentSessionFromConfig()
        {
            Configuration cfg = new Configuration();//.addAnnotatedClass(annotatedClass)addClass(com.mycompany.entornos.Cempresa.class);
            cfg.addAnnotatedClass(com.mycompany.entornos.Cempresa.class);
            cfg.addAnnotatedClass(com.mycompany.entornos.Ccliente.class);
            cfg.addAnnotatedClass(com.mycompany.entornos.Cvivienda.class);
            cfg.addAnnotatedClass(com.mycompany.entornos.Cexpediente.class);
            cfg.setProperty("jakarta.persistence.jdbc.url", "jdbc:postgresql://192.168.1.230:5432/smartocupation");
            cfg.setProperty("jakarta.persistence.jdbc.user", "postgres");
            cfg.setProperty("jakarta.persistence.jdbc.driver","org.postgresql.Driver");
            cfg.setProperty("jakarta.persistence.jdbc.password" ,"Adminis");
            //cfg.setProperty("hibernate.dialect","org.hibernate.dialect.PostgreSQL10Dialect");
            
            
            /*StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
            

            //MetadataSources metadataSources = new MetadataSources((org.hibernate.service.ServiceRegistry) serviceRegistry);
            
            MetadataSources metadataSources = new MetadataSources(serviceRegistry);
            metadataSources.addAnnotatedClass(com.mycompany.entornos.Cempresa.class);
            metadataSources.addAnnotatedClass(com.mycompany.entornos.Ccliente.class);
            metadataSources.addAnnotatedClass(com.mycompany.entornos.Cvivienda.class);
            metadataSources.addAnnotatedClass(com.mycompany.entornos.Cexpediente.class);
            Metadata metadata = metadataSources.buildMetadata();
            */

              // here we build the SessionFactory (Hibernate 5.4)
            //SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();
            return session;
            
        }
    
    
/*
protected void setUp() {
    // A SessionFactory is set up once for an application!
    final StandardServiceRegistry registry =
            new StandardServiceRegistryBuilder()
                    .build();     
    try {
        
        sessionFactory = new MetadataSources(registry)             
                        .addAnnotatedClass(com.mycompany.entornos.Cempresa.class)   
                        .buildMetadata()                  
                        .buildSessionFactory();           
    }
    catch (Exception e) {
        // The registry would be destroyed by the SessionFactory, but we
        // had trouble building the SessionFactory so destroy it manually.
        StandardServiceRegistryBuilder.destroy(registry);
    }
}

*/
}
