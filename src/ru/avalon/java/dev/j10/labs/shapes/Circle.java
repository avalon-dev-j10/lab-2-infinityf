package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Shape{ //Ellipse{не требуется реализация методов интерфейса
    private float x;
    private float y;
    private float radius;
    
    public Circle(float x, float y, float radius) {//конструктор класса circle
        this.x = x;
        this.y = y;
        this.radius = radius;
}
   
    public float getX(){ //получаем абсциссу
        return x;
    }
    
    public void setX(int x){ //задаем абсциссу
        this.x = x;
        
    }
    
    public float getY(){ //получаем ординату
        return y;
    }
    
    
    public void setY(int y){ //задаем ординату
        this.y = y;
        
    }
    
    public float getRadius(){ // получаем радиус
        return radius;
    }
    
     public float getArea(){//вычисляем площадь круга
        float area = (int)Math.pow(radius,2)*(int)Math.PI; //здесь приводим более точный тип double к нужному нам float
        return area;
    }
     
     /*убираю код - вроде бы, по заданию вычисление длины окружности не требуется, нужны только их площади. 
     следовательно, не требуется и наследование метода getLength от Ellipse 
     public float getLength(){ //вычисляем длину окружности
        float length = radius * 2 * (int)Math.PI;
        return length;
     }*/ 
}
                
                
                
                /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
