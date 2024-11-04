/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import constants.FileNames;

import java.util.*;

/**
 *
 * @author amr
 */
public class AdminRole {

    public TrainerDatabase database;

    public AdminRole() {
        database = new TrainerDatabase(FileNames.TRAINER_FILENAME);
        database.readFromFile();
    }
    

    public void addTrainer(String trainerId, String name, String email, String speciality, String phoneNumber) {
        Trainer t = new Trainer(trainerId, name, email, speciality, phoneNumber);
        database.insertRecord(t);
    }

    public List<Trainer> getListOfTrainers() {
        return database.returnAllRecords();
    }

    public void removeTrainer(String key) {
        database.deleteRecord(key);
    }

    public void logout() {
        database.saveToFile();
    }

}
