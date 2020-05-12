# 微服务集成Redis



1.存入与设置缓存时间

```java
@Autowired
private StringRedisTemplate stringRedisTemplate;

//获取字符型键值
String token = stringRedisTemplate.opsForValue().get(SignLockKeyConstant.KEY_EQIANBAO_VERIFY_TOKEN_PREFIX);

//向redis里存入数据和设置缓存时间
stringRedisTemplate.opsForValue().set(SignLockKeyConstant.KEY_EQIANBAO_VERIFY_TOKEN_PREFIX, token,100,TimeUnit.MINUTES);
```