/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpaexample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Anderson Souza
 * @since 2015, Jan 28, 2016
 */
public class Loader {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemplo");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        em.persist(new Pessoa(2, "Dijalminha"));

        em.getTransaction().commit();
        em.close();
    }

}
