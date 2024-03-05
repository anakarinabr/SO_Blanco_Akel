/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author Ana Blanco
 */
public class Queue<T> {

    private Node<T> pHead;
    private Node<T> pTail;
    private int size;

    public Queue() {
        this.pHead = null;
        this.pTail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.pHead == null;
    }

    public void Enqueue(T data) {
        Node<T> node = new Node(data);
        if (this.isEmpty()) {
            this.pHead = node;
            this.pTail = node;
        } else {
            this.pTail.setpNext(node);
            this.pTail = node;
        }
        this.size++;
    }

    public Node<T> Dequeue() {
        Node<T> node = this.pHead;
        if (!this.isEmpty()) {
            this.pHead = this.pHead.getpNext();
            size--;
        }
        return node;
    }

    public boolean exists(T valor) {
        boolean b = false;
        for (int i = 0; i < this.size; i++) {
            T data = this.pHead.getData();
            if (valor == data) {
                b = true;
            }
            this.Dequeue();
            this.Enqueue(data);
        }

        return b;
    }

    public void colearDePrimero(T data) {
        Node<T> node = new Node(data);
        if (this.isEmpty()) {
            this.pHead = node;
            this.pTail = node;
            this.size++;
        } else {
            this.Enqueue(data);
            for (int i = 0; i < this.size - 1; i++) {
                T auxData = this.pHead.getData();
                this.Dequeue();
                this.Enqueue(auxData);
            }
        }
    }

    public void reverse() {
        if (!this.isEmpty()) {
            T data = this.pHead.getData();
            this.Dequeue();
            this.reverse();
            this.Enqueue(data);
        }
    }

    public String print() {
        String output = "";
        if (this.pHead!= null) {
            for (int i = 0; i < this.size; i++) {
                Personaje data = (Personaje) this.pHead.getData();
                String id = data.getId();
                output += id + " | ";
                this.Dequeue();
                this.Enqueue((T) data);
            }
        }else{
            return "";
        }
        return output;
    }

    public void EliminarPersonaje(Personaje personaje) {
        if (!this.isEmpty()) {
            Node pAux = this.pHead;
            Personaje pAuxp = (Personaje) pAux.getData();

            if (pAuxp.getId() == personaje.getId()) {
                this.pHead = this.pHead.getpNext();
                if (this.pHead == null) {
                    this.pTail = null;
                }
                this.size--;
            } else {
                Node previo = null;
                while (pAux != null && pAuxp.getId() != personaje.getId()) {
                    previo = pAux;
                    pAux = pAux.getpNext();
                    if (pAux != null) {
                        pAuxp = (Personaje) pAux.getData();
                    }
                }
                if (pAux != null) {
                    previo.setpNext(pAux.getpNext());
                    if (pAux == this.pTail) {
                        this.pTail = previo;
                    }
                    size--;
                }
            }
        } else {
            System.out.println("La cola está vacia");
        }
    }

    public Node<T> getpHead() {
        return pHead;
    }

    public void setpHead(Node<T> pHead) {
        this.pHead = pHead;
    }

    public Node<T> getpTail() {
        return pTail;
    }

    public void setpTail(Node<T> pTail) {
        this.pTail = pTail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}