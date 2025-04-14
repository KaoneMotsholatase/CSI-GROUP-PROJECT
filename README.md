 📘 CSI142 Mini Project – Student Performance Tracker

## 👥 Group Members
 week1
| Member(s) | Role |
|-----------|------|
| Priscillah Matshelo Kgotlayame (201702204) <br> Olorato Terrence Kepaletswe (202404383) | `Student.java` Developer |
| Temogo Bosigo (201803742) <br> Kevin Lekgoa (202403979) | `Course.java` Developer ,App.java,Main.java & Custom Exception Handler |
| Kaone Motsholatase (202401125) | GitHub Manager, Documentation, UML Diagram |

# 📌 Project Domain

This application is a **console-based Student Performance Tracker**.  
Users can:
- Enter and display course information
- Add courses to students
- Calculate GPA from multiple course grades
- Validate grades and GPA using **custom exceptions**


### 🔷 Course Class
- Fields: `courseCode`, `courseName`, `creditHours`, `finalGrade`
- Constructor and `setFinalGrade()` the method validates that grades are between 0 and 100
- Throws `InvalidGradeException` for grades that are out of range

### 🔷 Student class
- Fields: `studentID`, `name`, `gpa`, `ArrayList<Course>`
- Methods:
  - `addCourse()`
  - `calculateGPA()`: computes weighted GPA from grades & credit hours
  - `display()`: prints student and course details
- Throws `InvalidGPAException` when GPA is out of range


### 🔷 InvalidGradeException
- Custom exception for validating grades in `Course.java`

### 🔷 InvalidGPAException
- Custom exception used in `Student` to validate calculated GPA

### 🔷 App class
- Console-based menu for entering course data and displaying results

### 🔷 Main class
- Test class responsible for validating course and exception logic

## 🔗 Class Relationships

- A **Student has-a list of Course**
- `Course` uses `InvalidGradeException`
- `Student` uses `InvalidGPAException`

## 🗃️ Folder Structure
```
CSI-GROUP-PROJECT/
├── src/
│   ├── App.java
│   ├── Main.java
│   ├── Student.java
│   ├── Course.java
│   ├── InvalidGPAException.java
│   └── InvalidGradeException.java
├── docs/
│   ├── README.md
│   └── UML.png
├── .gitignore
└── README.md
```
## 🧠 Week 1 Deliverables

-  All Java classes created with correct OOP and exception handling
-  GitHub repo setup and working
-  Course and student logic working with `App` and `Main`
-  Documentation and UML added



