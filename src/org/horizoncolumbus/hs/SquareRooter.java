package org.horizoncolumbus.hs;

import java.util.Arrays;
import java.util.Scanner;

public class SquareRooter {

    public static void main(String[] args) {
        int num[] = new int[5];
        int newNum[] = new int[5];
        Scanner input = new Scanner(System.in);
        int x = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("Input number " + (i +1) + ".");
            num[i] = input.nextInt();
            newNum[i] = num[i];
        }
        for(int rootedNum : num ){
            rootedNum = (int) Math.sqrt(rootedNum);
            newNum[x] = rootedNum;
            x++;
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(newNum));
    }
}
