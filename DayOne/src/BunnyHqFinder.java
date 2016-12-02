/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jamie
 */
public class BunnyHqFinder {

    public BunnyHqFinder(String direction) {
        this.direction = direction;
        this.x = 0;
        this.y = 0;
    }
    
    String direction;
    int x = 0;
    int y = 0;

    public void turnLeft() {
        switch (this.direction) {
            case "north":
                this.direction = "west";
                break;
            case "east":
                this.direction = "north";
                break;
            case "south":
                this.direction = "east";
                break;
            case "west":
                this.direction = "south";
                break;
        }
    }
    
    public void turnRight() {
        switch (this.direction) {
            case "north":
                this.direction = "east";
                break;
            case "east":
                this.direction = "south";
                break;
            case "south":
                this.direction = "west";
                break;
            case "west":
                this.direction = "north";
                break;
        }
    }
    
    public void move(int imput){
        switch (this.direction){
            case "north":
                this.y += imput;
                break;
            case "east":
                this.x += imput;
                break;
            case "south":
                this.y += imput;
                break;
            case "west":
                this.x += imput;
                break;
        }
    }
    
    public void distance(){
        System.out.println(x+y);
    }
}
