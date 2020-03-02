package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.entity.Condition;
import com.bw.entity.Goods;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	@RequestMapping("list.do")
	public String list(Model m,@RequestParam(defaultValue = "1")int pageNum,Condition con) {
		PageHelper.startPage(pageNum, 5);
		List<Goods> list=goodsService.list(con);
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		m.addAttribute("g", list);
		m.addAttribute("pg", page);
		m.addAttribute("c", con);
		return "list";
	}
}
