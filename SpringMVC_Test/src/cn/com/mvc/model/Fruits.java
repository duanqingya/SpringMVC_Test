/**
 * 
 */
/**
 * @author Administrator
 *
 */
package cn.com.mvc.model;

public class Fruits{
	private String name;//水果名
	private double price;//价格
	private String producing_area;//产地
	
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price = price;
    }
    
    public String getproducing_area() {
        return producing_area;
    }
    public void setproducing_area(String producing_area) {
        this.producing_area = producing_area;
    }
}