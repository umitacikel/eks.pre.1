/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eksamenspreparation_jpa1;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Facade {

    EntityManagerFactory emf;

    public Facade(EntityManagerFactory emf) {
        this.emf = emf;

    }

    EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    EntityManager em = getEntityManager();

    public Project findUser(String userName) {
        try {
            return em.find(Project.class, userName);
        } finally {
            em.close();
        }
    }

    public ProjectUser createUser(String userName) {
        try {
            em.persist(userName);
        } finally {
            em.close();
        }
        return null;
    }

    public ProjectUser getAllUsers(String userName){
    try {
          return em.find(ProjectUser.class, userName);
        } finally {
            em.close();
        }
    }
    
    
    
    public Project createProject(String ProjectName){
    
    try {
        em.persist(ProjectName);
        } finally {
            em.close();
        }
    return null;
    }
    
    
    public Project findProject(String ProjectName){
    try {
          return em.find(Project.class, ProjectName);
        } finally {
            em.close();
        }
    }
    
}
