# Chandrayaan 3 Lunar Craft

## Overview
- In this project, we develop a program to control the latest lunar spacecraft, Chandrayaan 3, as it navigates through the galaxy using galactic coordinates represented by (x, y, z) coordinates. As a scientist at ISRO, the program's goal is to translate commands sent from Earth into instructions understood by the spacecraft.

## Problem Statement
- As a scientist at ISRO, your task is to develop a program that controls the latest lunar spacecraft, Chandrayaan 3, and translates commands sent from Earth into instructions understood by the spacecraft.

- The spacecraft navigates through the galaxy using galactic coordinates represented by three-dimensional (x, y, z) coordinates.

- The x-coordinate denotes east or west direction, the y-coordinate denotes north or south location, and the z-coordinate denotes the distance above or below the galactic plane.

- The spacecraft's initial starting point and direction are provided, and the program implements functionalities to process a character array of commands:
    - *Move the spacecraft forward/backward (t, b)*: The spacecraft moves one step forward or backward based on its current direction.

    - *Turn the spacecraft left/right (l, r)*: The spacecraft rotates 90 degrees to the left or right, changing its facing direction.

    - *Turn the spacecraft up/down (u, d)*: The spacecraft changes its angle, rotating upwards or downwards.


- The spacecraft's initial direction (N, S, E, W, Up, Down) represents the reference frame for movement and rotation.

- The spacecraft cannot move or rotate diagonally; it can only move in the direction it is currently facing.

- Assume that the spacecraft's movement and rotations are rigid, and it cannot move beyond the galactic boundaries.



## Guidelines

### Prerequisites
- install *Java (17.0.8)* and *Maven* in your system.
- IDE to run maven project of your choice. (*Ecllipse, **Intellij* etc.)

### Steps to be followed to run project successfully.
- Clone the project repository to your local machine.
    
        git clone git@github.com:ForamDalsaniya/Chandrayaan3LunarCraft.git
    
- Navigate to the directory where you have cloned the project and open the project folder.
- Locate the "pom.xml" file in the project folder and double-click on it to open the project in your Integrated Development Environment (IDE).
- Alternatively, you can open your IDE and import the Maven project by selecting the option to import an existing project.
- After successfully importing the project, open the *pom.xml* file and update the Maven project. This step will ensure that all the required dependencies are installed in the project.
- Find the *Main.java* file in the *src/main/java/org/example* folder within the project structure.
- Run the *Main.java* file to execute the project.

By following these steps, you should have the project set up on your local environment and running successfully. If you encounter any issues during the process, feel free to reach out for further assistance.



## Contact Information

### Support
- If you have any questions, feedback, or issues related to the project, please don't hesitate to contact me. Any contributions or suggestions that can help improve the project are welcomed.
- For general inquiries or support requests, you can reach out on the following email address: forampdalsaniya@gmail.com.

### Feature request
- If you have an idea for a new feature or enhancement that could be valuable to the project, I would love to hear it! Please create a new feature request in the project's issue tracker on GitHub or send an email to forampdalsaniya@gmail.com.

Thank you😊
