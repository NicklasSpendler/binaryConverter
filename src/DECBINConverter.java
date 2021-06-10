import java.util.Scanner;

public class DECBINConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to convert to Binary or Decimal. B / D");
        String choice = input.next();
        if(choice.equalsIgnoreCase("b")){
            System.out.println("the first digit as binary is equals Positive or Minus.");
            String number = input.next();
            convertBinary(number);
        }else if (choice.equalsIgnoreCase("d")){
            System.out.println("Please give a decimal number.");
            int number = input.nextInt();
            convertDecimal(number);
        }
    }

    public static void convertBinary(String binaryNumber){
        System.out.println(binaryNumber);
        int decnum = 0;

        int index = binaryNumber.length() - 1;

        int num = 0;
        if(Character.getNumericValue(binaryNumber.charAt(0)) == 0){
            num = 1;
        }else{
            num = -1;
        }


        // plus værdi
        if(Character.getNumericValue(binaryNumber.charAt(0)) == 0){
            while(index != 0){
                if(Character.getNumericValue(binaryNumber.charAt(index)) == 1){
                    decnum = decnum + num;
                }
                num = num * 2;
                /*
                if(index == 7 && Character.getNumericValue(binaryNumber.charAt(index)) == 1){
                    decnum = decnum + 1;
                }
                if(index == 6 && Character.getNumericValue(binaryNumber.charAt(index)) == 1){
                    decnum = decnum + 2;
                }
                if(index == 5 && Character.getNumericValue(binaryNumber.charAt(index)) == 1){
                    decnum = decnum + 4;
                }
                if(index == 4 && Character.getNumericValue(binaryNumber.charAt(index)) == 1){
                    decnum = decnum + 8;
                }
                if(index == 3 && Character.getNumericValue(binaryNumber.charAt(index)) == 1){
                    decnum = decnum + 16;
                }
                if(index == 2 && Character.getNumericValue(binaryNumber.charAt(index)) == 1){
                    decnum = decnum + 32;
                }
                if(index == 1 && Character.getNumericValue(binaryNumber.charAt(index)) == 1){
                    decnum = decnum + 64;
                }
                 */
                index--;
            }
        }else{
            while(index != 0){
                // Ones compelement

                if(Character.getNumericValue(binaryNumber.charAt(index)) == 0){
                    decnum = decnum - num;
                }
                num = num * 2;

/*
                if(index == 7 && Character.getNumericValue(binaryNumber.charAt(index)) == 0){
                    decnum = decnum - 1;
                }
                if(index == 6 && Character.getNumericValue(binaryNumber.charAt(index)) == 0){
                    decnum = decnum - 2;
                }
                if(index == 5 && Character.getNumericValue(binaryNumber.charAt(index)) == 0){
                    decnum = decnum - 4;
                }
                if(index == 4 && Character.getNumericValue(binaryNumber.charAt(index)) == 0){
                    decnum = decnum - 8;
                }
                if(index == 3 && Character.getNumericValue(binaryNumber.charAt(index)) == 0){
                    decnum = decnum - 16;
                }
                if(index == 2 && Character.getNumericValue(binaryNumber.charAt(index)) == 0){
                    decnum = decnum - 32;
                }
                if(index == 1 && Character.getNumericValue(binaryNumber.charAt(index)) == 0){
                    decnum = decnum - 64;
                }

 */

                index--;
            }
        }

        if(Character.getNumericValue(binaryNumber.charAt(0)) == 1) {
            System.out.println(Math.negateExact(decnum));
        }else{
            System.out.println(decnum);
        }

    }

    public static void convertDecimal(int number){
        int i = 0;
        int binary[] = new int[100];

        // https://youtu.be/rsxT4FfRBaM?t=551
        // Hvis der er en remainder så vil det blive 1 i binary.
        // Prøv med lommeregner.
        while(number != 0){
            binary[i]=number%2;
            //System.out.println(number%2);
            number = number / 2;
            i++;
        }

        System.out.println("Binary value is : ");
        for(int j = i-1; j>=0; j--){
            System.out.print(""+binary[j]);
        }
    }
}
