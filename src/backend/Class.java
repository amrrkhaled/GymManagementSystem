/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author amr
 */
public class Class implements Identifiables {

    private String classID, className, trainerID;
    private int duration, availableSeats;

    public Class(String classID, String className, String trainerID, int duration, int availableSeats) {
        this.classID = classID;
        this.className = className;
        this.trainerID = trainerID;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String lineRepresentation() {
        String data = classID + ", " + className + ", " + trainerID + ", " + duration + ", " + availableSeats;
        return data;
    }

    @Override
    public String getSearchKey() {
        return classID;
    }
}
