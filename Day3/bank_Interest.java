import java.util.*;
class Bank{
    float getRateOfString(){
        return 100.0f;
    }
}
class SBI extends Bank{
     float getRateOfString(){
        return 8.4f;
    }
}

class ICICI extends Bank{
     float getRateOfString(){
        return 7.3f;
    }
}
class AXIS extends Bank{
     float getRateOfString(){
        return 9.7f;
    }
}

class bank_Interest {
    public static void main(String agrs[])
    {
        Bank ob1 = new Bank();
        System.out.println(ob1.getRateOfString());

        AXIS ob2 = new AXIS();
        System.out.println(ob2.getRateOfString());

        SBI ob3 = new SBI();
        System.out.println(ob3.getRateOfString());

        ICICI ob4 = new ICICI();
        System.out.println(ob4.getRateOfString());
    }
}
