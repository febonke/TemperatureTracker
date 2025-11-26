Temperature Tracker (Java)
A simple Java console application that allows the user to input daily temperatures for a week, then analyzes the data to display:
Highest temperature
Lowest temperature
Daily temperatures above the weekly average
This project demonstrates clean method decomposition, array processing, loop logic, and basic console interaction in Java.

Features
User inputs temperatures for 7 days
Calculates the maximum temperature
Calculates the minimum temperature
Calculates the average weekly temperature
Identifies all days above average
Clean, readable, method-based architecture

What this project demonstrates
Working with arrays
Using loops to process data
Writing reusable methods
Returning values from methods
Console input using Scanner
Basic data analysis

Code Overview
The main methods include:
🔸 maxTemp(int[] temps)
Returns the highest temperature of the week.
🔸 minTemp(int[] temps)
Returns the lowest temperature of the week.
🔸 printDaysAboveAverage(int[] temps)
Calculates the average and prints which days exceed it.

Compile: javac TemperatureTracker.java
Run: java TemperatureTracker

Sample Run
Enter temperature for day 1: 72
Enter temperature for day 2: 75
Enter temperature for day 3: 80
Enter temperature for day 4: 82
Enter temperature for day 5: 90
Enter temperature for day 6: 88
Enter temperature for day 7: 79

The max temperature for the week is: 90
The min temperature for the week is: 72
Day 3 is above average
Day 4 is above average
Day 5 is above average
Day 6 is above average
