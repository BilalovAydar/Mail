public class FirstLesson {

    public static void main(String[] args) {
        int a = 5;  //32 - bit
        byte b = 127;   //8 - bit
        short sh = 1000;   //16 - bit
        long lg = 1000000;   //64 - bit
        double d = 1.12345678912345; //64 - bit
        float f = 1.12345678912345f; //32 - bit //float f = (float)1.12345678912345;
        boolean bool = true;
        char ch = 'c';
        System.out.println("a*(b+(c/d)) = " + Equal(10, 20, 30, 40));
        System.out.println("Cумма входит в диапазон от 10 до 20: " + Check(15,2));
        CheckSign(10);
        Out("Aidar");
        Year(2016);
        }



    public static int Equal(int a, int b, int c, int d){
        if (d!=0){
            return a*(b+(c/d));
        }
        else{
            System.out.println("нельзя делить на ноль!\n");
            return 0;
        }
    }
    public static boolean Check(int a, int b){
        if((a + b) >= 10 && (a + b) <= 20){
            return true;
        }
        else{
            return false;
        }
    }
    public static void CheckSign(int a){
        if (a >= 0){
            System.out.println(a + " Положительное число\n");
        }
        else{
            System.out.println(a + "Отрицательное число\n");
        }
        return;
    }
    public static void Out(String c){
        if (c != "" && c != " "){
            System.out.println("Привет, " + c + "\n");
        }
        return;
    }
    public static void Year(int a){
        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)){
            System.out.println("Високосный год\n");
        }
        else {
            System.out.println("Невисокосный год\n");
        }

    }



}
