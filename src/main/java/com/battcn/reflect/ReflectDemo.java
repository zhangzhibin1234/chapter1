package com.battcn.reflect;

import sun.awt.PeerEvent;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @className:ReflectDemo
 * @desc:
 * @author:zzb
 * @date:2019/8/1921:55 version:1.0
 **/
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取Class对象的三种方式
        Class c1 = Person.class;
        /*System.out.println("c1="+c1);
        Class c2 = Person.class;
        System.out.println("c2="+c2);
        Class c3 = Class.forName("com.battcn.reflect.Person");
        System.out.println("c3="+c3);
        System.out.println(c1==c2);*/
        //获取所有构造函数并且遍历
       /* Constructor [] constructors = c1.getDeclaredConstructors();
        for(Constructor con:constructors){
            System.out.println(con);
        }
        System.out.println("-------------------------------");
        //获取无参数构造函数
        Constructor con1= c1.getConstructor(null);
        System.out.println(con1);
        System.out.println("-------------------");
        //获取一个参数String构造函数
        Constructor con2 = c1.getConstructor(String.class);
        System.out.println(con2);
        System.out.println("-------------------");
        //获取两个参数私有构造函数
        Constructor con3 = c1.getDeclaredConstructor(String.class,int.class);
        System.out.println(con3);
        System.out.println("-------------------");
        //获取三个参数的构造函数
        Constructor con4= c1.getDeclaredConstructor(String.class,int.class,String.class);
        System.out.println(con4);*/
        //获取构造函数并且创建对象
      /*  Constructor conn = c1.getConstructor(String.class,int.class,String.class);
        Object obj = conn.newInstance("小明",25,"北京");
        if(obj instanceof Person){
            Person person =(Person) obj;
            System.out.println("person:"+person);
        }*/

        //获取私有构造函数，并且创建对象
       /* Constructor conn = c1.getDeclaredConstructor(String.class,int.class);
        conn.setAccessible(true);
        Object obj=conn.newInstance("小明",24);
        if(obj instanceof Person){
            Person p1= (Person)obj;
            System.out.println(p1);
        }*/
    /*   //获取成员变量
        Field[] fields =c1.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field);
        }
        System.out.println("-----------");
        //获取一个public修饰的age属性
        Field ageField =c1.getField("age");
        System.out.println("ageField:"+ageField);
        Field adressField = c1.getDeclaredField("address");
        System.out.println("adressField:"+adressField);
*/
        /*Constructor conn = c1.getConstructor(String.class);
        Person person = (Person) conn.newInstance("小明");
        System.out.println(c1.getField("name").get(person));
        Field ageField = c1.getField("age");
        System.out.println(ageField.get(person));
        ageField.set(person, 25);
        System.out.println(ageField.get(person));
        Field adressField = c1.getDeclaredField("address");
        adressField.setAccessible(true);
        System.out.println(adressField.get(person));
        adressField.set(person, "北京");
        System.out.println(adressField.get(person));*/
        Constructor conn = c1.getConstructor(String.class,int.class,String.class);
        Person person =(Person) conn.newInstance("张三",22,"北京");
        Method method1 = c1.getMethod("method1",null);
        method1.invoke(person,null);
        Method method2=c1.getMethod("method2", String.class);
        method2.invoke(person,"李四");
        Method method5 = c1.getDeclaredMethod("method5",null);
        method5.setAccessible(true);
        method5.invoke(person,null);
    }
}
