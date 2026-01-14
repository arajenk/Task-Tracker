# Task Tracker (Java CLI)

Task Tracker is a simple **command-line task management application** written in Java.  
I built this project to practice **Java fundamentals**, including object-oriented programming, file I/O, and working with dates and time.

The program uses a menu-based interface that allows users to create, update, and manage tasks directly from the terminal, with data persisting between runs.

---

## Features

- Add new tasks with a description
- Update existing task descriptions
- Delete tasks by ID
- Mark tasks as:
  - **to-do**
  - **in-progress**
  - **completed**
- List all tasks with:
  - ID
  - Description
  - Status
  - Creation timestamp
  - Last updated timestamp
- Persistent storage using a local text file

---

## Task Structure

Each task contains the following fields:

- `id` – unique task identifier
- `description` – task details
- `status` – current task state (`to-do`, `in-progress`, `completed`)
- `createdAt` – timestamp of when the task was created
- `updatedAt` – timestamp of the most recent update

Timestamps are handled using Java’s `Instant` class.

---

## How It Works

- Tasks are stored in an `ArrayList<Task>` during runtime
- Tasks are saved to a local file (`tasks.txt`) after every change
- When the program starts, tasks are automatically loaded from the file
- Task IDs are generated based on existing tasks to avoid collisions

---
