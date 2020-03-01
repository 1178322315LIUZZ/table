package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.GoodsDao;
import com.bw.entity.Goods;
import com.bw.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;

	public int insert(List<Goods> goods) {
		// TODO Auto-generated method stub
		return goodsDao.insert(goods);
	}
	
}
