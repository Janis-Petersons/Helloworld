package lekcijaCetri.majasDarbs.classHomework;

public class trijsturis {
    double malaA; //ar int nesarēķināja precīzi tāpēc mainīju uz double
    double malaB;
    double malaC;
    double laukums;
    boolean vaiirvienadmalu;
    boolean vaiirvienadsanu;


// no arg konstruktors
    public trijsturis(){
        System.out.println("Veidojam Trijstūri...");
        malaA=3;
        malaB=5;
        malaC=5;
    }
    public double pusperimetrs(){
        return (malaA+malaB+malaC)/2;
    }
    public double trijsturalaukums(){
        return laukums=Math.sqrt((pusperimetrs()*(pusperimetrs()-malaA)*(pusperimetrs()-malaB)*(pusperimetrs()-malaC)));
    }
    public void printetlaukumu(){
        System.out.println(trijsturalaukums());
    }


//
//    //parametrizēts kosntrktors
//    trijsturis (double malaA, double malaB, double MalaC){
//        this.malaA =malaA;
//        this.malaB=malaB;
//        this.malaC=malaC;
//    }

    }



