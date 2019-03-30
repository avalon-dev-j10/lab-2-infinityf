package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        
//рандомный массив из фигур 
     /* Так я сделала сначала, это непроизвольные фигуры с заданными параметрами, но потом решила делать через рандом, см ниже
        Shape[] shapes = null;
        shapes = new Shape[10];
        shapes[0] = new Circle(5, 9, 12); //координаты центра и радиус
        shapes[1] = new Triangle(10, 6, 5, 6, 7, 355); //x,y,st1,st2,st3,rotation
        shapes[2] = new Rectangle(0,0,12,5,60);
        shapes[3] = new Triangle(1,1,12,3,7,20);
        shapes[4] = new Circle(6,12, 7);
        shapes[5] = new Triangle(4, 5, 15, 28, 6, 55);
        shapes[6] = new Circle(3,5,76);
        shapes[7] = new Rectangle(4,3,8,12, 1);
        shapes[8] = new Triangle(5,6,4,9,15,45);
        shapes[9] = new Circle(8,5, 13);
    }
*/
    Shape[] shapes = new Shape[10];//объявляем массив из десяти фигур
    float[] areas = new float[10];//а потом составим массив из их площадей
        
    Random rand = new Random();//включаем рандомизатор
    
    for (int i = 0; i < 10; i++) {

        float a = rand.nextFloat()*100; //случайное дробное число умножается, чтобы стать больше и дать нам a
        float b = rand.nextFloat()*a; //любое число от нуля до a
        float c = rand.nextFloat()*b; //число меньшее предыдущего
        
        switch (rand.nextInt(2)){ //получается три варианта событий
        case 0: 
            shapes[i] = new Circle(0, 0, a); //либо это круг, для удобства задаю координаты 0,0, и далее так же
            System.out.println("Circle "  + shapes[i].getArea()); //напишет тип фигуры и площадь
            break;            
        case 1:
            shapes[i] = new Rectangle(b, c, 0, 0, 35); //два измерения, центр в 0.0 и угол поворота 35 градусов
            System.out.println("Rectangle " + shapes[i].getArea());
            break;
        case 2:
            shapes[i] = new Triangle(a, b, c, 0, 0, 365);//повернется на 5 градусов
            System.out.println("Triangle "  + shapes[i].getArea());
            break;    
        }
        areas[i] = shapes[i].getArea();
    }
   float max = 0; 
   for (int i = 0; i < 10; i++) //переберет все площади и выберет из них максимальную
       if (areas[i] > max){
          max = areas[i];
       }
   System.out.println("Максимальная площадь "+ max); //ура, оно работает
        
     }
}