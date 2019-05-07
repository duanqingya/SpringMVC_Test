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
		//ģ��Service��ȡˮ����Ʒ�б�
		List<Fruits> fruitsList=fruitsService.queryFruitsList();
		//����ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		//�൱��request��setAttribut����jspҳ����ͨ��fruitsList��ȡ����
		modelAndView.addObject("fruitsList", fruitsList);
		//ָ����ͼ
		modelAndView.setViewName("/WEB-INF/jsp/fruits/fruitsList.jsp");
		return modelAndView;
	}
}

//ģ��Service���ڲ���
class FruitsService{
	public List<Fruits> queryFruitsList() {
		List<Fruits> fruitsList=new ArrayList<Fruits>();
		
		Fruits apple =new Fruits();
		apple.setname("�츻ʿƻ��");
		apple.setprice(2.3);
		apple.setproducing_area("ɽ��");
	
		Fruits Banan =new Fruits();
		Banan.setname("�㽶");
		Banan.setprice(1.5);
		Banan.setproducing_area("�Ϻ�");
		
		Fruits orange =new Fruits();
		orange.setname("����");
		orange.setprice(1.0);
		orange.setproducing_area("����");
		
		fruitsList.add(apple);
		fruitsList.add(Banan);
		fruitsList.add(orange);
		System.out.println(11);
		return fruitsList;
				
		
	}
	
}