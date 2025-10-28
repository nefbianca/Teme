package org.example.Tema2.Light;

public class Light {
    private boolean isOn;
    private int intensity;

    public Light() {
        this.isOn = false; // Becul este stins implicit
        this.intensity = 0; // Intensitatea este 0 implicit
    }


    public void turnOn() {
        if (!isOn) {
            this.isOn = true;
            this.intensity = 50; // Intensitate implicita la aprindere
            System.out.println("Light is ON. Intensity: " + this.intensity);
        } else {
            System.out.println("Light is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            this.isOn = false;
            this.intensity = 0;
            System.out.println("Light is OFF.");
        } else {
            System.out.println("Light is already OFF.");
        }
    }

    public void dim(int amount) {
        if (isOn) {
            if (amount < 0) {
                System.out.println("Cannot dim by a negative amount.");
                return;
            }
            this.intensity -= amount;

            if (this.intensity < 1) {
                this.intensity = 1;
                System.out.println("Light dimmed to minimum intensity: 1.");
            } else {
                System.out.println("Light dimmed. New Intensity: " + this.intensity);
            }
        } else {
            System.out.println("Cannot dim, light is OFF.");
        }
    }

    public void brighten(int amount) {
        if (isOn) {
            if (amount < 0) {
                System.out.println("Cannot brighten by a negative amount.");
                return;
            }
            this.intensity += amount;

            if (this.intensity > 100) {
                this.intensity = 100;
                System.out.println("Light brightened to maximum intensity: 100.");
            } else {
                System.out.println("Light brightened. New Intensity: " + this.intensity);
            }
        } else {
            System.out.println("Cannot brighten, light is OFF. Turn ON first.");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getIntensity() {
        return intensity;
    }
}
