package org.blabla.ejb;

import org.jboss.ejb3.annotation.Clustered;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import java.io.Serializable;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: lionel
 * Date: 07/07/12
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
@Stateful
@Clustered
public class ClusteredSessionBean implements Serializable {

    private Logger logger = Logger.getLogger(ClusteredSessionBean.class.getName());
    private int compteur;

    public ClusteredSessionBean() {
    }

    @PostConstruct
    public void init() {
        logger.info("INIT ClusteredSessionBean");
        compteur = 0;
    }

    public void incremente() {
        compteur++;
    }

    public int getCompteur() {
        return compteur;
    }
}
