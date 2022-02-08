package shaima;

class UserError extends Exception{
    UserError(){
        
    }
}

public class UserDefinedException {
    public static void main(String args[]){
        try{
            throw new UserError();
        }catch (UserError ue){
            System.out.println("Caught user defined exception from throw:"+ue);
        }

    }
}
