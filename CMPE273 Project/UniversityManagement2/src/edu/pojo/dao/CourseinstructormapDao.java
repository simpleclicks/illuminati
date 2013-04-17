package edu.pojo.dao;
// Generated 16 Apr, 2013 10:58:21 PM by Hibernate Tools 3.1.0.beta4

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import edu.pojo.Courseinstructormap;



/**
 * Home object for domain model class Courseinstructormap.
 * @see edu.pojo.dao.Courseinstructormap
 * @author Hibernate Tools
 */
public class CourseinstructormapDao {

    private static final Log log = LogFactory.getLog(CourseinstructormapDao.class);

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
    
    public void persist(Courseinstructormap transientInstance) {
        log.debug("persisting Courseinstructormap instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Courseinstructormap instance) {
        log.debug("attaching dirty Courseinstructormap instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Courseinstructormap instance) {
        log.debug("attaching clean Courseinstructormap instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Courseinstructormap persistentInstance) {
        log.debug("deleting Courseinstructormap instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Courseinstructormap merge(Courseinstructormap detachedInstance) {
        log.debug("merging Courseinstructormap instance");
        try {
            Courseinstructormap result = (Courseinstructormap) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Courseinstructormap findById( int id) {
        log.debug("getting Courseinstructormap instance with id: " + id);
        try {
            Courseinstructormap instance = (Courseinstructormap) sessionFactory.getCurrentSession()
                    .get("edu.pojo.dao.Courseinstructormap", id);
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
    
    
    public List findByExample(Courseinstructormap instance) {
        log.debug("finding Courseinstructormap instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("edu.pojo.dao.Courseinstructormap")
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