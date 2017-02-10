package com.company;

public class DSUv2 {

    private int[] points;

    public DSUv2(int size)
    {
        points = new int[size];

        for (int i = 0; i < size; i++)
        {
            points[i] = i;
        }
    }

    public void union(int p, int q)
    {
        if (points[p] != points[q]) {
            for (int i = 0; i < points.length; i++) {
                if (points[i] == points[q]) {
                    points[i] = points[p];
                }
            }
        }
    }

    public boolean find(int p, int q)
    {
        return points[p] == points[q];
    }
}
