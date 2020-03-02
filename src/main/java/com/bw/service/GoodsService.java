package com.bw.service;

import java.util.List;

import com.bw.entity.Condition;
import com.bw.entity.Goods;

public interface GoodsService {
	int insert(List<Goods> goods);

	List<Goods> list(Condition con);
}
