package array;

/**
 * @author dongf
 * @date 2019/05/24
 */
public class GenericArray<T> {

    public T[] data;
    private int size;
    //根据容量构造Array
    public GenericArray(int capacity){
        this.data = (T[])new Object[capacity];
        this.size = 0;
    }
    //无参构造方法，默认数组容量为10
    public GenericArray(){
        this(10);
    }
    //获取数组容量
    public int getCapacity(){
        return data.length;
    }
    //获取当前元素个数
    public int getSize(){
        return this.size;
    }
    //判断数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    //修改index位置的元素
    public void set(int index,T value){
        checkIndex(index);
        data[index] = value;
    }

    //获取对应index位置的元素
    public T get(int index){
        checkIndex(index);
        return data[index];
    }
    //查看数组是否包含元素
    public boolean contains(T e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    //获取对应元素的下标，未找到，返回 -1
    public int find(T e){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    //在index位置，插入元素e，时间复杂度 o(m+n)
    public boolean insert(int index,T e){
        checkIndex(index);
        // 如果当前元素个数等于数组容量，则将数组扩容为原来的2倍
        if (size == data.length){
            for (int i = 0; i < data.length; i++) {
                
            }
            data = (T[])new Object[2*data.length];
        }
        return false;
    }
    //向数组头插入元素

    //向数组尾插入元素

    //删除index位置的元素，并返回

    //删除第一个元素

    //删除末尾元素

    //从数组中删除指定元素

    //扩容方法，时间复杂度o（n）

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed! Require index >=0 and index <= size.");
        }
    }
}
