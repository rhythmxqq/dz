package com.company;

import java.util.Scanner;

//z=x+y/у+1
class Dead_inside{
    int x;
    int y;
    Dead_inside(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void primer(){
        if((y+1)!=0){
            double z = (double) (x+y)/(y+1);
            System.out.println("ответ примера (x+y)/(y+1) = " + z);
        }
        else{
            System.out.println("На ноль делить нельзя!");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число Х ");
        int x = in.nextInt();
        System.out.println("Введите число У ");
        int y = in.nextInt();
        Dead_inside prim = new Dead_inside(x,y);
        prim.primer();
    }
}
