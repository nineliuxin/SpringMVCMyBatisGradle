package org.fkit.serviceimpl;

import java.util.List;

import org.fkit.domain.Good;
import org.fkit.domain.User;
import org.fkit.mapper.GoodMapper;
import org.fkit.mapper.UserMapper;
import org.fkit.service.GoodService;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service("goodService")
public class GoodServiceImpl implements GoodService{
	@Autowired
	private GoodMapper goodMapper;
	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	@Override
	
	public List<Good> show(String num){
		return goodMapper.selectWithSuk(num);
	}
	public Good show2(String suk){
		return goodMapper.selectWithSuk2(suk);
	}
	public List<Good> showgood(){
		return goodMapper.showgood();
	}
}
