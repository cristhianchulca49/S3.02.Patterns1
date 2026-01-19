# Task S3.02 Design Patterns
---

# 🏗️ Java Design Patterns Exercise

This repository contains a **Java-based implementation of several structural and behavioral design patterns**. The goal is to explore how patterns like **Singleton, Abstract Factory, and Strategy** help in creating scalable, maintainable, and decoupled code.

---

## 🚀 Skills & Concepts Learned

By completing these exercises, I have practiced and reinforced the following skills:

- **Singleton Pattern**: Ensuring a single point of access for a shared resource (Undo history).
- **Abstract Factory Pattern**: Creating families of related objects (Address/Phone) without specifying their concrete classes.
- **Strategy Pattern**: Encapsulating interchangeable algorithms (Report formats) to follow the **Open/Closed Principle**.
- **Dependency Inversion**: Ensuring high-level modules do not depend on low-level implementations.
- **Unit Testing with JUnit 5**: Verifying the correct behavior of patterns through standard and **parameterized tests**.
- **Software Architecture**: Understanding how to structure packages for better organization (`Domain`, `Services`, `Strategies`).
- **Clean Code & Java Streams**: Using functional programming to transform data into different formats (JSON, XML, CSV).

---

## 📘 Project Description

The project is divided into three levels, each addressing a specific real-world requirement using a design pattern:

### 1️⃣ Level 1: Singleton (Undo Command)
Implementation of a central **Undo** manager.
- **Goal**: Maintain a unique command history across the entire application.
- **Structure**: Private constructor, static `getInstance()` method, and an internal list to store commands.
- **Methods**: `addCommand()`, `undoCommand()`, and `showHistory()`.

### 2️⃣ Level 2: Abstract Factory (International Contacts)
A manager for international addresses and phone numbers.
- **Goal**: Automatically format data based on the country of origin.
- **Structure**: 
  - **Abstract Factory**: `ContactFactory`
  - **Concrete Factories**: `SpainContactFactory`, `USAContactFactory`.
  - **Abstract Products**: `Address`, `Phone`.
- **Logic**: Each country applies its specific prefix (+34, +1) and address structure.

### 3️⃣ Level 3: Strategy (Report Generator)
A flexible system for generating reports in multiple formats.
- **Goal**: Generate reports (CSV, JSON, XML, HTML, PDF, Word, Excel) without modifying the core service.
- **Structure**:
  - **Strategy Interface**: `ReportStrategy`.
  - **Concrete Strategies**: One for each format using Java Streams for transformation.
  - **Stateless Service**: `ReportServices` delegates the logic to the currently active strategy.

---

### 🧪 Tools & Technologies Used

- **Java 17/21** – Core programming language.
- **JUnit 5** – Testing framework for unit and parameterized tests.
- **Maven/Gradle** – Dependency management and project build.
- **Git & GitHub** – Version control and project sharing.
- **IntelliJ IDEA** – Primary IDE for development.

---

## 🛠️ Installation

Clone this repository:

git clone [https://github.com/cristhianchulca49/Task-S3.02-Design-Patterns](https://github.com/cristhianchulca49/Task-S3.02-Design-Patterns)

---

## 🤝 Contributions are welcome! 

- Please follow these steps to contribute: 

- Fork the repository Create a new branch: git checkout -b feature/NewFeature 

- Make your changes and commit them: git commit -m 'Add New Feature' 

- Push the changes to your branch: git push origin feature/NewFeature 

- Open a Pull Request
