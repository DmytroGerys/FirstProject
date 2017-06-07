package ua.sport.entity;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ua.sport.dao.CommodityDao;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("primary");
		
		EntityManager manager = factory.createEntityManager();
		
//		manager.getTransaction().begin();
//		CriteriaBuilder builder = manager.getCriteriaBuilder();
//		CriteriaQuery<Commodity> commodityCriteriaQuery = builder.createQuery(Commodity.class);
//		Root<Commodity> commodityRoot = commodityCriteriaQuery.from(Commodity.class);
//		Expression<Integer> expression= commodityRoot.get("price");
//		Predicate predicatePrices = builder.le(expression, 20);
//		Expression<String> expression1 = commodityRoot.get("name");
//		Predicate predicateName = builder.notEqual(expression, "JackDaniels");
//		Predicate pd = builder.and(predicatePrices, predicateName);
//		commodityCriteriaQuery.where(pd);
//		List<Commodity> list = manager.createQuery(commodityCriteriaQuery).getResultList();
//		System.out.println(list);
		
		
		
//		User user = (User) manager
//				.createQuery("select u from User u join u.commodities c " + 
//						"where c.name= 'Jack'").getSingleResult();
//		
//		Commodity commodity = (Commodity) manager.createQuery("select c from Commodity c join c.user u " + 
//				"where u.name= ''").getSingleResult();

		
//		CommodityDao commodityDao = new CommodityDao(manager);
//		commodityDao.save(new Commodity("JackDaniels", 20, 0.7));
//		commodityDao.save(new Commodity("Jameson", 23, 0.7));
//		commodityDao.save(new Commodity("Busmills", 68, 0.7));
//		commodityDao.save(new Commodity("Buleit", 32, 0.7));
//		commodityDao.save(new Commodity("Macallan", 135, 0.7));
//		commodityDao.save(new Commodity("RedLabel", 15, 0.7));
		
		
		
		manager.close();
		factory.close();

	}

}
