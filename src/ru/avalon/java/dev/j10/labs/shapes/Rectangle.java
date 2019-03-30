package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    private float x; //координаты центра
    private float y;
    private float storona1; //длины противополжных сторон у прямоуольника равны
    private float storona2; // так что мы для удобства берем всего две переменных
    private int rotation;
    
    public Rectangle(float storona1, float storona2, float x, float y, int rotation) {//конструктор класса rectangle
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.x = x;
        this.y = y;
        this.rotation = rotation;
     }
    
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){ 
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
    
    public int getRotation(){// получаем угол поворота
        return rotation;    
    }
    public void setRotation(int rotation) { //задаем угол поворота
        this.rotation = rotation;
    }
     
   
    
     public float getArea(){ //вычисляем площадь фигуры
        return storona1 * storona2;
    }
    
    public float getPerimeter(){  //вычисляем периметр фигуры
        return (storona1 + storona2)*2;
    }
    
     
    /*  
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
