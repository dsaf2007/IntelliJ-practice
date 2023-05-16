package week4;

public class Address {
    String fullAddr;
    String sido;
    String sigungu;

    public String getFullAddr() {
        return fullAddr;
    }

    public void setFullAddr(String fullAddr) {
        this.fullAddr = fullAddr;
    }

    public String getSido() {
        return sido;
    }

    public void setSido(String sido) {
        this.sido = sido;
    }

    public String getSigungu() {
        return sigungu;
    }

    public void setSigungu(String sigungu) {
        this.sigungu = sigungu;
    }

    Address(String fullAddr, String sido, String sigungu){
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", fullAddr, sido, sigungu);
    }
}
