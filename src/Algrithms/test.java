import java.util.*;

public class test{
    public static <T extends Comparable<T>> T Compare(T[] array) //T指任意类型  继承了Comparable接口，查看JDK文档法相有解释
    {
        T m=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i].compareTo(m)<0)//array[i]比m小就将其赋值给m
            {m=array[i];}
        }
        System.out.println(m);
        return m;
    }

    public static void main(String[] agrs)
    {
        Integer[] array1 = {1,2,3,4};
        Double[] array2 = {1.1,1.2,1.0,-0.1};
        String[] array3={"abc","abd","ab","bcd"};//类型不匹配可能就是写成的int double 不在泛型类中
        Compare(array1);
        Compare(array2);
        Compare(array3);
    }
}
