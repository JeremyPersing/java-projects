package freezing.and.boiling.points;


public class Temperature {
    private int temperature;
    
    
    public Temperature(int temp) {
        temperature = temp;
    }
    
    public boolean isEthylFreezing() {
        boolean freezing = false;
        if (temperature <= -173) {
            freezing = true;
        }
        return freezing;
    }
    
    public boolean isEthylBoiling() {
        boolean boiling = false;
        if (temperature >= 172) {
            boiling = true;
        }
        return boiling;
    }
    
    public boolean isOxygenFreezing() {
        boolean freezing = false;
        if (temperature <= -362) {
            freezing = true;
        }
        return freezing;
    }
    
    public boolean isOxygenBoiling() {
        boolean boiling = false;
        if (temperature >= -306) {
            boiling = true;
        }
        return boiling;
    }
    
    public boolean isWaterFreezing() {
        boolean freezing = false;
        if (temperature <= 32) {
            freezing = true;
        }
        return freezing;
    }
    
    public boolean isWaterBoiling() {
        boolean boiling = false;
        if (temperature >= 212) {
            boiling = true;
        }
        return boiling;
    }
}
