package com.example.DesignPatterns.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool {

    private static SharedObject instance;
    private int poolSize;
    private static List<SharedObject> reusablePool = new ArrayList<SharedObject>();

    private ObjectPool(){

    }


    static SharedObject createObject(){

        return new SharedObject();
    }

   public static synchronized SharedObject getObject() {

       for (SharedObject sharedObject:reusablePool
       ) {
           if(!sharedObject.isAlreadyInUse()){
               sharedObject.setAlreadyInUse(true);
               sharedObject.reset();
               System.out.println("Re Using same Object");
               System.out.println("Shared Object : " + sharedObject.toString());
               return  sharedObject;
           }
       }
       System.out.println("Creating new Object");
       SharedObject newSharedObject = createObject();
       newSharedObject.setAlreadyInUse(true);
       System.out.println("Shared Object : " + newSharedObject.toString());
       reusablePool.add(newSharedObject);

       return newSharedObject;
    }
    public static synchronized void releaseObject(SharedObject obj) {
        for (SharedObject sharedObject:reusablePool
             ) {
            if(sharedObject==obj){
                sharedObject.setAlreadyInUse(false);
            }

        }
    }

}
