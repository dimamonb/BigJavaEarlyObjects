package ch10.pe_01;


public interface Measurable {
    double getMeasure();
    static Measurable largest(Measurable[] obj){
        Measurable lrgst = obj[0];
        for (Measurable measurable : obj) {
            if (measurable.getMeasure() > lrgst.getMeasure()) lrgst = measurable;
        }
        return lrgst;
    }
    static Measurable smallest(Measurable[]  obj) {
        Measurable smlst = obj[0];
        for (Measurable measurable : obj) {
            if (measurable.getMeasure() < smlst.getMeasure()) smlst = measurable;
        }
        return smlst;
    }
}
