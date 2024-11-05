# Gym Membership Management System

## Overview

The Gym Membership Management System is designed to provide an intuitive graphical user interface (GUI) for managing gym memberships, classes, and trainer information. This project extends the functionalities developed in Lab 4 by allowing users, including admins and trainers, to interact with the system seamlessly using a GUI built with NetBeans' GUI Builder.

## Objective

The primary objective of this lab project is to enhance the Gym Membership Management System by implementing a user-friendly GUI, which facilitates various operations such as adding and managing trainers and members, viewing classes, and handling registrations.

## Packages and Class Structure

The project is organized into three main packages:

1. **backend**
   - Contains core classes including:
     - `AdminRole`
     - `TrainerRole`
     - `Trainer`
     - `Member`
     - `Class`
     - `MemberClassRegistration`
   - Responsible for database interactions and business logic.
   - Access modifiers are set to allow necessary access to the frontend.

2. **frontend**
   - Contains GUI components that represent various user interfaces.
   - Each class corresponds to a specific window for performing operations (e.g., adding a new member, viewing trainer details).

3. **constants**
   - Contains two interfaces:
     - `FileNames.java`: Defines file names for data storage.
     - `LoginCredentials.java`: Stores login credentials for admin and trainer roles.

## Functional Requirements

### GUI Components

1. **Main Window**
   - Buttons: `Admin Role` and `Trainer Role`.
   - Navigates to the appropriate login window upon selection.

2. **Admin Login Window**
   - Validates credentials against `LoginCredentials`.
   - Displays a warning for incorrect credentials.

3. **Admin Role Window**
   - Operations:
     - Add Trainer
     - View Trainers
     - Remove Trainer
     - Logout (saves data and returns to the main window).

4. **Add Trainer Window**
   - Inputs: ID, name, email, specialty, and phone number.
   - Validations for empty fields and existing trainers.

5. **View Trainers Window**
   - Displays a table of all trainers in the system.

6. **Remove Trainer Window**
   - Allows removal of a trainer by ID with corresponding validations.

7. **Trainer Login Window**
   - Similar functionality to the admin login with validations.

8. **Trainer Role Window**
   - Operations:
     - Add Member
     - View Members
     - Add Class
     - View Classes
     - Register Member for Class
     - Cancel Registration
     - View Registrations
     - Logout (saves all updated data).

9. **Member and Class Management Windows**
   - Windows for adding members, viewing members, adding classes, viewing classes, and handling registrations with appropriate validations.

### File Handling

- Data for trainers, members, classes, and registrations are stored and retrieved from text files (`Trainers.txt`, `Members.txt`, `Class.txt`, `Registration.txt`).
- Use the `FileNames` interface to manage file references.

### Validation

Implement the following validations:
- Unique trainer IDs.
- Valid details for member registration.
- Available seats for class registration.
- Credential validation for admin and trainer logins.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/amrrkhaled/Gym.git


