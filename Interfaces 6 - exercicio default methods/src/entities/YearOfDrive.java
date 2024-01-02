package entities;

public interface YearOfDrive {

    default boolean yearOfDrive(int Yo){
        if(Yo >= 18){
            return true;
        }else{
            return false;
        }        
    }
}
