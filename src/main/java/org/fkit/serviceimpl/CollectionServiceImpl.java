package org.fkit.serviceimpl;

import org.fkit.domain.Collection;
import org.fkit.domain.Good;
import org.fkit.mapper.CartMapper;
import org.fkit.mapper.CollectionMapper;
import org.fkit.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("collectionService")
public class CollectionServiceImpl implements CollectionService {
	@Autowired
	private CollectionMapper collectionMapper;
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	@Override
	public void addCollection(String user_name,String goodname){
		collectionMapper.addCollection(user_name, goodname);
	}
	public Collection selectCollection(String user_name,String goodname){
		 return collectionMapper.selectCollection(user_name, goodname);
		
	}
	public Good selectGood(String goodname){
		return collectionMapper.selectGood(goodname);
	}
	
}
