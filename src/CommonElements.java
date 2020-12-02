import java.util.ArrayList;

import java.util.Scanner;

public class CommonElements {


    public static void main(String[] args) {

        Scanner scanner      = new Scanner(System.in);

        String[] firstArray  = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
        ArrayList<String> finalList = new ArrayList<>();

        for(int i = 0; i < firstArray.length; i++) {

            for(String g : secondArray) {

                if(firstArray[i].equals(g)) {

                    finalList.add(firstArray[i]);
                }
            }
        }

        for(String g : finalList) {

            System.out.print(g + " ");
        }
    }
}