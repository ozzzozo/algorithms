package com.mycompany.algorithms;

public class luhn {
    
    private static String validateCard(String number) {
        String product = "";
        String weight = "";
        
        while((Math.floor((int)(number.length())) > weight.length())) {
            weight += "21";
        }
        
        for (int i = 0; i < number.length(); i++) {
            int cardNum = Character.getNumericValue(number.charAt(i));
            int weightNum = Character.getNumericValue(weight.charAt(i));
            
            int productNum = cardNum * weightNum;
            
            if(("" + productNum).length() > 1) {
                productNum = (Character.getNumericValue(("" + productNum).charAt(0)) + Character.getNumericValue(("" + productNum).charAt(1)));
            }
            
            product += productNum;
        }
        
        return product;
    }
    
    public static void main(String[] args) {
        System.out.println(validateCard("3379513561108795"));
    }
}
