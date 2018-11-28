package receiver;

public class Light extends Receiver {

    private boolean on;

    private double brightness;

    private double diff;

    public Light(boolean on, double brightness, double diff) {
        this.on = on;
        this.brightness = brightness;
        this.diff = diff;
    }

    public double getDiff() {
        return diff;
    }

    public void setDiff(double diff) {
        this.diff = diff;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void brightenUp() {
        if (this.brightness < 1)
            this.brightness += this.diff;
    }

    public void brightenDown() {
        if (this.brightness > 0)
            this.brightness -= this.diff;
    }

    public double getBrightness() {
        return brightness;
    }
}
