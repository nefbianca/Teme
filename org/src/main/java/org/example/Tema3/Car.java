package org.example.Tema3;

public class Car {
    private boolean isStarted;
    private int speed;
    private String direction; // Direcția actuală

    public Car() {
        this.isStarted = false;
        this.speed = 0;
        this.direction = "Straight";
    }

    public void start() {
        if (!isStarted) {
            this.isStarted = true;
            System.out.println("Engine *started*. Ready to go!");
        } else {
            System.out.println("The car is already running.");
        }
    }

    public void stop() {
        if (isStarted) {
            this.speed = 0;
            this.isStarted = false;
            this.direction = "Straight";
            System.out.println("Car *stopped* and engine turned off.");
        } else {
            System.out.println("The car is already stopped.");
        }
    }


    public void accelerate(int kmh) {
        if (isStarted) {
            if (kmh > 0) {
                this.speed += kmh;

                if (this.speed > 200) {
                    this.speed = 200;
                    System.out.println("Accelerating! Current speed: *" + this.speed + " km/h* (Max speed reached).");
                } else {
                    System.out.println("Accelerating! Current speed: *" + this.speed + " km/h*.");
                }
            }
        } else {
            System.out.println("Cannot accelerate. Please *start* the car first!");
        }
    }

    public void turnLeft() {
        if (isStarted && speed > 0) {
            this.direction = "Left";
            System.out.println("Turning left. Current direction: *" + this.direction + "*.");
        } else if (isStarted && speed == 0) {
            System.out.println("Turning left while stopped.");
            this.direction = "Left";
        } else {
            System.out.println("Cannot turn. Please *start* the car first!");
        }
    }

    public void turnRight() {
        if (isStarted && speed > 0) {
            this.direction = "Right";
            System.out.println("Turning right. Current direction: *" + this.direction + "*.");
        } else if (isStarted && speed == 0) {
            System.out.println("Turning right while stopped.");
            this.direction = "Right";
        } else {
            System.out.println("Cannot turn. Please *start* the car first!");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public String getDirection() {
        return direction;
    }
}
