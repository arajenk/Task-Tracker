# Task Tracker

Task Tracker is a simple Java program that lets you create and manage tasks from the command line using a menu-based interface.  
I built this project to practice my Java fundamentals.

## Features
- Add tasks with a description
- Update task descriptions
- Delete tasks
- Mark tasks as **to-do**, **in-progress**, or **completed**
- List all tasks with their ID, description, and status

## Task Structure
Each task includes:
- `id` – unique task ID
- `description` – task details
- `status` – current state
- `createdAt` – when the task was created
- `updatedAt` – last time the task was updated


## How to Run

```bash
javac TaskTracker.java Task.java
java TaskTracker
