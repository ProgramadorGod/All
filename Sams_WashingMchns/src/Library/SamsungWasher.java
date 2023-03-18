package Sams_WashingMchns.src.Library;


public class SamsungWasher {
    private int kgs;
    private int fulfill;
    private int ClotheKind;
    private int WashedComplete;
    private int DryComplete;

    public SamsungWasher(int kgs, int ClotheKind){
        this.setKgs(kgs);
        this.ClotheKind = ClotheKind;
    }
    private void fully(){
        if(getKgs() <= 10){
            setFulfill(1);
            System.out.println("Getting fully...");
            System.out.println("Successfully filled ! ");
        }else{
            System.out.println("The mount of clothes is so heavy, reduce the charge");
        }
    }
    private void Washed(){
        fully();
        if(getFulfill() == 1) {
            if (ClotheKind == 0) {
            } else if (ClotheKind == 1) {
                System.out.println("White Clothes / Soft Wash");
                System.out.println("Washing.... ");
            } else if (ClotheKind == 2) {
                System.out.println("Color Clothes / Intense Wash");
                System.out.println("Washing... ");
            }else{
                System.out.println("Your clothes are not able");
                System.out.println("It's gonna be washed like Color Clothes");
                System.out.println("Washing....");
            }
            setWashedComplete(1);
        }
    }
    private void Dry(){
        Washed();
        if(getWashedComplete() == 1){
            System.out.println("Getting Dry..");
            setDryComplete(1);
        }
    }
    public void CicleDone(){
        Dry();
        if (getDryComplete() == 1){
            System.out.println("Your clothes are ready! ");
        }

    }

    public int getClotheKind(){

        return ClotheKind;
    }

    public void setClotheKind(int ClotheKind){
        this.ClotheKind = ClotheKind;
    }


    public int getKgs() {
        return kgs;
    }

    public void setKgs(int kgs) {
        this.kgs = kgs;
    }

    public int getFulfill() {
        return fulfill;
    }

    public void setFulfill(int fulfill) {
        this.fulfill = fulfill;
    }

    public int getWashedComplete() {
        return WashedComplete;
    }

    public void setWashedComplete(int washedComplete) {
        WashedComplete = washedComplete;
    }

    public int getDryComplete() {
        return DryComplete;
    }

    public void setDryComplete(int dryComplete) {
        DryComplete = dryComplete;
    }
}