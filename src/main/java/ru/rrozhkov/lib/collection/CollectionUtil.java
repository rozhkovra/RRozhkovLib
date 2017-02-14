package ru.rrozhkov.lib.collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtil {
	@SuppressWarnings("rawtypes")
	public static boolean isNullOrEmpty(Collection collection){
		return collection==null || collection.isEmpty();		
	}
	
	public static <T> Collection<T> copy(Collection<T> collection){
		return new LinkedList<T>(collection);
	}

	public static <T> Collection<T> merge2copy(Collection<T> collection, T obj){
		Collection<T> newCollection = new LinkedList<T>(collection);
		newCollection.add(obj);
		return newCollection;
	}
	
	public static <T> Collection<T> create(){
		return new LinkedList<T>();
	}

	public static <T> T get(Collection<T> collectoin, int index){
		if(index > collectoin.size()-1 || index < 0)
			return null;
		return ((List<T>)collectoin).get(index);

	}
}