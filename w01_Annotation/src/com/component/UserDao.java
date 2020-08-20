package com.component;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.User;
@Repository("userdao")
public class UserDao implements Dao<User, String> {

	@Override
	public void insert(User v) {
		System.out.println("user insert....: " + v);
	}

	@Override
	public void update(User v) {
		System.out.println("user update....: " + v);
	}

	@Override
	public void delete(String k) {
		System.out.println("user delete....: " + k);
	}

	@Override
	public User select(String k) {
		User user = new User(k, "pwd02", "James");
		return user;
	}

	@Override
	public ArrayList<User> select() {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01", "pwd01","James1"));
		list.add(new User("id02", "pwd02","James2"));
		list.add(new User("id03", "pwd03","James3"));
		list.add(new User("id04", "pwd04","James4"));
		list.add(new User("id05", "pwd05","James5"));
		return list;
	}

	

}
