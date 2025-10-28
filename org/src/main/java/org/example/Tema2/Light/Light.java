package org.example.Tema2.Light;

public class Light {
    private boolean isOn;
    private int intensity;

    public Light() {
        this.isOn = isOn;
        this.intensity = intensity;
        System.out.println("Light is created. Inilial state: off");
    }

    public void turnOn() {
        if (this.isOn) {
            this.isOn = true;
            if (this.intensity == 0) {
                this.intensity = 10;
            }
            System.out.println("The light is on. Intensity: " + this.intensity);
        } else {
            System.out.println("The light is allready on");
        }
    }

    public void turnOff() {
        if(this.isOn) {
            this.isOn = false;
            this.intensity = 0;
            System.out.println("The light was turned off");
        } else {
            System.out.println("The light is allready off");
        }
    }

    public void dim() {
        if (this.isOn){
            System.out.println("The intensity can't reduce, the light is off");
            return;
        }
    }

    public void brighten() {
        if(this.isOn) {
            System.out.println("The light was turned off, will turn on automatically");
            turnOn();
            return;
        }
    }

    public void displayStatus() {
        String status = this.isOn;
        System.out.println("Current state: " + status + " , Intensity: " + this.intensity);
    }
}
