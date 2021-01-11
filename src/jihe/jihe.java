package jihe;
import java.util.ArrayList;
import java.util.List;

public class jihe {
    public static void main(String[] args) {

        List list=new ArrayList();
        list.add(1);
        list.add("河池学院");
        list.add(8888.888f);
        list.add(false);
        list.add("发呆呢，哥。");

        System.out.println("Set的长度大小为：" + list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
