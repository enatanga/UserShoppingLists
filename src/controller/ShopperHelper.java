package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListItem;
import model.Shopper;

public class ShopperHelper {
		static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("UserShoppingLists");

		public void insertShopper(Shopper s) {
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			em.persist(s);
			em.getTransaction().commit();
			em.close();
		}

		public List<Shopper> showAllShoppers() {
			EntityManager em = emfactory.createEntityManager();
			List<Shopper> allShoppers = em.createQuery("SELECT s FROM Shopper s").getResultList();
			return allShoppers;
		}

		public Shopper searchForShopperByName(String shopperName) {
			// TODO Auto-generated method stub
			EntityManager em = emfactory.createEntityManager();
			em.getTransaction().begin();
			TypedQuery<Shopper> typedQuery = em.createQuery("select s from Shopper s where s.shopperName = :selectedName", Shopper.class);
			typedQuery.setParameter("selectedName", shopperName);
			typedQuery.setMaxResults(1);

			Shopper found = typedQuery.getSingleResult();
			em.close();
			return found;
		}
}
