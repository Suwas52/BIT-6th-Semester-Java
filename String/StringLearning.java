
public class StringLearning {
    public static void main(String[] args){
        String str1 = "Hello" ;
        //yesle chaii string pool ma rakhdinxa jaha chaii same value vayo vani point garxa

        String str2 = new String("Hello" );
        // new string le chai string pool bahira rakhxa jasle chaii same value vayani new string banauxa



        // System.out.println(str1 ==str2);
        // this can be only == to str address
        System.out.println(str1.equals(str2));


        StringBuffer name  = new StringBuffer("Subash");
        name.append(" ");
        name.append("Danuwar ");

        System.out.println(name);
    }
}