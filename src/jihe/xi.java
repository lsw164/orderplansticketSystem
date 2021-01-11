package jihe;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class xi {
     public static void main(String[] args) {
          Set set=new HashSet();
          set.add(1);
          set.add("河池学院");
          set.add(8888.888f);
          set.add(false);
          set.add(1);

          System.out.println("Set的长度大小为：" + set.size());

          Iterator iterator=set.iterator();

          for(int i=0;i<set.size();i++){
               System.out.println("集合内的元素有：" + iterator.next());
          }

     }

}


