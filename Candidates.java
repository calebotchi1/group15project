
public class Candidates extends Person {
    private int NPP;
    private int NDC;
    private int CPP;

    public Candidates(String name, int age, String placeOfBirth, int idNumber) {
        super(name, age, placeOfBirth, idNumber);
        this.NPP = 0;
        this.NDC = 0;
        this.CPP = 0;

    }
    // building mutators and accessor methods

    public int getNPP() {
        return NPP;
    }

    public void setNPP(int nPP) {
        NPP = nPP;
    }

    public int getNDC() {
        return NDC;
    }

    public void setNDC(int nDC) {
        NDC = nDC;
    }

    public int getCPP() {
        return CPP;
    }

    public void setCPP(int cPP) {
        CPP = cPP;
    }

    // Creating auxiliary method
    public String toString() {
        return "NPP :" + getNPP() + "NDC :" + getNDC() + "CPP :" + getCPP();
    }

}
