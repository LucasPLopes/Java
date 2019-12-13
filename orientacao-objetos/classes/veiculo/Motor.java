public enum Motor {

    C10("1.0"), //
    C13("1.3"), //
    C16("1.6"), //
    V8("V8 "), //
    V8T("V8 TURBO"), //
    V12("V12"), //
    V12T("v12 TURBO"), //
    VVTI("VVTI ");//

    private String motor;

    private Motor(String motor) {
        this.motor = motor;
    }
    public String getMotor(){
        return this.motor;
    }
}