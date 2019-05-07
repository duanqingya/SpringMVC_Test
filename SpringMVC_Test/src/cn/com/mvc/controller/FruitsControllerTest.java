package cn.com.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

import cn.com.mvc.model.Fruits;


public class FruitsControllerTest implements Controller{
	private FruitsService fruitsService= new FruitsService();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request , HttpServletResponse response) 
			throws Exception {
		// TODO Auto-generated method stub
		//模拟Service获取水果商品列表
		List<Fruits> fruitsList=fruitsService.queryFruitsList();
		//返回ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		//相当于request的setAttribut，在jsp页面中通过fruitsList获取数据
		modelAndView.addObject("fruitsList", fruitsList);
		//指定视图
		modelAndView.setViewName("/WEB-INF/jsp/fruits/fruitsList.jsp");
		return modelAndView;
	}
}

//模拟Service的内部类
class FruitsService{
	public List<Fruits> queryFruitsList() {
		List<Fruits> fruitsList=new ArrayList<Fruits>();
		
		Fruits apple =new Fruits();
		apple.setname("红富士苹果");
		apple.setprice(2.3);
		apple.setproducing_area("山东");
	
		Fruits Banan =new Fruits();
		Banan.setname("香蕉");
		Banan.setprice(1.5);
		Banan.setproducing_area("上海");
		
		Fruits orange =new Fruits();
		orange.setname("橘子");
		orange.setprice(1.0);
		orange.setproducing_area("湖南");
		
		fruitsList.add(apple);
		fruitsList.add(Banan);
		fruitsList.add(orange);
		System.out.println(11);
		return fruitsList;
				
		
	}
	
}