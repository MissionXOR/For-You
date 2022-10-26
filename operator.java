import java.util.*;
public class operator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean isOperator=false;
        for(int i=0;i<str.length();i++){
            //for operator
            switch(str.charAt(i)){
                case '-' :case'+':case '*':case'/':
                case'%':case'!':case '=':case'&':case'|':case'^':case'<':case'>':
                    isOperator=true;
                    if(isOperator==true){
                System.out.println(str.charAt(i)+ "" +" is a operator");  
            }else{
                        System.out.println("there is no operator");
                    }
            }
        }            
    }
}

    
