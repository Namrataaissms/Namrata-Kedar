package Overriding_programs;

class Bank{
    int RateOfInterest(){
        return 0;
    }

}

class SBI extends Bank{
    int RateOfInterest(){
        return 6;
    }

}

class ICICI extends Bank{
    int RateOfInterest(){
        return 5;
    }

}
class AXIS extends Bank{
    int RateOfInterest(){
        return 10;
    }

}
class KOTAK extends Bank{
    int RateOfInterest(){
        return 4;
    }

}
//Test class to create objects and call the methods
class Test2{
    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        KOTAK k=new KOTAK();
        System.out.println("SBI Rate of Interest: "+s.RateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.RateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.RateOfInterest());
        System.out.println("KOTAK Rate of Interest: "+k.RateOfInterest());

    }
}
