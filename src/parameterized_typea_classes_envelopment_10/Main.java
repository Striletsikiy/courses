package parameterized_typea_classes_envelopment_10;

public class Main {
    public static void main(String[] args){

        GenericModule.Box<String> b = new GenericModule.Box<>();
        String text = "$Biataru$";
        b.setValue(text);
        String A = b.getValue();
        System.out.println(A);

        GenericModule.Box<Integer> b1 = new GenericModule.Box<>();
        b1.setValue(900_000_000);
        int i = b1.getValue();
        System.out.println(i + "\n \n");


        GenericModule.Box.doSomething(3.14);
        GenericModule.Box.doSomething(" S ");
        GenericModule.Box.doSomething(900_000_000);



    }
}
