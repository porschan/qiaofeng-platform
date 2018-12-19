# qiaofeng-platform

1.init project time :2018/12/6 17:36:34 

```
	1.获取系统时间戳:
	GET/POST - https://domain/qiaofeng/api/currentTimeMillis
	2.测试用户账号：
	POST - https://domain/qiaofeng/api/person
	Body(JSON(application/json)):
		{
		    "userName": "porschan",
		    "note": "hello"
		}
	respon:
	{
	    "userName": "porschan",
	    "note": "hello"
	}
```
