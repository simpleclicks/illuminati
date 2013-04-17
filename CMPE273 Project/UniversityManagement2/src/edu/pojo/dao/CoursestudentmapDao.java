package edu.pojo.dao;
// Generated 16 Apr, 2013 10:58:21 PM by Hibernate Tools 3.1.0.beta4

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import edu.pojo.Coursestudentmap;



/**
 * Home object for domain model class Coursestudentmap.
 * @see edu.pojo.dao.Coursestudentmap
 * @author Hibernate Tools
 */
public class CoursestudentmapDao {

    private static final Log log = LogFactory.getLog(CoursestudentmapDao.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(Coursestudentmap transientInstance) {
        log.debug("persisting Coursestudentmap instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Coursestudentmap instance) {
        log.debug("attaching dirty Coursestudentmap instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Coursestudentmap instance) {
        log.debug("attaching clean Coursestudentmap instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Coursestudentmap persistentInstance) {
        log.debug("deleting Coursestudentmap instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Coursestudentmap merge(Coursestudentmap detachedInstance) {
        log.debug("merging Coursestudentmap instance");
        try {
            Coursestudentmap result = (Coursestudentmap) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Coursestudentmap findById( int id) {
        log.debug("getting Coursestudentmap instance with id: " + id);
        try {
            Coursestudentmap instance = (Coursestudentmap) sessionFactory.getCurrentSession()
                    .get("edu.pojo.dao.Coursestudentmap", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Coursestudentmap instance) {
        log.debug("finding Coursestudentmap instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("edu.pojo.dao.Coursestudentmap")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 

}