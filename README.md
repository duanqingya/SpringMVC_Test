# SpringMVC_Test
第一步：web.xml:
    添加SpringMVC的前端控制器，用于拦截符合配置的URL

第二步：springmvc.xml:
     （1）添加处理器映射器HandlerMapping
     （2）配置处理器适配器HandlerAdapter
     （3）配置视图解析器ViewResolver
     （4）配置一个可以被URL映射的Handler的bean,供处理器查找

第三步：controller类：
     （1）在cn.com.mvc.controller包下创建controller类
     （2）用于加载一个水果商城的水果列表信息

第四步：model类：
     （1）在cn.com.mvc.model包下创建model类
     （2）水果实体类，set，get

第五步：JSP视图：
     （1）在/WEB-INF/jsp/fruits路径下创建名为fruitsList.jsp的jsp文件
     （2）水果实体类，set，get
     （3）在springmvc.xml中配置一个可以被URL映射的Handler的bean,供处理器查找

第六步：将工程部署到Tomcat服务器中，打开浏览器访问以下路径（这里Tomcat的端口为8080）：
    http://localhost:8080/SpringMVC_Test/queryFruits_test.action
	
测试结果页面：
  ![Image text]https://github.com/duanqingya/SpringMVC_Test/blob/master/Test_Result.jpg