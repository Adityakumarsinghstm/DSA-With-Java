package Sorting;

import java.util.*;


class Point implements Comparable<Point>
{
    int x,y;
    Point(int x, int y){
        this.y=y;
        this.x=x;
    }
    public int compareTo(Point p)
    {
       return this.x-p.x;
    }
}
public class GFGComparable {
    public static void main(String[] args) {

        List<Point> list = new ArrayList<Point>();
        list.add(new Point(12,13));
        list.add(new Point(45,89));
        list.add(new Point(34,90));
        list.add(new Point(6, 14));
        list.add(new Point(30, 89));

        Collections.sort(list);


        for(Point p:list){
            System.out.println(p.x +"  "+p.y);
        }


    }
}
