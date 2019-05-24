package array;

/**
 *  1) 数组的插入、删除、按照下标随机访问操作；
 *  2）数组中的数据是int类型的；
 * @author dongf
 * @date 2019/05/23
 */
public class Array {

    //定义属性
    //容器，存储数据
    public int[] data;
    //数组长度（储存数据的个数）
    private int count;
    //数组容量大小
    private int capacity;

    //初始化数组
    public Array(int capacity){
        this.data = new int[capacity];
        this.capacity = capacity;
        this.count = 0;
    }

    //按索引，找到对应数据并返回
    public int get(int index){
        if (index>=count || index<0){
            return -1;
        }
        return data[index];
    }

    //按索引，插入数据
    public boolean insert(int index,int value){
        if (count == capacity){
            System.out.println("数组已经存满！");
            return false;
        }
        if (index>count || index<0){
            System.out.println("索引位置不合法！");
            return false;
        }
        //从头部开始迁移，倒叙把头至索引处的数据往后迁移一位
        for (int i = count; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        count++;
        return true;
    }

    //按索引，删除数据
    public boolean delete(int index){
        if (index>=count || index<0){
            System.out.println("索引位置不合法！");
            return false;
        }
        for (int i = count; i < index ; ++i) {
            data[i-1]=data[i];
        }
        return true;
    }

    public void printAll(){
        for (int datum : data) {
            System.out.print(datum+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array array = new Array(5);
        array.printAll();
        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);
        array.insert(3, 10);
        //array.insert(3, 11);
        array.printAll();
    }

}
