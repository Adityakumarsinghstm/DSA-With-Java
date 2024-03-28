package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point2 {
    int x, y;
    Point2(int x, int y)
    {
        this.x = x;
        this.y= y;
    }

}
class MyCmp implements Comparator<Point2>
{

    @Override
    public int compare(Point2 p1, Point2 p2) {
        return p1.x - p2.x;
    }
}
public class GFGCompare {
    public static void main(String[] args) {
        List<Point2> list = new ArrayList<Point2>();
        list.add(new Point2(12, 23));
        list.add(new Point2(99, 67));
        list.add(new Point2(87, 34));
        list.add(new Point2(34, 98));

        Collections.sort(list,new MyCmp());


        for(Point2 p2 :list)
        {
            System.out.println(p2.x + "  "+p2.y);
        }
    }
}
