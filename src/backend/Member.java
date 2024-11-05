/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backend;

/**
 *
 * @author amr
 */
public class Member implements Identifiables {

    private String memberID, name, membershipType, email, phoneNumber, status;

    public Member(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        this.memberID = memberID;
        this.name = name;
        this.membershipType = membershipType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStatus() {
        return status;
    }
    @Override
    public String lineRepresentation() {
        String data = memberID + ", " + name + ", " + membershipType + ", " + email + ", " + phoneNumber + ", " + status;
        return data;
    }

    @Override
    public String getSearchKey() {
        return memberID;
    }

}
