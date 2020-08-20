package com.component;

import java.util.ArrayList;

import javax.annotation.Resource;

import com.frame.Dao;
import com.frame.Service;
import com.vo.Items;

public class ItemService implements Service<Items, String> {

	Dao dao;
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	@Override
	public void register(Items v) {
		dao.insert(v);

	}

	@Override
	public void remove(String k) {
		dao.delete(k);
	}

	@Override
	public void modify(Items v) {
		dao.update(v);
	}

	@Override
	public Items get(String k) {
		return (Items)dao.select(k);
		
	}

	@Override
	public ArrayList<Items> get() {
		return dao.select();
	}

}
