1.用到thymeleaf的foreach遍历

2.get请求特殊的传值方式

3.对form使用选择变量表达式

接口设计：
> /guest/list get请求 查询列表 无查询参数 返回结果：List<Guest>
>
> /guest/toAdd get请求 点击增加按钮 返回add.html页面 须填写名字和角色
>
> /guest/add post请求 增加操作 传参为Guest 返回结果：跳转到list页面
>
> /guest/toUpdate get请求 点击修改按钮返回update.html页面 名字固定 角色可改
>
> /guest/update post请求 修改操作 传参Guest 返回结果：跳转到list页面
>
> /guest/delete 删除操作 传参Guest name 返回结果：跳转到list页面