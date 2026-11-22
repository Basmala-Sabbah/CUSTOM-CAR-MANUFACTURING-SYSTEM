# 🚗 Custom Car Manufacturing System
### Design Patterns-Based Software Solution
**Java | Object-Oriented Design | Software Design Patterns**

---

# 01. Introduction

The **Custom Car Manufacturing System** is a Java-based software application designed to simulate a car factory that produces customized passenger vehicles according to different chassis sizes and target market regions.

The system supports three car sizes: **Compact, Midsize, and Fullsize**, with manufacturing specifications tailored to different regions, including the **Middle East, China, and Asia**.

The system also allows customers to customize their vehicles by adding optional features, such as:

- Premium Audio System
- Luxury Interior Pack
- Window Tint

In addition, it provides an inventory monitoring mechanism that tracks sold cars based on their chassis sizes and regions, allowing the factory owner to receive updates whenever inventory information changes.

This project focuses on applying **Object-Oriented Design principles** and software **Design Patterns** to build a flexible, organized, and extensible system. By using these patterns, the system aims to simplify object creation, support dynamic car customization, and improve communication between system components.

---

# 02. Project Objectives & Requirements

## 2.1 Project Objectives

The project aims to develop a flexible car manufacturing system using Java and Design Patterns, supporting customized cars based on chassis size and region. It focuses on car customization, inventory management, and real-time updates through reusable and extensible software components.

## 2.2 Project Requirements

The system shall meet the following requirements:

1. The system shall produce **Compact, Midsize, and Fullsize** passenger cars.
2. Cars shall support manufacturing specifications for the **Middle East, China, and Asia**.
3. Each car shall have a name, description, and a structural layout based on its size and region.
4. Customers shall be able to order one car configuration at a time.
5. Customers shall be able to add one or more optional upgrades:
   - Premium Audio System
   - Luxury Interior Pack
   - Window Tint
6. The system shall track sold cars by chassis size and region.
7. The factory owner shall receive real-time notifications whenever the sold car inventory changes.

---

# 03. System Design & Design Patterns

## 3.1 System Design

The system is designed using Object-Oriented Programming principles and Design Patterns to organize the car manufacturing process into separate, reusable components.

It supports different car sizes and regional specifications, allows dynamic car customization, and monitors sold car inventory.

The design aims to reduce coupling, improve flexibility, and make the system easier to maintain and extend.

## 3.2 Design Patterns Used

### 1. Abstract Factory Pattern

The **Abstract Factory Pattern** is used to create cars based on their chassis size and target region. It provides a structured way to create families of related car objects without directly depending on their concrete classes.

### 2. Decorator Pattern

The **Decorator Pattern** allows customers to add optional features to their cars dynamically, such as the Premium Audio System, Luxury Interior Pack, and Window Tint, without modifying the original car classes.

### 3. Observer Pattern

The **Observer Pattern** is used to monitor changes in the sold car inventory. Whenever the inventory is updated, registered observers are notified automatically, allowing the factory owner to stay informed about sold cars categorized by chassis size and region.

---

# 04. Class Diagram

This section presents the UML Class Diagram illustrating the system structure, main classes, interfaces, methods, and relationships between components.

---

# 05. Implementation & Source Code

This section contains the Java source code of the system, organized according to its main components and implemented Design Patterns.

---

# 06. Test Scenarios & Execution

This section demonstrates the required test scenarios, including car creation, customization, inventory updates, and execution results.

---

# 07. Conclusion

This project demonstrates the implementation of a Custom Car Manufacturing System using Java and three Design Patterns: Abstract Factory, Decorator, and Observer.

It supports flexible car production, dynamic customization, and inventory monitoring.

Through this project, we gained practical experience in applying Object-Oriented Design principles and building reusable, flexible, and maintainable software.
