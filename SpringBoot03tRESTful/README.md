1.查询变rest
>url改变

2.0 到增加页
2.增变rest
>url改变

3.0 到改变页面
>url改变,导致thymeleaf的a标签格式也改变
> 
>映射参数上增加@PathVariable("name")注解指定参数

3.改变rest
> url改变
> 
> form表单增加input hidden
>
> 映射参数上增加@PathVariable("name")注解指定参数

4.删除变rest
> url改变
> 
> a标签变button
> 
> 编写js发送get请求:点击button时触发一个隐形的form，js绑定button的url属性，提交
> 
> 映射参数上增加@PathVariable("name")注解指定参数

|        | 传统API                                                 | RESTful API                         |
| ------ | :------------------------------------------------------ | :---------------------------------- |
| 查询   | /guest/list                                       <GET> | /guest                      <GET>   |
| to添加 | /guest/toAdd                                  <GET>     | /guest/toAdd          <GET>         |
| 添加   | /guest/add?guest={guest}            <POST>              | /guest                       <POST> |
| to编辑 | /guest/toUpdate?name={name}<GET>                        | /guest/toUpdate/{name}<GET>         |
| 编辑   | /guest/update?guest={guest}       <POST>                | /guest                        <PUT> |
| 删除   | /guest/delete?name={name}        <GET>                  | /guest/{name}         <DELETE>      |

5.引入webjars
>pom导包
>
>页面引入：<script type="text/javascript" th:src="@{/webjars/jQuery/dist/jquery.js}"/>