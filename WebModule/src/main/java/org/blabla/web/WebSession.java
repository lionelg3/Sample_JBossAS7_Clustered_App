package org.blabla.web;

import org.blabla.ejb.ClusteredSessionBean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: lionel
 * Date: 07/07/12
 * Time: 21:32
 * To change this template use File | Settings | File Templates.
 */
@SessionScoped
@Named
public class WebSession implements Serializable {

    private Logger logger = Logger.getLogger(WebSession.class.getName());

    private Date date;

    @Inject
    private ClusteredSessionBean clusteredSessionBean;

    public WebSession() {
        date = new Date();
    }

    @PostConstruct
    public void init() {
        logger.info("DEBUT SESSION WEB "+date);
    }

    public Date getDate() {
        return date;
    }

    public int getBackendCompteur() {
        clusteredSessionBean.incremente();
        return clusteredSessionBean.getCompteur();
    }
}
