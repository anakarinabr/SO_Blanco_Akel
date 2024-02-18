/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author Ana Blanco
 */
public class Node<T> {
    
    private T data;
    private Node<T> pNext;

    public Node(T data) {
        this.data = data;
        this.pNext = null;
    }
    
    public Node(T data, Node<T> pNext) {
        this.data = data;
        this.pNext = pNext;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getpNext() {
        return pNext;
    }

    public void setpNext(Node<T> pNext) {
        this.pNext = pNext;
    } 
}

