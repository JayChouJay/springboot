1.freemarker
> 1.导入模板引擎的依赖
>
> 2.配置视图解析位置与文件后缀
>
> 3.配置freemarker解析器解析文件名后缀
>
> 4.三种编写方式解析页面

2.thymeleaf

名字：百里香的叶子
> 官方推荐，spring.io由它作为模板引擎编写

特点：
> 动静分离：数据有默认值，页面能直接打开
>
使用：
> 引入启动器+layout-dialect布局依赖
> 编写html，引入<html lang="en" xmlns:th="http://www.thymeleaf.org">
> 五种表达式