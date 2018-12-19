package prim05;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Prim05 {

    private static int w = 5;

    void algPrim(int graph[][]) {
        int rodzic[] = new int[w];
        int minklucz[] = new int[w];
        Boolean zbiorwierzch[] = new Boolean[w];
        for (int i = 0; i < w; i++) {
            minklucz[i] = Integer.MAX_VALUE;
            zbiorwierzch[i] = false;
        }
        minklucz[0] = 0;
        rodzic[0] = -1;

    }

    public static void main(String[] args) {
        Prim05 p = new Prim05();
        int graf[][] = new int[][]{{3, 4, 1, 0, 3},
                                    {1, 0, 3, 0, 7},
                                    {0, 9, 4, 5, 0},
                                    {6, 1, 0, 4, 3},
                                    {3, 2, 4, 6, 0}};
        p.algPrim(graf);
    }
}
