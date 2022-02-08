## HashMap

### 1、map.put(k,v)实现原理

1. 先将k,v封装到Node对象中
2. 底层会调用k的HashCode()方法得出hash值，然后通过哈希函数将hash值转换为数组的下标，下表上如果没有任何元素就将Node添加到当前位置。如果下标对应的位置有链表，就会拿着k和链表上每一个结点的k进行equals，如果所有的equals方法返回的都是false,那么这个新结点就会给添加到链表的末尾。如果其中有一个equals返回了true， 那么这个节点的value将会被覆盖

### 2、map.get(k)实现原理

1. 先调用k的hashcode()方法得出哈希值，通过哈希算法转换为数组下标，通过数组下标快速定位到某个位置上，如果这个位置上什么也没有，返回null。如果这个位置上有单向链表，那么会拿着参数k和单向链表上的每个节点中的k进行equals，如果所有的equals返回false，那么get方法返回false.只要其中有一个结点的k和参数kequals的时候返回true，那么这个时候这个节点的value就是需要返回的value

### 3、哈希表随即增删和查询效率高的原因

- 增删是在链表上进行的
- 查询并不需要全部扫描，只需要扫描部分

### 4、JDK8对HashMap的改进
源码中有一个 static final int TREEIFY_THRESHOLD = 8;，意思是当某一个数组下标对应的链表中的系欸但那数量达到8的时候，再增加结点，链表就会变成红黑树，当红黑树上的结点数量小于6的时候会将红黑指数再转换为单向链表，在源码中对应的是 static final int UNTREEIFY_THRESHOLD = 6;