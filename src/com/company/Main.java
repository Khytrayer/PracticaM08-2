package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        double[] numeros = {1,2,3,4,5,6,7,8}; 

         media(numeros);


        }

        public static double media(double[] nums) {
            double sol=0;
            for (int i=0; i<nums.length;i++) {
                sol+=nums[i];
            }
            sol=sol/nums.length;
            System.out.println("La mitjana del numeros seleccionats és "+sol);
            return sol;
        }
    }

