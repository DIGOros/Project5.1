public class Main {
    public static void main(String[] args) {

        Greeting("today is quiet cold");
        System.out.println(Bye("Mykhailo", 12));
    }


    static void Greeting(String day) {

        System.out.println(" " + day);
    }

    static String Bye(String name, int time){
        return "oh it is "+ time + " O`clock"+" okay than i gotta go, my name is : " + name;

    }

}