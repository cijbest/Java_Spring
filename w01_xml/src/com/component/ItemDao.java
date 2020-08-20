package com.component;

import java.util.ArrayList;

import com.frame.Dao;
import com.vo.Items;
import com.vo.User;

public class ItemDao implements Dao<Items, String> {

	@Override
	public void insert(Items v) {
		System.out.println("item insert....: " + v);
	}

	@Override
	public void update(Items v) {
		System.out.println("item update....: " + v);

	}

	@Override
	public void delete(String k) {
		System.out.println("item delete....: " + k);

	}

	@Override
	public Items select(String k) {
		Items item = new Items(k, "James");		
		return item;
	}

	@Override
	public ArrayList<Items> select() {
		ArrayList<Items> list = new ArrayList<>();
		list.add(new Items("id01", "mirror1"));
		list.add(new Items("id02", "mirror2"));
		list.add(new Items("id03", "mirror3"));
		list.add(new Items("id04", "mirror4"));
		list.add(new Items("id05", "mirror5"));
		return list;
	}

	

}
