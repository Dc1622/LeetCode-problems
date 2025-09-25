package org.example;

    class Solution {
        public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

            int area=0;

            int v=ax2-ax1;
            int b=ay2-ay1;
            int v1=bx2-bx1;
            int b1=by2-by1;
            int v2=ay2-ay1;
            int b2=ax2-ax1;

            int area1=v1*b1; //  B
            int area2=v2*b2; //  A
            int areat=0;


            // else if(ay2>by2 && by1>ay1){

            //     v=by2-by1;
            // }


            if(by2>ay2 && by1>ay1){

                v=ay2-by1;
            }

            else if(ay2>by2 && ay1>by1){

                v=by2-ay1;
            }
//---------------------------------------


            else if(by2>ay2 && by1<ay1){

                v=ay2-ay1;
            }

            else if(by2==ay2 && by1<ay1){

                v=ay2-ay1;
            }

            else if(by2>ay2 && by1==ay1){

                v=ay2-ay1;
            }

            else if(by2==ay2 && by1==ay1){
                v=ay2-ay1;
            }


//=========================================


            else if(ay2>by2 && ay1<by1){

                v=by2-by1;
            }

            else if(ay2==by2 && ay1<by1){

                v=by2-by1;
            }

            else if(ay2>by2 && ay1==by1){

                v=by2-by1;
            }





            if(ax2>bx2 && ax1>bx1){

                b=bx2-ax1;
            }

            else if(bx2>ax2 && bx1>ax1){

                b=ax2-bx1;
            }




            else if(bx2>ax2 && bx1<ax1){

                b=ax2-ax1;
            }

            else if(bx2==ax2 && bx1<ax1){

                b=ax2-ax1;
            }

            else if(bx2>ax2 && bx1==ax1){

                b=ax2-ax1;
            }

            else if(bx2==ax2 && bx1==ax1){

                b=ax2-ax1;
            }



            else if(ax2>bx2 && ax1<bx1){

                b=bx2-bx1;
            }

            else if(ax2==bx2 && ax1<bx1){

                b=bx2-bx1;
            }

            else if(ax2>bx2 && ax1==bx1){

                b=bx2-bx1;
            }




            area=v*b;


            if(by1>=ay2){

                area=0;
            }

            else if(ay1>=by2){

                area=0;
            }

            else if(bx1>=ax2){
                area=0;
            }

            else if(ax1>=bx2){
                area=0;
            }

            areat=area1+area2-area;


            if(ax2>bx2 && ax1<bx1 && ay2>by2 && ay1<by1){

                areat=area2;
            }

            else if(bx2>ax2 && bx1<ax1 && by2>ay2 && by1<ay1){

                areat=area1;
            }

            else if(ax1==bx1 && ay1==by1 && ay2==by2 && ax2==bx2){

                areat=area1;
            }
            return areat;
        }
    }
