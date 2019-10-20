package Nikita;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int n = -1;
        final int weight = 30;
        Scanner in = new Scanner(System.in);
        LuggageBranch list=new LuggageBranch();
        list.luggageList.add(new LuggageInfo("Nikita", 1, 11, 1, 15));
        list.luggageList.add(new LuggageInfo("Vitalik", 2, 22, 2, 25));
        list.luggageList.add(new LuggageInfo("Valera", 3, 33, 3, 35));
        list.luggageList.add(new LuggageInfo("Oleg", 4, 44, 4, 45));
        list.luggageList.add(new LuggageInfo("Jora", 5, 55, 5, 55));
        System.out.println(list.luggageList);
        System.out.println("Luggage which weight more than 30kg");
        for (int i = 0; i < list.luggageList.size(); i++) {
            if (list.luggageList.get(i).getLuggageWeight()>weight)
                System.out.println(list.luggageList.get(i));
        }
        System.out.println("Overall luggage weight = " + list.getWeightSum());
        boolean next = true;
        do {
            try {
                System.out.println("Please enter a luggage Check Number: ");
                String number = in.nextLine();
                n = Integer.parseInt(number);
                if (n > 0)
                    next = false;
            } catch (InputMismatchException exc) {
                System.out.println(exc.getLocalizedMessage());
            } catch (Exception exc) {
                System.out.println(exc.getLocalizedMessage());
            }
        } while (next);


        for (int i = 0; i < list.luggageList.size(); i++) {
            if (list.luggageList.get(i).getLuggageCheckNumber() == n) {
                System.out.println("Flight number : " + list.luggageList.get(i).getFlightNumber());
            }
        }
        System.out.println("Please enter a Name: ");
        String deleteName=in.nextLine();
        for (int i = 0; i < list.luggageList.size(); i++) {
            if (list.luggageList.get(i).getName() == deleteName) {
                list.luggageList.remove(i);
            }

        }
        System.out.println("-------------- After removing --------------");
        for (int i = 0; i < list.luggageList.size(); i++) {
                System.out.println(list.luggageList.get(i));}
    }
}