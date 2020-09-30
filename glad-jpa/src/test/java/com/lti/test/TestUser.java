package com.lti.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lti.entity.Order;
import com.lti.entity.Product;
import com.lti.entity.User;
import com.lti.repo.UserRepo;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestUser {
private EntityManagerFactory factory;
	
	@Autowired
	private UserRepo repo;
	
	@Test
	public void testAddProduct() {
		
		Product p1 =new Product();
		p1.setPid(121);
		p1.setPname("vivo");
		p1.setPdetails("good");
		p1.setPrate(5512);
		
		//repo.save(u);
	}
	
	@Test
	public void testAddUser() {
		
		User u1 =new User();
		u1.setName("Ronl");
		u1.setUaddress("jdjd");
		u1.setApprovalstatus("no");
		u1.setUbankacct("45123");
		u1.setUcardtype("gold");
		u1.setUcontact("97845623");
		u1.setUifsc("45552");
		u1.setUname("fp");
		u1.setUpwd("mejdj");
		u1.setUemail("yash@gmail.com");
		u1.setBank("HDFC");
		
		
		repo.save(u1);
		
	}
	
	
	
	@Test
	public void testAddUserPro() {
		
		User u1 =new User();
		u1.setName("ashd");
		u1.setUaddress("jdjd");
		u1.setApprovalstatus("yes");
		u1.setUbankacct("45123");
		u1.setUcardtype("gold");
		u1.setUcontact("97845623");
		u1.setUifsc("45552");
		u1.setUname("bss");
		u1.setUpwd("mejdj");
		u1.setUemail("yash@gmail.com");
		u1.setBank("HDFC");
		
		
		Product p1 =new Product();
		p1.setPid(25);
		p1.setPname("mi");
		p1.setPdetails("good");
		p1.setPrate(512);
		
		Order o1=new Order();
		o1.setUser(u1);
		o1.setProd(p1);
		
		
	
		
		repo.save(u1);
		
	}
	
	

	@Test
	public void testDeleteUser() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		User u1 =em.find(User.class, "bushkl");
		em.remove(u1);
		txn.commit();
		em.close();
	}
	
	@Test
	public void testFetchUserByName() {
		User result=repo.fetch("rams");
		System.out.println(result.getName());
	}
	
	
	@Test
	public void testFetchAllCust() {
		List<User> result= repo.fetchAll();
		for (User c : result) {
			System.out.println(c.getName()+ "\t" +c.getBank()+"\t" +c.getApprovalstatus());
		}
	}
	
	@Test
	public void testFetchAllCustIfAcc() {
		List<User> result= repo.fetchIfYes();
		for (User c : result) {
			System.out.println(c.getName()+ "\t" +c.getBank()+"\t" +c.getApprovalstatus());
		}
	}
	
	@Test
	public void testUpdate() {
		User user=repo.fetch("rams");
		user.setBank("IPL");
		repo.update(user);
		
	}
	
	
	@Test
	public void testAdminApprove() {
		User user=repo.fetch("rams");
        user.setApprovalstatus("no");
		repo.update(user);
		
	}
}
