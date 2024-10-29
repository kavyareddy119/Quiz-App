public class OSQuestions implements Questions {
    private String[][] questions;
    private String[][] answers;

    public OSQuestions() {
        questions = new String[100][5];
        answers = new String[100][1];

        // Question 1
        questions[0][0] = "What is the main purpose of an operating system?";
        questions[0][1] = "To manage hardware and software resources";
        questions[0][2] = "To connect to the internet";
        questions[0][3] = "To design applications";
        questions[0][4] = "To protect against viruses";
        answers[0][0] = "To manage hardware and software resources";

// Question 2
        questions[1][0] = "Which of the following is an example of a real-time operating system?";
        questions[1][1] = "RTLinux";
        questions[1][2] = "Windows";
        questions[1][3] = "macOS";
        questions[1][4] = "Ubuntu";
        answers[1][0] = "RTLinux";

// Question 3
        questions[2][0] = "What is the function of the kernel in an operating system?";
        questions[2][1] = "It manages system resources";
        questions[2][2] = "It provides user interface";
        questions[2][3] = "It organizes files";
        questions[2][4] = "It connects to the network";
        answers[2][0] = "It manages system resources";

// Question 4
        questions[3][0] = "Which of the following is a type of process scheduling algorithm?";
        questions[3][1] = "Round Robin";
        questions[3][2] = "Stack Sorting";
        questions[3][3] = "Depth First Search";
        questions[3][4] = "Binary Search";
        answers[3][0] = "Round Robin";

// Question 5
        questions[4][0] = "What is a deadlock in operating systems?";
        questions[4][1] = "A situation where processes are waiting indefinitely for resources";
        questions[4][2] = "A situation where a program crashes";
        questions[4][3] = "A process that executes forever";
        questions[4][4] = "A memory management issue";
        answers[4][0] = "A situation where processes are waiting indefinitely for resources";

// Question 6
        questions[5][0] = "Which of the following is a mechanism for handling deadlocks?";
        questions[5][1] = "Deadlock Detection";
        questions[5][2] = "Memory Paging";
        questions[5][3] = "Interrupts";
        questions[5][4] = "Context Switching";
        answers[5][0] = "Deadlock Detection";

// Question 7
        questions[6][0] = "Which of the following is not a type of operating system?";
        questions[6][1] = "Mainframe OS";
        questions[6][2] = "Distributed OS";
        questions[6][3] = "Time-sharing OS";
        questions[6][4] = "Cache OS";
        answers[6][0] = "Cache OS";

// Question 8
        questions[7][0] = "Which of the following is an advantage of multiprogramming?";
        questions[7][1] = "Increased CPU utilization";
        questions[7][2] = "Decreased throughput";
        questions[7][3] = "Reduced process scheduling time";
        questions[7][4] = "Lower memory requirements";
        answers[7][0] = "Increased CPU utilization";

// Question 9
        questions[8][0] = "What does CPU scheduling aim to achieve?";
        questions[8][1] = "Efficient allocation of CPU to various processes";
        questions[8][2] = "Efficient use of memory";
        questions[8][3] = "Faster I/O operations";
        questions[8][4] = "Data protection";
        answers[8][0] = "Efficient allocation of CPU to various processes";

// Question 10
        questions[9][0] = "Which of the following scheduling algorithms may cause starvation?";
        questions[9][1] = "Shortest Job Next (SJN)";
        questions[9][2] = "Round Robin (RR)";
        questions[9][3] = "First-Come, First-Served (FCFS)";
        questions[9][4] = "Multilevel Queue";
        answers[9][0] = "Shortest Job Next (SJN)";

// Question 11
        questions[10][0] = "What is a process control block (PCB)?";
        questions[10][1] = "A data structure that contains process information";
        questions[10][2] = "A block of memory used by the operating system";
        questions[10][3] = "A scheduling algorithm";
        questions[10][4] = "A security protocol";
        answers[10][0] = "A data structure that contains process information";

// Question 12
        questions[11][0] = "What does a context switch refer to?";
        questions[11][1] = "Switching the CPU from one process to another";
        questions[11][2] = "Switching from user mode to kernel mode";
        questions[11][3] = "Switching between different users";
        questions[11][4] = "Switching to a new operating system";
        answers[11][0] = "Switching the CPU from one process to another";

// Question 13
        questions[12][0] = "Which of the following is an example of inter-process communication (IPC)?";
        questions[12][1] = "Message Passing";
        questions[12][2] = "Memory Allocation";
        questions[12][3] = "Process Scheduling";
        questions[12][4] = "File Sharing";
        answers[12][0] = "Message Passing";

// Question 14
        questions[13][0] = "What is the primary purpose of virtual memory?";
        questions[13][1] = "To extend the available physical memory";
        questions[13][2] = "To speed up I/O operations";
        questions[13][3] = "To protect against viruses";
        questions[13][4] = "To manage CPU processes";
        answers[13][0] = "To extend the available physical memory";

// Question 15
        questions[14][0] = "Which of the following is a page replacement algorithm?";
        questions[14][1] = "Least Recently Used (LRU)";
        questions[14][2] = "Best Fit";
        questions[14][3] = "Shortest Job First (SJF)";
        questions[14][4] = "First Come First Served (FCFS)";
        answers[14][0] = "Least Recently Used (LRU)";

// Question 16
        questions[15][0] = "Which term describes the phenomenon where the operating system spends more time swapping processes in and out of memory than executing them?";
        questions[15][1] = "Thrashing";
        questions[15][2] = "Fragmentation";
        questions[15][3] = "Deadlock";
        questions[15][4] = "Multitasking";
        answers[15][0] = "Thrashing";

// Question 17
        questions[16][0] = "What does the term 'fragmentation' refer to in operating systems?";
        questions[16][1] = "Wasted memory space";
        questions[16][2] = "Loss of files";
        questions[16][3] = "Crashing of processes";
        questions[16][4] = "Scheduling delays";
        answers[16][0] = "Wasted memory space";

// Question 18
        questions[17][0] = "What is the difference between internal and external fragmentation?";
        questions[17][1] = "Internal fragmentation occurs within fixed-size partitions, while external occurs with variable-size partitions.";
        questions[17][2] = "Internal fragmentation affects files, while external affects processes.";
        questions[17][3] = "Internal fragmentation refers to memory leaks, while external refers to CPU waste.";
        questions[17][4] = "Internal fragmentation is a software issue, while external is a hardware issue.";
        answers[17][0] = "Internal fragmentation occurs within fixed-size partitions, while external occurs with variable-size partitions.";

// Question 19
        questions[18][0] = "What is the function of a device driver?";
        questions[18][1] = "It allows the operating system to communicate with hardware devices";
        questions[18][2] = "It provides an interface for users";
        questions[18][3] = "It manages file systems";
        questions[18][4] = "It schedules tasks for the CPU";
        answers[18][0] = "It allows the operating system to communicate with hardware devices";

// Question 20
        questions[19][0] = "Which of the following file systems is used in modern Windows operating systems?";
        questions[19][1] = "NTFS";
        questions[19][2] = "FAT32";
        questions[19][3] = "ext4";
        questions[19][4] = "HFS+";
        answers[19][0] = "NTFS";

        // Question 21
        questions[20][0] = "What is the role of the bootloader in an operating system?";
        questions[20][1] = "To load the operating system into memory during startup";
        questions[20][2] = "To manage hardware devices";
        questions[20][3] = "To handle user input";
        questions[20][4] = "To schedule tasks for the CPU";
        answers[20][0] = "To load the operating system into memory during startup";

// Question 22
        questions[21][0] = "Which of the following is a method for process synchronization?";
        questions[21][1] = "Semaphores";
        questions[21][2] = "Memory Paging";
        questions[21][3] = "Deadlock Prevention";
        questions[21][4] = "File Systems";
        answers[21][0] = "Semaphores";

// Question 23
        questions[22][0] = "What does the term 'race condition' refer to?";
        questions[22][1] = "A situation where multiple processes access shared data simultaneously leading to inconsistent results";
        questions[22][2] = "A situation where two processes enter deadlock";
        questions[22][3] = "A condition caused by fragmented memory";
        questions[22][4] = "A type of context switching error";
        answers[22][0] = "A situation where multiple processes access shared data simultaneously leading to inconsistent results";

// Question 24
        questions[23][0] = "Which of the following is an advantage of using a microkernel architecture?";
        questions[23][1] = "Improved modularity and easier maintenance";
        questions[23][2] = "Faster process execution";
        questions[23][3] = "Reduced memory usage";
        questions[23][4] = "Improved I/O throughput";
        answers[23][0] = "Improved modularity and easier maintenance";

// Question 25
        questions[24][0] = "Which of the following is NOT a component of the process state?";
        questions[24][1] = "Process identifier (PID)";
        questions[24][2] = "Program counter (PC)";
        questions[24][3] = "Stack pointer";
        questions[24][4] = "Data cache";
        answers[24][0] = "Data cache";

// Question 26
        questions[25][0] = "What does SJF (Shortest Job First) scheduling prioritize?";
        questions[25][1] = "Processes with the shortest execution time";
        questions[25][2] = "Processes that arrived first";
        questions[25][3] = "Processes that have been in the queue the longest";
        questions[25][4] = "Processes with the highest priority";
        answers[25][0] = "Processes with the shortest execution time";

// Question 27
        questions[26][0] = "Which of the following operating systems uses a monolithic kernel?";
        questions[26][1] = "Linux";
        questions[26][2] = "Windows";
        questions[26][3] = "MacOS";
        questions[26][4] = "RTLinux";
        answers[26][0] = "Linux";

// Question 28
        questions[27][0] = "What is the primary function of a file system in an operating system?";
        questions[27][1] = "To manage how data is stored and retrieved";
        questions[27][2] = "To schedule CPU tasks";
        questions[27][3] = "To provide access to the internet";
        questions[27][4] = "To manage memory paging";
        answers[27][0] = "To manage how data is stored and retrieved";

// Question 29
        questions[28][0] = "Which of the following is a disk scheduling algorithm?";
        questions[28][1] = "SCAN";
        questions[28][2] = "FIFO";
        questions[28][3] = "Round Robin";
        questions[28][4] = "Priority Scheduling";
        answers[28][0] = "SCAN";

// Question 30
        questions[29][0] = "What is a thread in operating systems?";
        questions[29][1] = "A lightweight process";
        questions[29][2] = "A scheduling algorithm";
        questions[29][3] = "A memory management technique";
        questions[29][4] = "A process that runs in the background";
        answers[29][0] = "A lightweight process";

// Question 31
        questions[30][0] = "What is the difference between a process and a thread?";
        questions[30][1] = "A process is a program in execution, while a thread is a lightweight process within a process";
        questions[30][2] = "A process is smaller than a thread";
        questions[30][3] = "A thread runs on the CPU, while a process runs in memory";
        questions[30][4] = "There is no difference between a process and a thread";
        answers[30][0] = "A process is a program in execution, while a thread is a lightweight process within a process";

// Question 32
        questions[31][0] = "Which of the following is an example of a distributed operating system?";
        questions[31][1] = "Amoeba";
        questions[31][2] = "Unix";
        questions[31][3] = "DOS";
        questions[31][4] = "macOS";
        answers[31][0] = "Amoeba";

// Question 33
        questions[32][0] = "What is the critical section in process synchronization?";
        questions[32][1] = "A section of code where shared resources are accessed";
        questions[32][2] = "The final step of process execution";
        questions[32][3] = "A memory management area";
        questions[32][4] = "A section of code used to handle interrupts";
        answers[32][0] = "A section of code where shared resources are accessed";

// Question 34
        questions[33][0] = "Which of the following is a feature of a real-time operating system (RTOS)?";
        questions[33][1] = "Guaranteed response time to events";
        questions[33][2] = "Better file management";
        questions[33][3] = "Higher throughput";
        questions[33][4] = "Improved graphical user interface (GUI)";
        answers[33][0] = "Guaranteed response time to events";

// Question 35
        questions[34][0] = "Which of the following is an advantage of a time-sharing operating system?";
        questions[34][1] = "It allows multiple users to use the system simultaneously";
        questions[34][2] = "It reduces power consumption";
        questions[34][3] = "It provides better security";
        questions[34][4] = "It improves single-user experience";
        answers[34][0] = "It allows multiple users to use the system simultaneously";

// Question 36
        questions[35][0] = "What is the function of system calls in an operating system?";
        questions[35][1] = "To allow user-level programs to request services from the OS";
        questions[35][2] = "To interrupt the CPU";
        questions[35][3] = "To allocate memory to a process";
        questions[35][4] = "To manage CPU scheduling";
        answers[35][0] = "To allow user-level programs to request services from the OS";

// Question 37
        questions[36][0] = "Which of the following is an example of a non-preemptive scheduling algorithm?";
        questions[36][1] = "First-Come, First-Served (FCFS)";
        questions[36][2] = "Round Robin (RR)";
        questions[36][3] = "Priority Scheduling";
        questions[36][4] = "Shortest Remaining Time First (SRTF)";
        answers[36][0] = "First-Come, First-Served (FCFS)";

// Question 38
        questions[37][0] = "What is the purpose of the 'interrupt' in an operating system?";
        questions[37][1] = "To notify the processor of an event that needs immediate attention";
        questions[37][2] = "To allocate CPU time to processes";
        questions[37][3] = "To synchronize threads";
        questions[37][4] = "To handle system calls";
        answers[37][0] = "To notify the processor of an event that needs immediate attention";

// Question 39
        questions[38][0] = "Which of the following methods is used to avoid deadlocks in an operating system?";
        questions[38][1] = "Banker's Algorithm";
        questions[38][2] = "Memory Paging";
        questions[38][3] = "Round Robin Scheduling";
        questions[38][4] = "First Come, First Served Scheduling";
        answers[38][0] = "Banker's Algorithm";

// Question 40
        questions[39][0] = "What does DMA stand for in operating systems?";
        questions[39][1] = "Direct Memory Access";
        questions[39][2] = "Data Management Algorithm";
        questions[39][3] = "Dynamic Memory Allocation";
        questions[39][4] = "Device Management Access";
        answers[39][0] = "Direct Memory Access";

        // Question 41
        questions[40][0] = "Which of the following is a valid disk scheduling algorithm?";
        questions[40][1] = "C-LOOK";
        questions[40][2] = "LIFO";
        questions[40][3] = "Best Fit";
        questions[40][4] = "Priority Queue";
        answers[40][0] = "C-LOOK";

// Question 42
        questions[41][0] = "What is the primary purpose of paging in memory management?";
        questions[41][1] = "To allow efficient use of physical memory";
        questions[41][2] = "To improve CPU speed";
        questions[41][3] = "To allocate space to the CPU cache";
        questions[41][4] = "To manage disk I/O operations";
        answers[41][0] = "To allow efficient use of physical memory";

// Question 43
        questions[42][0] = "Which of the following conditions is required for deadlock?";
        questions[42][1] = "Mutual Exclusion";
        questions[42][2] = "Interrupts";
        questions[42][3] = "Paging";
        questions[42][4] = "Context Switching";
        answers[42][0] = "Mutual Exclusion";

// Question 44
        questions[43][0] = "What does the term 'swapping' refer to in an operating system?";
        questions[43][1] = "Moving processes between main memory and disk";
        questions[43][2] = "Switching between different threads";
        questions[43][3] = "Allocating CPU time to processes";
        questions[43][4] = "Changing the memory allocation of a process";
        answers[43][0] = "Moving processes between main memory and disk";

// Question 45
        questions[44][0] = "Which of the following is an example of a preemptive scheduling algorithm?";
        questions[44][1] = "Round Robin (RR)";
        questions[44][2] = "First-Come, First-Served (FCFS)";
        questions[44][3] = "Shortest Job First (SJF)";
        questions[44][4] = "Priority Scheduling (non-preemptive)";
        answers[44][0] = "Round Robin (RR)";

// Question 46
        questions[45][0] = "What is the main function of a command interpreter (shell)?";
        questions[45][1] = "To execute user commands";
        questions[45][2] = "To allocate memory";
        questions[45][3] = "To handle process scheduling";
        questions[45][4] = "To manage file systems";
        answers[45][0] = "To execute user commands";

// Question 47
        questions[46][0] = "What is the purpose of the 'pipe' system call in operating systems?";
        questions[46][1] = "To enable inter-process communication";
        questions[46][2] = "To manage file I/O operations";
        questions[46][3] = "To allocate memory to processes";
        questions[46][4] = "To prioritize CPU scheduling";
        answers[46][0] = "To enable inter-process communication";

// Question 48
        questions[47][0] = "Which of the following is NOT a characteristic of a real-time operating system (RTOS)?";
        questions[47][1] = "Low latency";
        questions[47][2] = "Multitasking";
        questions[47][3] = "High throughput";
        questions[47][4] = "Guaranteed response times";
        answers[47][0] = "High throughput";

// Question 49
        questions[48][0] = "Which of the following is a feature of UNIX-based operating systems?";
        questions[48][1] = "Multitasking and multiuser capabilities";
        questions[48][2] = "Single-user mode";
        questions[48][3] = "Limited hardware compatibility";
        questions[48][4] = "Lack of command-line interface";
        answers[48][0] = "Multitasking and multiuser capabilities";

// Question 50
        questions[49][0] = "Which of the following describes a distributed operating system?";
        questions[49][1] = "An OS that manages a group of independent computers and makes them appear to be a single computer";
        questions[49][2] = "An OS that runs on a single computer with multiple users";
        questions[49][3] = "An OS that provides real-time services";
        questions[49][4] = "An OS that only runs on embedded devices";
        answers[49][0] = "An OS that manages a group of independent computers and makes them appear to be a single computer";

// Question 51
        questions[50][0] = "What is the main advantage of using a hierarchical file system?";
        questions[50][1] = "Organizes files into directories and subdirectories for easier access";
        questions[50][2] = "Improves disk I/O performance";
        questions[50][3] = "Increases available memory";
        questions[50][4] = "Provides faster CPU scheduling";
        answers[50][0] = "Organizes files into directories and subdirectories for easier access";

// Question 52
        questions[51][0] = "Which operating system feature allows for the execution of multiple processes simultaneously?";
        questions[51][1] = "Multitasking";
        questions[51][2] = "Paging";
        questions[51][3] = "Thrashing";
        questions[51][4] = "Swapping";
        answers[51][0] = "Multitasking";

// Question 53
        questions[52][0] = "Which of the following memory management techniques can cause external fragmentation?";
        questions[52][1] = "Dynamic Partitioning";
        questions[52][2] = "Paging";
        questions[52][3] = "Segmentation";
        questions[52][4] = "Fixed Partitioning";
        answers[52][0] = "Dynamic Partitioning";

// Question 54
        questions[53][0] = "Which of the following is a characteristic of time-sharing operating systems?";
        questions[53][1] = "Multiple users can interact with the system simultaneously";
        questions[53][2] = "Processes are executed based on priority";
        questions[53][3] = "It has a single-user interface";
        questions[53][4] = "It does not allow multitasking";
        answers[53][0] = "Multiple users can interact with the system simultaneously";

// Question 55
        questions[54][0] = "What is 'demand paging' in an operating system?";
        questions[54][1] = "Loading a page into memory only when it is needed";
        questions[54][2] = "Swapping processes between memory and disk";
        questions[54][3] = "Allocating memory to the highest priority process";
        questions[54][4] = "Reading an entire program into memory at once";
        answers[54][0] = "Loading a page into memory only when it is needed";

// Question 56
        questions[55][0] = "Which of the following is an example of a system call in Unix/Linux?";
        questions[55][1] = "fork()";
        questions[55][2] = "malloc()";
        questions[55][3] = "printf()";
        questions[55][4] = "scanf()";
        answers[55][0] = "fork()";

// Question 57
        questions[56][0] = "What is the main advantage of using virtual memory in an operating system?";
        questions[56][1] = "Allows execution of processes that may not be completely in memory";
        questions[56][2] = "Improves CPU speed";
        questions[56][3] = "Increases I/O throughput";
        questions[56][4] = "Allows real-time processing";
        answers[56][0] = "Allows execution of processes that may not be completely in memory";

// Question 58
        questions[57][0] = "Which of the following is a deadlock prevention technique?";
        questions[57][1] = "Avoid circular wait";
        questions[57][2] = "Use round robin scheduling";
        questions[57][3] = "Increase memory allocation";
        questions[57][4] = "Use paging";
        answers[57][0] = "Avoid circular wait";

// Question 59
        questions[58][0] = "Which of the following mechanisms is used by an operating system to handle multiple interrupt sources?";
        questions[58][1] = "Interrupt priority levels";
        questions[58][2] = "Context switching";
        questions[58][3] = "DMA";
        questions[58][4] = "Virtual memory";
        answers[58][0] = "Interrupt priority levels";

// Question 60
        questions[59][0] = "What is the main goal of I/O management in an operating system?";
        questions[59][1] = "To manage input and output devices and provide a way for processes to access them";
        questions[59][2] = "To handle user commands";
        questions[59][3] = "To increase CPU speed";
        questions[59][4] = "To manage the file system";
        answers[59][0] = "To manage input and output devices and provide a way for processes to access them";
// Question 61
        questions[60][0] = "Which of the following is NOT a goal of an operating system's memory management?";
        questions[60][1] = "To ensure efficient use of memory";
        questions[60][2] = "To provide protection between processes";
        questions[60][3] = "To maximize CPU utilization";
        questions[60][4] = "To handle user input";
        answers[60][0] = "To handle user input";

// Question 62
        questions[61][0] = "What is 'thrashing' in an operating system?";
        questions[61][1] = "Excessive paging, leading to reduced CPU performance";
        questions[61][2] = "Switching between different threads";
        questions[61][3] = "A memory allocation error";
        questions[61][4] = "A type of I/O scheduling problem";
        answers[61][0] = "Excessive paging, leading to reduced CPU performance";

// Question 63
        questions[62][0] = "Which of the following operating systems is designed for embedded systems?";
        questions[62][1] = "VxWorks";
        questions[62][2] = "Windows";
        questions[62][3] = "Linux";
        questions[62][4] = "MacOS";
        answers[62][0] = "VxWorks";

// Question 64
        questions[63][0] = "What is the purpose of a 'context switch' in an operating system?";
        questions[63][1] = "To switch the CPU from one process to another";
        questions[63][2] = "To allocate memory to a process";
        questions[63][3] = "To switch between user and kernel mode";
        questions[63][4] = "To manage file I/O operations";
        answers[63][0] = "To switch the CPU from one process to another";

// Question 65
        questions[64][0] = "What is the purpose of a page table in virtual memory management?";
        questions[64][1] = "To map virtual addresses to physical addresses";
        questions[64][2] = "To store process IDs";
        questions[64][3] = "To manage CPU scheduling";
        questions[64][4] = "To handle disk I/O operations";
        answers[64][0] = "To map virtual addresses to physical addresses";

// Question 66
        questions[65][0] = "Which of the following is an advantage of using multiprogramming?";
        questions[65][1] = "Increases CPU utilization";
        questions[65][2] = "Reduces the need for disk space";
        questions[65][3] = "Improves graphical performance";
        questions[65][4] = "Reduces the size of programs";
        answers[65][0] = "Increases CPU utilization";

// Question 67
        questions[66][0] = "Which of the following operating systems is primarily used in smartphones?";
        questions[66][1] = "Android";
        questions[66][2] = "UNIX";
        questions[66][3] = "Windows NT";
        questions[66][4] = "MacOS";
        answers[66][0] = "Android";

// Question 68
        questions[67][0] = "What is a 'buffer' in the context of operating systems?";
        questions[67][1] = "A temporary storage area used to hold data while it's being transferred";
        questions[67][2] = "A scheduling algorithm";
        questions[67][3] = "A method for allocating memory";
        questions[67][4] = "A system call for file management";
        answers[67][0] = "A temporary storage area used to hold data while it's being transferred";

// Question 69
        questions[68][0] = "Which of the following is a common issue with the 'First-Come, First-Served' (FCFS) scheduling algorithm?";
        questions[68][1] = "The 'convoy effect', where long processes delay shorter ones";
        questions[68][2] = "Low CPU utilization";
        questions[68][3] = "Requires a large amount of memory";
        questions[68][4] = "Complex implementation";
        answers[68][0] = "The 'convoy effect', where long processes delay shorter ones";

// Question 70
        questions[69][0] = "What is the primary function of the 'init' process in Unix/Linux systems?";
        questions[69][1] = "To initialize the system and manage system processes";
        questions[69][2] = "To handle file management";
        questions[69][3] = "To manage memory allocation";
        questions[69][4] = "To provide network services";
        answers[69][0] = "To initialize the system and manage system processes";

// Question 71
        questions[70][0] = "Which of the following is an example of an interrupt-driven I/O device?";
        questions[70][1] = "Keyboard";
        questions[70][2] = "Printer";
        questions[70][3] = "Hard disk";
        questions[70][4] = "RAM";
        answers[70][0] = "Keyboard";

// Question 72
        questions[71][0] = "What is the main difference between multitasking and multiprogramming?";
        questions[71][1] = "Multitasking involves multiple processes running concurrently, while multiprogramming focuses on maximizing CPU usage";
        questions[71][2] = "Multitasking is only used in real-time systems";
        questions[71][3] = "Multiprogramming does not use memory management techniques";
        questions[71][4] = "There is no difference between multitasking and multiprogramming";
        answers[71][0] = "Multitasking involves multiple processes running concurrently, while multiprogramming focuses on maximizing CPU usage";

// Question 73
        questions[72][0] = "Which of the following is an example of a non-volatile storage device?";
        questions[72][1] = "Hard disk drive";
        questions[72][2] = "RAM";
        questions[72][3] = "Cache memory";
        questions[72][4] = "Register";
        answers[72][0] = "Hard disk drive";

// Question 74
        questions[73][0] = "Which of the following scheduling algorithms can cause 'starvation'?";
        questions[73][1] = "Priority Scheduling";
        questions[73][2] = "First-Come, First-Served (FCFS)";
        questions[73][3] = "Round Robin";
        questions[73][4] = "Shortest Job First (SJF)";
        answers[73][0] = "Priority Scheduling";

// Question 75
        questions[74][0] = "Which of the following is the primary role of the 'kernel' in an operating system?";
        questions[74][1] = "To manage hardware resources and provide essential services";
        questions[74][2] = "To handle user interactions with the system";
        questions[74][3] = "To provide a graphical user interface";
        questions[74][4] = "To manage the file system only";
        answers[74][0] = "To manage hardware resources and provide essential services";

// Question 76
        questions[75][0] = "Which of the following is a feature of 'Real-Time Operating Systems' (RTOS)?";
        questions[75][1] = "Predictable response times to external events";
        questions[75][2] = "High throughput";
        questions[75][3] = "Increased graphical performance";
        questions[75][4] = "Batch processing capabilities";
        answers[75][0] = "Predictable response times to external events";

// Question 77
        questions[76][0] = "Which of the following is NOT an advantage of using 'virtual machines' in operating systems?";
        questions[76][1] = "High performance due to hardware-level control";
        questions[76][2] = "Isolation between different virtual machines";
        questions[76][3] = "Ability to run multiple operating systems on a single physical machine";
        questions[76][4] = "Simplified management and deployment";
        answers[76][0] = "High performance due to hardware-level control";

// Question 78
        questions[77][0] = "What is 'spooling' in the context of operating systems?";
        questions[77][1] = "Simultaneous Peripheral Operations On-Line, a method for managing I/O devices";
        questions[77][2] = "A memory management technique";
        questions[77][3] = "A type of CPU scheduling";
        questions[77][4] = "A file system operation";
        answers[77][0] = "Simultaneous Peripheral Operations On-Line, a method for managing I/O devices";

// Question 79
        questions[78][0] = "Which of the following mechanisms is used to handle deadlocks in an operating system?";
        questions[78][1] = "Deadlock detection and recovery";
        questions[78][2] = "Memory paging";
        questions[78][3] = "Thrashing control";
        questions[78][4] = "Multitasking";
        answers[78][0] = "Deadlock detection and recovery";

// Question 80
        questions[79][0] = "Which of the following is a common technique used for process synchronization?";
        questions[79][1] = "Mutex locks";
        questions[79][2] = "Demand paging";
        questions[79][3] = "Deadlock avoidance";
        questions[79][4] = "Priority scheduling";
        answers[79][0] = "Mutex locks";

        // Question 81
        questions[80][0] = "Which of the following is NOT a valid page replacement algorithm?";
        questions[80][1] = "Best Fit";
        questions[80][2] = "Least Recently Used (LRU)";
        questions[80][3] = "First-In, First-Out (FIFO)";
        questions[80][4] = "Optimal Page Replacement";
        answers[80][0] = "Best Fit";

// Question 82
        questions[81][0] = "What is the primary role of a device driver in an operating system?";
        questions[81][1] = "To allow the operating system to interact with hardware devices";
        questions[81][2] = "To allocate memory to applications";
        questions[81][3] = "To manage user accounts";
        questions[81][4] = "To handle CPU scheduling";
        answers[81][0] = "To allow the operating system to interact with hardware devices";

// Question 83
        questions[82][0] = "Which of the following is a technique for deadlock avoidance?";
        questions[82][1] = "Banker's Algorithm";
        questions[82][2] = "Round Robin Scheduling";
        questions[82][3] = "Multithreading";
        questions[82][4] = "Paging";
        answers[82][0] = "Banker's Algorithm";

// Question 84
        questions[83][0] = "What is the purpose of the 'swap space' in an operating system?";
        questions[83][1] = "To store data that cannot fit into physical memory";
        questions[83][2] = "To hold the kernel in memory";
        questions[83][3] = "To speed up CPU operations";
        questions[83][4] = "To manage network traffic";
        answers[83][0] = "To store data that cannot fit into physical memory";

// Question 85
        questions[84][0] = "Which of the following describes 'time-sharing' systems?";
        questions[84][1] = "Multiple users can interact with the system simultaneously";
        questions[84][2] = "It provides real-time response to users";
        questions[84][3] = "It uses batch processing techniques";
        questions[84][4] = "It runs only one program at a time";
        answers[84][0] = "Multiple users can interact with the system simultaneously";

// Question 86
        questions[85][0] = "Which scheduling algorithm minimizes the average waiting time?";
        questions[85][1] = "Shortest Job First (SJF)";
        questions[85][2] = "First-Come, First-Served (FCFS)";
        questions[85][3] = "Round Robin (RR)";
        questions[85][4] = "Priority Scheduling";
        answers[85][0] = "Shortest Job First (SJF)";

// Question 87
        questions[86][0] = "What is the function of a 'critical section' in process synchronization?";
        questions[86][1] = "A section of code where shared resources are accessed";
        questions[86][2] = "A system call that terminates a process";
        questions[86][3] = "A part of the operating system's memory";
        questions[86][4] = "A special file in the file system";
        answers[86][0] = "A section of code where shared resources are accessed";

// Question 88
        questions[87][0] = "What is the purpose of 'semaphores' in an operating system?";
        questions[87][1] = "To solve process synchronization problems";
        questions[87][2] = "To allocate memory to processes";
        questions[87][3] = "To manage network connections";
        questions[87][4] = "To handle disk I/O operations";
        answers[87][0] = "To solve process synchronization problems";

// Question 89
        questions[88][0] = "What is 'DMA' (Direct Memory Access) used for in an operating system?";
        questions[88][1] = "To allow devices to transfer data to/from memory without CPU involvement";
        questions[88][2] = "To allocate virtual memory";
        questions[88][3] = "To perform context switching";
        questions[88][4] = "To handle file management";
        answers[88][0] = "To allow devices to transfer data to/from memory without CPU involvement";

// Question 90
        questions[89][0] = "Which of the following is a benefit of using a microkernel over a monolithic kernel?";
        questions[89][1] = "Better system modularity and easier maintenance";
        questions[89][2] = "Faster CPU scheduling";
        questions[89][3] = "Increased hardware compatibility";
        questions[89][4] = "Larger memory footprint";
        answers[89][0] = "Better system modularity and easier maintenance";

// Question 91
        questions[90][0] = "Which of the following is a valid use of 'interrupts' in an operating system?";
        questions[90][1] = "To handle asynchronous events such as I/O completion";
        questions[90][2] = "To allocate memory to processes";
        questions[90][3] = "To manage the file system";
        questions[90][4] = "To switch between user and kernel mode";
        answers[90][0] = "To handle asynchronous events such as I/O completion";

// Question 92
        questions[91][0] = "What is the purpose of the 'bootloader' in an operating system?";
        questions[91][1] = "To load the operating system into memory during startup";
        questions[91][2] = "To manage memory allocation";
        questions[91][3] = "To provide a user interface";
        questions[91][4] = "To handle CPU scheduling";
        answers[91][0] = "To load the operating system into memory during startup";

// Question 93
        questions[92][0] = "What is 'preemptive multitasking' in an operating system?";
        questions[92][1] = "A technique where the operating system can interrupt running processes to assign CPU time to others";
        questions[92][2] = "A method for running programs in the background";
        questions[92][3] = "A way to allocate more memory to processes";
        questions[92][4] = "A method for improving disk I/O performance";
        answers[92][0] = "A technique where the operating system can interrupt running processes to assign CPU time to others";

// Question 94
        questions[93][0] = "Which of the following is NOT a type of memory management?";
        questions[93][1] = "Segmentation";
        questions[93][2] = "Virtual memory";
        questions[93][3] = "Paging";
        questions[93][4] = "Context switching";
        answers[93][0] = "Context switching";

// Question 95
        questions[94][0] = "Which of the following is an advantage of 'multithreading' in operating systems?";
        questions[94][1] = "Efficient CPU utilization by allowing multiple threads within a single process";
        questions[94][2] = "Increased memory allocation for each thread";
        questions[94][3] = "Faster disk I/O operations";
        questions[94][4] = "Improved file system performance";
        answers[94][0] = "Efficient CPU utilization by allowing multiple threads within a single process";

// Question 96
        questions[95][0] = "Which of the following is the key difference between 'hard' and 'soft' real-time operating systems?";
        questions[95][1] = "Hard real-time systems guarantee deadlines, while soft real-time systems allow deadline misses";
        questions[95][2] = "Soft real-time systems handle more users";
        questions[95][3] = "Hard real-time systems use paging, soft real-time systems do not";
        questions[95][4] = "Soft real-time systems handle network I/O better";
        answers[95][0] = "Hard real-time systems guarantee deadlines, while soft real-time systems allow deadline misses";

// Question 97
        questions[96][0] = "Which of the following is a key feature of a distributed operating system?";
        questions[96][1] = "It manages a group of independent computers and makes them appear as a single system";
        questions[96][2] = "It only runs on a single computer";
        questions[96][3] = "It provides real-time processing";
        questions[96][4] = "It runs on embedded systems only";
        answers[96][0] = "It manages a group of independent computers and makes them appear as a single system";

// Question 98
        questions[97][0] = "Which of the following is an advantage of 'priority scheduling'?";
        questions[97][1] = "Important processes get more CPU time";
        questions[97][2] = "Prevents process starvation";
        questions[97][3] = "Ensures high throughput";
        questions[97][4] = "Reduces memory usage";
        answers[97][0] = "Important processes get more CPU time";

// Question 99
        questions[98][0] = "What is the purpose of 'interrupt handling' in an operating system?";
        questions[98][1] = "To manage the CPU's response to asynchronous events";
        questions[98][2] = "To switch between kernel and user mode";
        questions[98][3] = "To manage memory allocation";
        questions[98][4] = "To handle file system operations";
        answers[98][0] = "To manage the CPU's response to asynchronous events";

    }

    public String[][] getQuestions() {
        return questions;
    }

    public String[][] getAnswers() {
        return answers;
    }
}





