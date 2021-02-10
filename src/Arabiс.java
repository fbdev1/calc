public class Arabiс extends Chisla {



    public Arabiс(int firstElement, int secondElement, char operation) {
      firstOp = firstElement;
      secondOp = secondElement;
      dejstvie = operation;
      if (firstOp < 0 || firstOp > 10) throw new NumberFormatException("Значение должно быть в диапазоне от \"0\" до \"10\"");
      if (secondOp < 0 || secondOp > 10) throw new NumberFormatException("Значение должно быть в диапазоне от \"0\" до \"10\"");
    }



}
