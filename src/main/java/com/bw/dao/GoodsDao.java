package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Goods;

public interface GoodsDao {
	int insert(@Param("list")List<Goods> goods);
}
