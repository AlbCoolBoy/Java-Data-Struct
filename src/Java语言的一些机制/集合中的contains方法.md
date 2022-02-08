## 集合中的contains方法

使用contains方法进行对象的比较的时候会调用equals方法，但是如果不进行equals方法的重写，会默认使用Object类中的equals方法。



Object中的equals方法是直接比较对象的内存地址的，源代码如下：


```java
public boolean equals(Object obj) {
        return this == obj;
    }
```

