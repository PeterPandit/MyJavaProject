import java.util.Scanner;

class Gian{

    Scanner scan=new Scanner(System.in);

    void GiantFinder(){

        System.out.println("Enter a:");
        int a=scan.nextInt();

        if(a>100){
            System.out.println("Collosal Titan:"+a);
        }
        else if (a<100) {

            System.out.println("Attack Titan|Armored Titan|Beast Titan");
        }
    }
}


public class Giant {
    public static void main(String [] args){

        Gian gan=new Gian();

        gan.GiantFinder();
    }
}
