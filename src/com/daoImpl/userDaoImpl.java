package com.daoImpl;

import org.hibernate.*;
import java.util.*;
import com.bean.*;
import com.dao.userDao;
import com.hibrenate.Factory.HibernateSessionFactory;

public class userDaoImpl implements userDao{
	@SuppressWarnings("unchecked")
	@Override
	public Boolean login(String loginName,String loginPwd) {
		boolean flag=false;
		Session session= HibernateSessionFactory.getSession();
		String sql="select * from user where userName=? and pwd=?";
		List<User> list;
		list= session.createQuery(sql).setString(0,loginName).setString(1, loginPwd).list();
		if(list.size() != 0){
			flag=true;
		}
		return flag;
		
	}

	@Override
	public void reigster(User user) {	
	}

	@Override
	public Boolean loginout(Integer uid) {
		
		return null;
	}

}
