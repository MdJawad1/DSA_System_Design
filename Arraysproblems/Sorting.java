package com.ArrayList;


class Main {


    public static void main(String[] args){

//  Sorting an array BRute force approach:
        int arr[]=new int[]{12,23,34,45,10};

        int temp;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        for(int j:arr){
            System.out.println(j);
        }

//

    }
}
