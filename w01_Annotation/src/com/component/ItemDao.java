package com.component;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.frame.Search;
import com.vo.Item;
@Repository("itemdao")
public class ItemDao implements Dao<Item, String>, Search<Integer, Integer, Item> {

	@Override
	public void insert(Item v) {
		System.out.println("item insert....: " + v);
	}

	@Override
	public void update(Item v) {
		System.out.println("item update....: " + v);

	}

	@Override
	public void delete(String k) {
		System.out.println("item delete....: " + k);

	}

	@Override
	public Item select(String k) {
		Item item = new Item(k, "James");		
		return item;
	}

	@Override
	public ArrayList<Item> select() {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("id01", "mirror1"));
		list.add(new Item("id02", "mirror2"));
		list.add(new Item("id03", "mirror3"));
		list.add(new Item("id04", "mirror4"));
		list.add(new Item("id05", "mirror5"));
		return list;
	}

	@Override
	public ArrayList<Item> search(Integer k) {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("id01", "mirror1"));
		list.add(new Item("id02", "mirror2"));
		return list;
	}

	@Override
	public ArrayList<Item> search(Integer k1, Integer k2) {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("id01", "mirror1"));
		list.add(new Item("id02", "mirror2"));
		list.add(new Item("id03", "mirror3"));
		return list;
	}
	
	

}
