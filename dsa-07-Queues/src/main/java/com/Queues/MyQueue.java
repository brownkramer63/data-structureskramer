package com.Queues;

public class MyQueue <T>{

    QNode<T> front;
    QNode<T> back;
    int size;

    boolean isEmpty(){
        return front==null;
    }

    T peak(){
        return (T) front.value;
    }

    void enqueue(T item){
        QNode<T> node= new QNode<>(item);
        if (isEmpty()){
            front=back=node;
        }
        else{
            back.next= node;
            back=node;
        }
        size++;
    }






}
