package org.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        //Lazy singleton
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println( lazySingleton1 == lazySingleton2);

        //Eager singleton
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println( eagerSingleton == eagerSingleton1);

        //Thread safe singleton
        ExecutorService executorService = null;
        Mythread mythread = new Mythread();
         try {
             executorService = Executors.newFixedThreadPool(2);
             executorService.execute(mythread.runnable);
             executorService.execute(mythread.runnable);
             executorService.execute(mythread.runnable);
         } catch (Exception e){
             e.printStackTrace();
         }finally {
             if(executorService != null){
                 executorService.shutdown();
             }
         }

         //    Serializable Singleton

        SerializableSingleton singleton1 = SerializableSingleton.getInstance();
        ObjectOutput objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("C:/Users/Hp/Downloads/txt/singleton.ser")));
        objectOutputStream.writeObject(singleton1);

        SerializableSingleton singleton2 = null;
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("C:/Users/Hp/Downloads/txt/singleton.ser")));
        singleton2 = (SerializableSingleton) objectInputStream.readObject();

        System.out.println(singleton1 == singleton2);

        // Cloneable singleton

//        CloneableSingleton cloneableSingleton = CloneableSingleton.getInstance();
//        CloneableSingleton cloneableSingleton1 = (CloneableSingleton) cloneableSingleton.clone();
//        System.out.println(cloneableSingleton==cloneableSingleton1);

        // How to break singleton using Reflection

        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = null;

     Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();

        for (Constructor constructor:constructors) {
            constructor.setAccessible(true);
            try {
               instance2 = (LazySingleton) constructor.newInstance();
               break;
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(instance1.hashCode() + "  "+ instance2.hashCode());


// Solve the reflection problem as ENUM

       ENUMSingleton enumSingleton =  ENUMSingleton.INSTANCE;
        System.out.println(enumSingleton.getName());
        enumSingleton.setName("Gopal");
        System.out.println(enumSingleton.getName());

        String e = "HJ";
        String e2 = "ABC";
        String e3 = e;

        System.out.println(e.equals(e2));
        System.out.println(e == e2);

        System.out.println(e3.equals(e));
        System.out.println(e3 == e);




    }
}
