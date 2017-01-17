package com.company;

/**
 * Created by eminem on 2017/1/17.
 */
public class Human extends  Animal {  //继承
   private String country;
   public Human(String name,int age,String country)
   {
     super(name,age);//调用父类(基类)Animal构造方法一定要放在方法的首个语句
     this.country=country;
   }

    @Override
    public void say() {     //同样的接口实现的类是不一样的，比如人和动物的say （多态）
       System.out.println("This is Human from"+country);//重新做了say的实现
    }
}
