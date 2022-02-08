## IO流

### IO流的分类

一种是按照流的方向进行分类：往内存中去，叫做输入或者叫做读;往内存中出来叫输出或者叫写

另一种方式是按照读取数据方式的不同进行分类，有的流是按照字节的方式读取数据，一次性读取一个字节，等同于一次读取8个二进制位，这种流什么类型的数据都能够读取。有的流是按照字符的方式读取数据的，一次性读取一个字符。这种方式是为了方便读取普通的文本文件，这种流只能读取普通的文本文件

**在Windows系统中，一个char型数据占1个字节，但是在java中占据2个字节，一个中文字符占2个字节**

**在java中只要类名以stream结尾的都是字节流，以Reader/Writer结尾的都是字符流**

### JavaIO流中常用的16个流

文件专属

- java.io.FileInputStream
- java.io.FileOutputStream
- java.io.FileWriter
- java.io.FileReader

转换流（将字节流转换为字符流）

- java.io.InputStreamReader
- java.io.OutputStreamWriter

缓冲流专属

- java.io.BufferedReader
- java.io.BufferedWriter
- java.io.BufferedInputStream
- java.io.BufferedOutputStream

数据流专属

- java.io.DataInputStream
- java.io.DataOutputStream

标准输出流

- java.io.ObjectInputStream
- java.io.ObjectOutputStream

对象专属流

- java.io.PrintStream
- java.io.PrintWriter

### File类
