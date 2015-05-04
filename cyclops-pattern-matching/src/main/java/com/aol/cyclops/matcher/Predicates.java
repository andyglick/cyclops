package com.aol.cyclops.matcher;

import java.util.function.Predicate;

import com.aol.cyclops.matcher.builders.ADTPredicateBuilder;


public class Predicates {

	public static <T> Predicate<T> p(Predicate<T> p){
		return p;
	}

	public static final Predicate __ = test ->true;
	public static final <Y> Predicate<Y> ANY(){  return __; };
	public static final <Y> Predicate<Y> ANY(Class c){  return a -> a.getClass().isAssignableFrom(c); };
	
	
	public	static<T> ADTPredicateBuilder<T> type(Class<T> type){
			return new ADTPredicateBuilder(type);
	}
	public	static<V> Predicate with(V... values){
		return new ADTPredicateBuilder<Object>(Object.class).<V>with(values);
}
	
}