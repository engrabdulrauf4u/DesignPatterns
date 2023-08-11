package com.example.DesignPatterns.creational.objectpool;


/*Object pool pattern is a software creational design pattern which is used in situations
        where the cost of initializing a class instance is very high.*/


/*Create ObjectPool class with private array of Objects inside
Create acquire and release methods in ObjectPool class
Make sure that your ObjectPool is Singleton*/

public class ObjectPoolDemo {
    public static void main(String[] args) {


        SharedObject obj1 = ObjectPool.getObject();
        SharedObject obj2 = ObjectPool.getObject();



        ObjectPool.releaseObject(obj1);
        ObjectPool.releaseObject(obj2);

        SharedObject obj3 = ObjectPool.getObject();
        SharedObject obj4 = ObjectPool.getObject();

        ObjectPool.releaseObject(obj3);
        ObjectPool.releaseObject(obj4);

    }
}
