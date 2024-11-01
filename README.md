# Gym Membership Management System

## Overview
The Gym Membership Management System is a Java application designed to manage gym memberships effectively. It includes a graphical user interface (GUI) built with NetBeans that allows both admins and trainers to interact with the system seamlessly. The application supports functionalities such as adding and viewing trainers and members, class management, and user authentication.

## Packages and Structure
The project is organized into three main packages:

1. **backend**: Contains all the classes and database interactions from Lab 4, including:
   - `AdminRole`
   - `TrainerRole`
   - `Trainer`
   - `Member`
   - `Class`
   - `MemberClassRegistration`

2. **frontend**: Contains all GUI components, with each class representing a window for specific operations.

3. **constants**: Contains interfaces for file names and login credentials:
   - `FileNames.java`: Stores filenames for trainers, members, classes, and registrations.
   - `LoginCredentials.java`: Contains the credentials for admin and trainer logins.

## Features
The system includes the following features:

### User Interfaces
- **Main Window**: Access for Admin and Trainer roles.
- **Admin Login Window**: Secure login for admin users.
- **Admin Role Window**: Manage trainers and perform admin tasks (add/remove trainers, view trainers).
- **Add Trainer Window**: Input new trainer details.
- **View Trainers Window**: Display all trainers in a table.
- **Remove Trainer Window**: Delete a trainer by ID.
- **Trainer Login Window**: Secure login for trainers.
- **Trainer Role Window**: Manage members and classes (add members, view members, register members for classes).
- **Add Member Window**: Input new member details.
- **View Members Window**: Display all gym members in a table.
- **Add Class Window**: Input new class details.
- **View Classes Window**: Display all classes in a table.
- **Register Member for Class Window**: Register members for classes if seats are available.
- **Cancel Registration Window**: Cancel a member's class registration.
- **View Registrations Window**: Display all member registrations.

### File Handling
- All data related to trainers, members, classes, and registrations is stored in text files:
  - `Trainers.txt`
  - `Members.txt`
  - `Class.txt`
  - `Registration.txt`

### Validation
The system includes validation checks to ensure:
- Unique trainer IDs.
- Valid member registration details (all fields must be filled).
- Class registration only occurs if seats are available.
- Correct credentials for admin and trainer logins.

## Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
