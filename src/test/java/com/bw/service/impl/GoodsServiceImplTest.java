package com.bw.service.impl;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bw.entity.Goods;
import com.bw.service.GoodsService;
import com.zhenzhen.common.utils.StreamUtil;
import com.zhenzhen.common.utils.StringUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class GoodsServiceImplTest {
	@Autowired
	private GoodsService goodsService;
	@Test
	public void testInsert() throws Exception {
		List<Goods> list=new ArrayList<Goods>();
		List<String> list2 = StreamUtil.read(this.getClass().getResourceAsStream("/date.txt"));
		for (String string : list2) {
			Goods g=new Goods();
			String[] split = string.split("==");
			String ids=split[0];
			if(StringUtil.isNumber(ids)) {
				g.setId(Integer.valueOf(ids));
			}
			String names=split[1];
			if(StringUtil.hasText(names)) {
				g.setName(names);
			}
			String prices=split[2];
			if(StringUtil.hasText(prices)) {
				prices=prices.substring(1);
				if(StringUtil.isNumber(prices)) {
					   g.setPrice(new BigDecimal(prices));
				}
			}
			if(split.length==4) {
				String sale=split[3];
				if(StringUtil.hasText(sale)) {
					sale=sale.substring(0, sale.length()-1);
					if(StringUtil.isNumber(sale)) {
						  g.setSales(Integer.valueOf(sale));
					}
				}
			}else {
				g.setSales(0);
			}
			list.add(g);
		}
		goodsService.insert(list);
	}

}
