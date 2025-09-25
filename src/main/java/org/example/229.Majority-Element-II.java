package org.example;

import java.util.ArrayList;
import java.util.List;

class S1 {
    public List<Integer> majorityElement(int[] nums) {

        int i[];

        ArrayList<Integer> p= new ArrayList<>();
        ArrayList<Integer> p1= new ArrayList<>();


        if(nums.length==2){

            i=new int[2];
            // i[0]=nums[0];
            // i[1]=nums[1];

            if(nums[0]!=nums[1]){
                p.add(nums[0]);
                p.add(nums[1]);
            }
            else{
                p.add(nums[0]);
            }


        }
        else if(nums.length==1){

            // i=new int[1];
            //     i[0]=nums[0];
            p.add(nums[0]);

        }

        else{

            for(int r: nums){
                if(!p1.contains(r)){
                    p1.add(r);
                }
            }

            int o=nums.length/3;
            int y=0;

            for(int k: p1){

                for(int h: nums){
                    if(h==k){
                        y++;
                        if(y>o && !p.contains(k)){
                            p.add(k);
                            y=0;
                            continue;
                        }

                        continue;
                    }
                }
                y=0;
            }
        }
        return p;
    }
}