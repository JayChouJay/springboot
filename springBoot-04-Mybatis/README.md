1.pom引入mybatis集成包

2.yml配置数据源

3.配置mybatis的配置项：指定配置文件（mybatis.xml）

4.声明sql位置（可以声明在mybatis中/yml中/写注解中），扫描mapper位置（启动类上的注解@ScannerMapper() / Mapper上顶@Mapper）

4.编写mybatis.xml:指定mapper.xml(声明domain别名)

5.编写mapper接口,mybatis提供三个sql位置：注解中，sql文件中（可以看示例），xml中。可以混合使用

插件

tk.mybatis

介绍：参考了JPA的设计思想
使用方式：继承通用Mapper
>1.引入插件依赖
>
> 2.mapper接口继承Mapper（自动生成很多方法）

Mybatis-plus