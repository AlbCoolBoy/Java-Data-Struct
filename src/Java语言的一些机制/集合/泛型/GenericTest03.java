package Java语言的一些机制.集合.泛型;
//自定义泛型
public class GenericTest03<E> {
    public static void main(String[] args) {
        MyIterator<String> mi=new MyIterator<>();
        String s=mi.get();

        MyIterator<Animal> animal=new MyIterator<>();
        Animal a=animal.get();
    }
}
class MyIterator<T>{
    public T get() {
        return null;
    }
}