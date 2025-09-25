package org.example;

        class Solution {
            public int findLucky(int[] arr) {

                int h = 0, lar = 0;

                for (int k : arr) {
                    for (int j : arr) {
                        if (k == j) {

                            h++;
                        }
                    }
                    if (h == k && h > lar) {
                        lar = h;
                        h = 0;
                        continue;
                    }
                    h = 0;
                }

                if (lar == 0) {
                    lar = -1;
                }

                return lar;
            }
        }
