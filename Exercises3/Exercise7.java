package com.revature.Week2.Day8.Exercises3;

class UniqueException extends Exception{
    UniqueException(String message){
        super(message);
    }
}

class Unique{
    private String OriginalName;
    static boolean oneOfAKind = false;

    Unique(String OriginalName) throws UniqueException {
        if(!oneOfAKind) {
            this.OriginalName = OriginalName;
            oneOfAKind = true;
        }
        else
            throw new UniqueException("This Object is Unique and there Cannot be more than 1") ;

    }

    public String getOriginalName() {
        return OriginalName;
    }
}

public class Exercise7 {
    public static void main(String[] args) throws UniqueException {
        Unique antique = new Unique("Mona Lisa");
        antique.getOriginalName();
        Unique antique2 = new Unique("Mona Lisa Copy");
        antique2.getOriginalName();

    }


}
