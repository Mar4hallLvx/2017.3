package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    /**
     *
     * @param index
     * @param object
     */
    public static void print(int index,Object object)
    {
        System.out.println(String.format("{%d},%s",index,object.toString()));
    }

    public static void demoList()
    {
        List<String> strList=new ArrayList<String>();
        for(int i=0;i<4;++i)
        {
            strList.add(String.valueOf(i*i));
        }
        print(1,strList);
        List<String> strListB=new ArrayList<String>();
        for(int i=0;i<4;i++)
        {
            strListB.add(String.valueOf(i));
        }
        strList.addAll(strListB);
        print(2,strList);
        //strList.add(strListB);
       // print(3,strList);
        Collections.reverse(strList);
        print(6,strList);
        Collections.sort(strList);
        print(7,strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(8,strList);
        for(String obj:strList)
        {
            print(9,obj);
        }
        for(int i=0;i<strList.size();i++)
        {
            print(10,strList.get(i));
        }
    }

    public static void demMapTable()
    {
        Map<String,String>map=new HashMap<String ,String>();
        for(int i=0;i<4;++i)
        {
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map);
        for(Map.Entry<String ,String>entry:map.entrySet())
        {
            print(2,entry.getKey()+"|"+entry.getValue());
        }
        print(3,map.values());
        print(4,map.keySet());
        print(5,map.get("3")); //get 里面是key
        print(6,map.containsKey("A"));
    }


    public static void demoSet()   //集合
    {
        Set<String>strSet=new HashSet<String>();//集合元素是不重复的
        for(int i=0;i<3;++i)
        {
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
        strSet.remove(String.valueOf(1));
        print(2,strSet);
        print(3,strSet.contains(String.valueOf(1)));
        strSet.addAll(Arrays.asList(new String []{"A","B","C"}));
        print(6,strSet);
        for(String value:strSet)
        {
            print(7,value);
        }
    }
    public static void demoException()
    {
        try
        {
            int k=2;
             //k=k/0;
            if(k==2)
            {
                throw new Exception("我故意的");
            }
        }catch(Exception e)
        {
            print(2,e.getMessage());
        }finally {
            print(3,"finally");
        }
    }

    public static void demo00()
    {
        Animal a=new Animal("jim",1);
        a.say();
        Animal human=new Human("Lei",11,"China");
        human.say();
    }
    public static void demoFunction()
    {
        Random random=new Random();
        //random.setSeed(1);//这样就编程伪随机 每次出来值都相同 可以节省存储空间
        print(1,random.nextInt(1000));
        print(1,random.nextDouble());//float double 在0和1之间
        List<Integer>array=Arrays.asList(new Integer[]{1,2,3,4,5});
        Collections.shuffle(array);// 对数组进行随机的打乱。。
        print(3,array);
        Date date=new Date();
        print(4,date);
        print(5,date.getTime());//离1970年多少秒
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(6,df.format(date));
        print(11,Math.ceil(2.2));
        print(12,Math.floor(2.2));
    }
    public static void main(String[] args) {
        demoFunction();
       // demo00();
	/* write your code here */
      //  print(1, "hello world");
        //demMapTable();
        //demoList();
        //demoSet();
       // demoException();
    }

}
