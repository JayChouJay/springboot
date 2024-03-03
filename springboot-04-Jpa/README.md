JPA

名称：Java Persistence API

介绍：Sun官方提供的Java持久化规范

1.pom引入JPA

2.yml配置JPA：数据源，JPA

3.改造mapper:mapper继承JPA（继承了方法）,并使用@Repository

4.更改实体类为JPA规范：在domain对象添加@Entity,@Id和@Column，并且实现序列化接口