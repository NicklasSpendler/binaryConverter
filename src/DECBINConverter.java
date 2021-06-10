import java.util.Scanner;

public class DECBINConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to convert to Binary or Decimal. B / C");
        String choice = input.next();
        if(choice.equalsIgnoreCase("b")){
            System.out.println("Please give 8 digits, the first digit as binary is equals Positive or Minus.");
            String number = input.next();
            convertBinary(number);
        }else if (choice.equalsIgnoreCase("c")){
            System.out.println("Please give a decimal number.");
            int number = input.nextInt();
            convertDecimal(number);
        }
    }

    public static void convertBinary(String binaryNumber){
        System.out.println(binaryNumber);
        if(binaryNumber.length() != 8){
            System.out.println("Not enough bits / too many bits, make sure to use 8 bits");
        }else {
        int decnum = 0;

        int index = binaryNumber.length() -1;

        int num = 1;

        // plus værdi
        if(Character.getNumericValue(binaryNumber.charAt(0)) == 0){
            while(index != 0){
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
                index--;
            }
        }else{
            while(index != 0){
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
                index--;
            }
        }

            System.out.println(decnum);

        }

    }

    public static void convertDecimal(int number){
        System.out.println("test");
        int i = 0;
        int binary[] = new int[100];

        // https://youtu.be/rsxT4FfRBaM?t=551
        while(number != 0){
            binary[i]=number%2;
            number = number / 2;
            i++;
        }

        System.out.println("Binary value is : ");
        for(int j = i-1; j>=0; j--){
            System.out.print(""+binary[j]);
        }
    }
}
