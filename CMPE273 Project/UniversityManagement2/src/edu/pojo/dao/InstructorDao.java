package edu.pojo.dao;
// Generated 16 Apr, 2013 10:58:21 PM by Hibernate Tools 3.1.0.beta4

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import edu.pojo.Instructor;



/**
 * Home object for domain model class Instructor.
 * @see edu.pojo.dao.Instructor
 * @author Hibernate Tools
 */
public class InstructorDao {

    private static final Log log = LogFactory.getLog(InstructorDao.class);

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
    
    public void persist(Instructor transientInstance) {
        log.debug("persisting Instructor instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(Instructor instance) {
        log.debug("attaching dirty Instructor instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Instructor instance) {
        log.debug("attaching clean Instructor instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(Instructor persistentInstance) {
        log.debug("deleting Instructor instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Instructor merge(Instructor detachedInstance) {
        log.debug("merging Instructor instance");
        try {
            Instructor result = (Instructor) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public Instructor findById( java.lang.String id) {
        log.debug("getting Instructor instance with id: " + id);
        try {
            Instructor instance = (Instructor) sessionFactory.getCurrentSession()
                    .get("edu.pojo.dao.Instructor", id);
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
    
    
    public List findByExample(Instructor instance) {
        log.debug("finding Instructor instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("edu.pojo.dao.Instructor")
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