class equalsto
{
    public static void main(String[] args) {
        String s1=new String("Ashish");
        String s2=new String("Ashish");
        System.out.println(s1==s2);//false
        String s3="Ankit";
        String s4="Ankit";
        System.out.println(s3=s4);//true
    }
}