package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    private float x;
    private float y; //координаты центра
    private float storona1; // задаем длины сторон
    private float storona2; 
    private float storona3; 
    private float visota; //для вычисления площади
    private int rotation; //треугольник вращается

    
    public Triangle(float storona1, float storona2, float storona3, float x, float y, int rotation) {//конструктор класса triangle
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
}

    public float getX(){ //задаем и получаем абсциссу
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
     public float getY(){ //задаем и получаем ординату
        return y;
    }
    public void setY(float y){ 
        this.y = y;
    }
    public float getStorona1(){ //получаем длины всех сторон треугольника
        return storona1;
    }
    public float getStorona2(){
        return storona2;
    }
    public float getStorona3(){
        return storona3;
    }
    public float getVisota(){ //получаем высоту треуольника
        return visota;
    }
    
     public void setRotation(int rotation) { //задаем угол поворота
        this.rotation = rotation;
    }
     
    public int getRotation(){// получаем угол поворота
        return rotation;    
    }
     public float getArea(){ //вычисляем площадь фигуры
        return storona1 * 1/ 2 * visota;
    }
    
    public float getPerimeter(){  //вычисляем периметр фигуры
        return storona1 + storona2 + storona3;
    }
    



    
    
    
    
    
   
   
    
    

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
