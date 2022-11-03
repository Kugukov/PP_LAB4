package kdk10_lab4;

import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

public class KDK10_LAB4 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
                
        CriteriaQuery<Tv> criteriaTv = builder.createQuery(Tv.class);
        Root<Tv> rootTv = criteriaTv.from(Tv.class);
        criteriaTv.select(rootTv);
        
        CriteriaQuery<TvSpecifications> criteriaTvSpecifications = builder.createQuery(TvSpecifications.class);
        Root<TvSpecifications> rootTvSpecifications = criteriaTvSpecifications.from(TvSpecifications.class);
        criteriaTvSpecifications.select(rootTvSpecifications);
        
        TvSpecifications tv1 = new TvSpecifications();
        tv1.setResolution("1920x1080");
        tv1.setBrightness(80);
        tv1.setContrast(60);
        session.save(tv1);

        TvSpecifications tv2 = new TvSpecifications();
        tv2.setResolution("1366x768");
        tv2.setBrightness(75);
        tv2.setContrast(65);
        session.save(tv2);
        
        org.hibernate.Transaction tr = session.beginTransaction();
//        session.delete(tv1);
//        session.delete(tv2);
        tr.commit();

        Tv tv = new Tv();
        tv.setName("43UQ76003LD");
        tv.setManufacturer("LG568");
        tv.setTvSpecifications(new TvSpecifications("3840x2160", 100, 50));
        session.save(tv);
        
        tv = (Tv) session.get(Tv.class, tv.getId());
        session.save(tv);
        
        TypedQuery<Tv> queryTv = session.createQuery(criteriaTv);
        List<Tv> resultsTv = queryTv.getResultList();
        resultsTv.forEach((item) -> {
            System.out.println(item);
        });
        
        TypedQuery<TvSpecifications> queryTvSpecifications = session.createQuery(criteriaTvSpecifications);
        List<TvSpecifications> resultsTvSpecifications = queryTvSpecifications.getResultList();
        resultsTvSpecifications.forEach((item) -> {
            System.out.println(item);
        });
        
        session.close();

        System.exit(0);
    }

}
