public class Roman extends Chisla{


    Roman (String [] str, char operation){

        //int [] convertedArray= letterToNumber(str);
        //convertedArray[0];
        firstOp = RomanNumeral.romanToArabic(str[0]);
        secondOp = RomanNumeral.romanToArabic(str[1]);
        dejstvie = operation;
        if (firstOp < 0 || firstOp > 10) throw new NumberFormatException("Значение должно быть в диапазоне от \"0\" до \"10\"");
        if (secondOp < 0 || secondOp > 10) throw new NumberFormatException("Значение должно быть в диапазоне от \"0\" до \"10\"");
    }


}
