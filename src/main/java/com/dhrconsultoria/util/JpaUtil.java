/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhrconsultoria.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author administrador
 */
public class JpaUtil {
    
    
    private static final EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("my_persistence_unit");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
