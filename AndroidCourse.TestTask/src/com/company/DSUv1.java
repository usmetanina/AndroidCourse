package com.company;

public class DSUv1 {

    private int[] points;
    private int[] heft;

    public DSUv1(int size)
    {
        points = new int[size];
        heft = new int[size];

        for (int i=0; i < size; i++)
        {
            points[i] = i;
            heft[i] = 0;
        }
    }

    public void union(int p, int q)
    {
        p = find(p);
        q = find(q);

        if (heft[p] < heft[q])
            points[p] = q;
        else
        {
            points[q] = p;
            if (heft[p] == heft[q])
                heft[p]++;
        }
    }

    private int find(int x)
    {
        if (points[x] == x) return x;
        return points[x] = find(points[x]);
    }

    public boolean find (int p, int q)
    {
        return find(p) == find(q);
    }
}
