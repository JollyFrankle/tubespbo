package exception;

public class InputKosongException extends Exception{

    @Override
    public String toString(){
        return "Masih ada input yang kosong!";
    }
}
