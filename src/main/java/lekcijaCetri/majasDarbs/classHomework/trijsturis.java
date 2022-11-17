package lekcijaCetri.majasDarbs.classHomework;

public class trijsturis {
    double malaA; //ar int nesarēķināja precīzi tāpēc mainīju uz double
    double malaB;
    double malaC;
    double laukums;

    boolean vaiirvienadmalu;
    boolean vaiirvienadsanu;


    // no arg konstruktors
    public trijsturis() {
        System.out.println("Veidojam Trijstūri...");
        malaA = 5;
        malaB = 6;
        malaC = 7;
    }

    public double pusperimetrs() {
        return (malaA + malaB + malaC) / 2;
    }

    public double trijsturalaukums() {
        return laukums = Math.sqrt((pusperimetrs() * (pusperimetrs() - malaA) * (pusperimetrs() - malaB) * (pusperimetrs() - malaC)));
    }

    public void printetlaukumu() {
        System.out.println(trijsturalaukums());
    }

    public boolean Vaiirvienadmalu() {
        if (malaA == malaB && malaA == malaC && malaB == malaC) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isVaiirvienadsanu() {
        if (malaA == malaB || malaA == malaC || malaB == malaC) {
            return true;
        } else {
            return false;
        }
    }
}

//    trijsturis3(double malaA, double malaB, double malaC) {
//        this.malaA = malaA;
//        this.malaB = malaB;
//        this.malaC = malaC;
//    }







