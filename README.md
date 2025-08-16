# Studentgradecalculator
# 🎓 Grade Calculator

This is a simple Java console application that calculates grades for multiple students based on their marks in five subjects: Math, Science, English, History, and Computer.

## 📋 Features

- Input student names and marks  
- Calculates total marks, average, and grade  
- Assigns grades based on average score:  
  - A: 90 and above  
  - B: 80–89  
  - C: 70–79  
  - D: 60–69  
  - F: Below 60  
- Displays individual grade reports  
- Summarizes passed and failed students  

## 🛠 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/grade-calculator.git
   
#  Compile and run the program:
javac GradeCalculator.java

java GradeCalculator

# Requirements- 
Java JDK 8 or higher
 
- Command-line interface (CLI)
 
# Example Output
Enter the no.of students: 2

Student 1 marks details:
Enter student name: Alice
Enter marks for Math: 85
Enter marks for Science: 90
Enter marks for English: 88
Enter marks for History: 92
Enter marks for Computer: 87

--- Grade Report ---
Student Name: Alice
Total Marks: 294
Average: 58.8
Grade: F

--- Final Report is ---
passed Student is:
Alice
failed Student is:
Bob
