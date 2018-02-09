package com.daoImpl;

import org.hibernate.*;
import java.util.*;
import com.bean.*;
import com.dao.userDao;
import com.hibrenate.Factory.HibernateSessionFactory;

public class userDaoImpl implements userDao{
	@Override
	public User login(Integer uid) {
		Session session= HibernateSessionFactory.getSession();
		Transaction ts =null;
		User user=null;
		try{
			ts= session.beginTransaction();
			user= (User) session.get(User.class,uid);
		}catch (Exception e) {
			if(ts !=null)ts.rollback();
			System.out.println("System error!保持持久化对象时出错，原因是：");
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void reigster(User user) {	
	}

	@Override
	public Boolean loginout(Integer uid) {
		
		return null;
	}

}
