public class DSAQuestions implements Questions {
    private String[][] questions;
    private String[][] answers;

    public DSAQuestions() {
        questions = new String[100][5];
        answers = new String[100][1];

        // Question 1
        questions[0][0] = "What is the time complexity of binary search in the worst case?";
        questions[0][1] = "O(n)";
        questions[0][2] = "O(log n)";
        questions[0][3] = "O(n^2)";
        questions[0][4] = "O(1)";
        answers[0][0] = "O(log n)";

// Question 2
        questions[1][0] = "Which of the following data structures is a LIFO structure?";
        questions[1][1] = "Queue";
        questions[1][2] = "Stack";
        questions[1][3] = "Binary Tree";
        questions[1][4] = "Linked List";
        answers[1][0] = "Stack";

// Question 3
        questions[2][0] = "Which of the following is NOT a characteristic of dynamic programming?";
        questions[2][1] = "Optimal substructure";
        questions[2][2] = "Overlapping subproblems";
        questions[2][3] = "Memoization";
        questions[2][4] = "Greedy choice";
        answers[2][0] = "Greedy choice";

// Question 4
        questions[3][0] = "What is the height of a balanced binary search tree (BST) with n nodes?";
        questions[3][1] = "O(n)";
        questions[3][2] = "O(log n)";
        questions[3][3] = "O(n^2)";
        questions[3][4] = "O(1)";
        answers[3][0] = "O(log n)";

// Question 5
        questions[4][0] = "Which of the following algorithms is used to find the shortest path in a graph?";
        questions[4][1] = "Kruskal's Algorithm";
        questions[4][2] = "Dijkstra's Algorithm";
        questions[4][3] = "Prim's Algorithm";
        questions[4][4] = "Depth-First Search";
        answers[4][0] = "Dijkstra's Algorithm";

// Question 6
        questions[5][0] = "Which of the following data structures can be used to implement a priority queue?";
        questions[5][1] = "Heap";
        questions[5][2] = "Stack";
        questions[5][3] = "Linked List";
        questions[5][4] = "Hash Table";
        answers[5][0] = "Heap";

// Question 7
        questions[6][0] = "Which sorting algorithm has the best average-case time complexity?";
        questions[6][1] = "Bubble Sort";
        questions[6][2] = "Insertion Sort";
        questions[6][3] = "Quick Sort";
        questions[6][4] = "Merge Sort";
        answers[6][0] = "Merge Sort";

// Question 8
        questions[7][0] = "What is the worst-case time complexity of Quick Sort?";
        questions[7][1] = "O(n)";
        questions[7][2] = "O(n^2)";
        questions[7][3] = "O(log n)";
        questions[7][4] = "O(n log n)";
        answers[7][0] = "O(n^2)";

// Question 9
        questions[8][0] = "Which of the following is an example of a divide-and-conquer algorithm?";
        questions[8][1] = "Merge Sort";
        questions[8][2] = "Bubble Sort";
        questions[8][3] = "Linear Search";
        questions[8][4] = "Insertion Sort";
        answers[8][0] = "Merge Sort";

// Question 10
        questions[9][0] = "What is the time complexity of inserting an element into a max-heap?";
        questions[9][1] = "O(n)";
        questions[9][2] = "O(log n)";
        questions[9][3] = "O(1)";
        questions[9][4] = "O(n log n)";
        answers[9][0] = "O(log n)";

// Question 11
        questions[10][0] = "In a linked list, what is the time complexity of accessing the kth element?";
        questions[10][1] = "O(n)";
        questions[10][2] = "O(log n)";
        questions[10][3] = "O(1)";
        questions[10][4] = "O(n^2)";
        answers[10][0] = "O(n)";

// Question 12
        questions[11][0] = "Which of the following algorithms is NOT used for finding minimum spanning trees?";
        questions[11][1] = "Kruskal's Algorithm";
        questions[11][2] = "Prim's Algorithm";
        questions[11][3] = "Boruvka's Algorithm";
        questions[11][4] = "Bellman-Ford Algorithm";
        answers[11][0] = "Bellman-Ford Algorithm";

// Question 13
        questions[12][0] = "What is the best data structure to check for duplicates in an array?";
        questions[12][1] = "Stack";
        questions[12][2] = "Queue";
        questions[12][3] = "Hash Set";
        questions[12][4] = "Linked List";
        answers[12][0] = "Hash Set";

// Question 14
        questions[13][0] = "Which of the following traversals is used to print nodes in a binary search tree in ascending order?";
        questions[13][1] = "Pre-order";
        questions[13][2] = "In-order";
        questions[13][3] = "Post-order";
        questions[13][4] = "Level-order";
        answers[13][0] = "In-order";

// Question 15
        questions[14][0] = "What is the space complexity of a depth-first search (DFS) on a graph?";
        questions[14][1] = "O(n)";
        questions[14][2] = "O(n + m)";
        questions[14][3] = "O(log n)";
        questions[14][4] = "O(1)";
        answers[14][0] = "O(n)";

// Question 16
        questions[15][0] = "What is the primary difference between a binary tree and a binary search tree (BST)?";
        questions[15][1] = "BST stores keys in sorted order";
        questions[15][2] = "Binary trees have fixed height";
        questions[15][3] = "BSTs allow duplicates";
        questions[15][4] = "Binary trees have two children";
        answers[15][0] = "BST stores keys in sorted order";

// Question 17
        questions[16][0] = "Which of the following is true for a balanced binary tree?";
        questions[16][1] = "The heights of the left and right subtrees of every node differ by at most one";
        questions[16][2] = "All nodes have two children";
        questions[16][3] = "The tree is a complete binary tree";
        questions[16][4] = "It is a binary search tree";
        answers[16][0] = "The heights of the left and right subtrees of every node differ by at most one";

// Question 18
        questions[17][0] = "What is the time complexity of searching in a hash table with collisions resolved by chaining?";
        questions[17][1] = "O(1)";
        questions[17][2] = "O(log n)";
        questions[17][3] = "O(n)";
        questions[17][4] = "O(n log n)";
        answers[17][0] = "O(1)";

// Question 19
        questions[18][0] = "Which of the following is a characteristic of the greedy algorithm?";
        questions[18][1] = "It makes local optimum choices at each stage";
        questions[18][2] = "It solves problems with overlapping subproblems";
        questions[18][3] = "It uses backtracking";
        questions[18][4] = "It avoids recursion";
        answers[18][0] = "It makes local optimum choices at each stage";

// Question 20
        questions[19][0] = "Which data structure is ideal for implementing a breadth-first search (BFS)?";
        questions[19][1] = "Stack";
        questions[19][2] = "Queue";
        questions[19][3] = "Binary Tree";
        questions[19][4] = "Hash Map";
        answers[19][0] = "Queue";

// Question 21
        questions[20][0] = "Which of the following is NOT a self-balancing binary search tree?";
        questions[20][1] = "Red-Black Tree";
        questions[20][2] = "AVL Tree";
        questions[20][3] = "B-Tree";
        questions[20][4] = "Binary Heap";
        answers[20][0] = "Binary Heap";

// Question 22
        questions[21][0] = "What is the worst-case time complexity of the Bubble Sort algorithm?";
        questions[21][1] = "O(n)";
        questions[21][2] = "O(n log n)";
        questions[21][3] = "O(n^2)";
        questions[21][4] = "O(log n)";
        answers[21][0] = "O(n^2)";

// Question 23
        questions[22][0] = "Which data structure is used to implement recursion in most programming languages?";
        questions[22][1] = "Queue";
        questions[22][2] = "Stack";
        questions[22][3] = "Array";
        questions[22][4] = "Tree";
        answers[22][0] = "Stack";

// Question 24
        questions[23][0] = "What is the time complexity of deleting an element from a linked list in the worst case?";
        questions[23][1] = "O(n)";
        questions[23][2] = "O(log n)";
        questions[23][3] = "O(1)";
        questions[23][4] = "O(n^2)";
        answers[23][0] = "O(n)";

// Question 25
        questions[24][0] = "Which of the following algorithms is used to find strongly connected components in a graph?";
        questions[24][1] = "Kosaraju's Algorithm";
        questions[24][2] = "Bellman-Ford Algorithm";
        questions[24][3] = "Kruskal's Algorithm";
        questions[24][4] = "Floyd-Warshall Algorithm";
        answers[24][0] = "Kosaraju's Algorithm";

// Question 26
        questions[25][0] = "Which traversal technique is used in a depth-first search (DFS) of a graph?";
        questions[25][1] = "Level-order traversal";
        questions[25][2] = "Pre-order traversal";
        questions[25][3] = "In-order traversal";
        questions[25][4] = "Post-order traversal";
        answers[25][0] = "Pre-order traversal";

// Question 27
        questions[26][0] = "What is the advantage of a doubly linked list over a singly linked list?";
        questions[26][1] = "Nodes can be traversed in both directions";
        questions[26][2] = "It requires less memory";
        questions[26][3] = "It is faster for insertion and deletion";
        questions[26][4] = "It has a more compact structure";
        answers[26][0] = "Nodes can be traversed in both directions";

// Question 28
        questions[27][0] = "Which of the following is NOT a characteristic of a heap data structure?";
        questions[27][1] = "It is a complete binary tree";
        questions[27][2] = "It is used to implement priority queues";
        questions[27][3] = "The root node is always the smallest or largest element";
        questions[27][4] = "It allows efficient random access to elements";
        answers[27][0] = "It allows efficient random access to elements";

// Question 29
        questions[28][0] = "Which of the following techniques is used in dynamic programming?";
        questions[28][1] = "Memoization";
        questions[28][2] = "Backtracking";
        questions[28][3] = "Branch and Bound";
        questions[28][4] = "Divide and Conquer";
        answers[28][0] = "Memoization";

// Question 30
        questions[29][0] = "Which of the following algorithms is used for topological sorting in a directed acyclic graph?";
        questions[29][1] = "Kahn's Algorithm";
        questions[29][2] = "Depth-First Search";
        questions[29][3] = "Bellman-Ford Algorithm";
        questions[29][4] = "Prim's Algorithm";
        answers[29][0] = "Kahn's Algorithm";

// Question 31
        questions[30][0] = "What is the time complexity of inserting an element into a hash table in the average case?";
        questions[30][1] = "O(1)";
        questions[30][2] = "O(n)";
        questions[30][3] = "O(log n)";
        questions[30][4] = "O(n^2)";
        answers[30][0] = "O(1)";

// Question 32
        questions[31][0] = "Which data structure is best suited for implementing a LRU (Least Recently Used) cache?";
        questions[31][1] = "Queue and Hash Map";
        questions[31][2] = "Stack and Heap";
        questions[31][3] = "Linked List and Stack";
        questions[31][4] = "Binary Tree and Queue";
        answers[31][0] = "Queue and Hash Map";

// Question 33
        questions[32][0] = "What is the space complexity of a breadth-first search (BFS) on a graph?";
        questions[32][1] = "O(n)";
        questions[32][2] = "O(n + m)";
        questions[32][3] = "O(log n)";
        questions[32][4] = "O(1)";
        answers[32][0] = "O(n + m)";

// Question 34
        questions[33][0] = "Which sorting algorithm is stable and works in O(n) time when the range of input is known?";
        questions[33][1] = "Quick Sort";
        questions[33][2] = "Merge Sort";
        questions[33][3] = "Counting Sort";
        questions[33][4] = "Heap Sort";
        answers[33][0] = "Counting Sort";

// Question 35
        questions[34][0] = "Which data structure is used to detect cycles in a graph?";
        questions[34][1] = "Disjoint Set";
        questions[34][2] = "Stack";
        questions[34][3] = "Queue";
        questions[34][4] = "Binary Tree";
        answers[34][0] = "Disjoint Set";

// Question 36
        questions[35][0] = "Which of the following is true for a complete binary tree?";
        questions[35][1] = "All levels are completely filled except possibly for the last level";
        questions[35][2] = "It is a binary search tree";
        questions[35][3] = "It is balanced";
        questions[35][4] = "All levels have the same number of nodes";
        answers[35][0] = "All levels are completely filled except possibly for the last level";

// Question 37
        questions[36][0] = "What is the time complexity of finding the minimum element in a min-heap?";
        questions[36][1] = "O(n)";
        questions[36][2] = "O(1)";
        questions[36][3] = "O(log n)";
        questions[36][4] = "O(n log n)";
        answers[36][0] = "O(1)";

// Question 38
        questions[37][0] = "Which of the following is an application of a graph data structure?";
        questions[37][1] = "Shortest path algorithms";
        questions[37][2] = "Sorting";
        questions[37][3] = "Searching";
        questions[37][4] = "Binary Search Tree";
        answers[37][0] = "Shortest path algorithms";

// Question 39
        questions[38][0] = "Which of the following is a limitation of the array data structure?";
        questions[38][1] = "Fixed size";
        questions[38][2] = "Insertion is O(1)";
        questions[38][3] = "Access is O(1)";
        questions[38][4] = "Random access is allowed";
        answers[38][0] = "Fixed size";

// Question 40
        questions[39][0] = "Which of the following algorithms is NOT used for graph traversal?";
        questions[39][1] = "Breadth-First Search";
        questions[39][2] = "Depth-First Search";
        questions[39][3] = "A* Algorithm";
        questions[39][4] = "Dijkstra's Algorithm";
        answers[39][0] = "A* Algorithm";

// Question 41
        questions[40][0] = "What is the time complexity of searching for an element in a balanced binary search tree?";
        questions[40][1] = "O(n)";
        questions[40][2] = "O(log n)";
        questions[40][3] = "O(n^2)";
        questions[40][4] = "O(1)";
        answers[40][0] = "O(log n)";

// Question 42
        questions[41][0] = "What is the purpose of the 'reheapify' process in a heap?";
        questions[41][1] = "To restore the heap property after insertion or deletion";
        questions[41][2] = "To balance the heap";
        questions[41][3] = "To remove the root element";
        questions[41][4] = "To find the maximum or minimum element";
        answers[41][0] = "To restore the heap property after insertion or deletion";

// Question 43
        questions[42][0] = "Which of the following data structures is best for implementing a circular queue?";
        questions[42][1] = "Array";
        questions[42][2] = "Stack";
        questions[42][3] = "Linked List";
        questions[42][4] = "Heap";
        answers[42][0] = "Array";

// Question 44
        questions[43][0] = "What is the time complexity of merging two sorted linked lists?";
        questions[43][1] = "O(n)";
        questions[43][2] = "O(n log n)";
        questions[43][3] = "O(1)";
        questions[43][4] = "O(n^2)";
        answers[43][0] = "O(n)";

// Question 45
        questions[44][0] = "What is a skip list used for?";
        questions[44][1] = "To provide faster search in a sorted linked list";
        questions[44][2] = "To implement recursion";
        questions[44][3] = "To perform binary search";
        questions[44][4] = "To balance a binary search tree";
        answers[44][0] = "To provide faster search in a sorted linked list";

// Question 46
        questions[45][0] = "Which of the following algorithms solves the all-pairs shortest path problem?";
        questions[45][1] = "Floyd-Warshall Algorithm";
        questions[45][2] = "Dijkstra's Algorithm";
        questions[45][3] = "Kruskal's Algorithm";
        questions[45][4] = "Bellman-Ford Algorithm";
        answers[45][0] = "Floyd-Warshall Algorithm";

// Question 47
        questions[46][0] = "What is the height of an AVL tree with n nodes?";
        questions[46][1] = "O(n)";
        questions[46][2] = "O(log n)";
        questions[46][3] = "O(n log n)";
        questions[46][4] = "O(1)";
        answers[46][0] = "O(log n)";

// Question 48
        questions[47][0] = "What is the advantage of a B-Tree over a binary search tree?";
        questions[47][1] = "It is more space efficient";
        questions[47][2] = "It provides better time complexity for searching large datasets";
        questions[47][3] = "It allows duplicates";
        questions[47][4] = "It supports dynamic resizing";
        answers[47][0] = "It provides better time complexity for searching large datasets";

// Question 49
        questions[48][0] = "What is the time complexity of building a heap from an unsorted array?";
        questions[48][1] = "O(n)";
        questions[48][2] = "O(n log n)";
        questions[48][3] = "O(n^2)";
        questions[48][4] = "O(log n)";
        answers[48][0] = "O(n)";

// Question 50
        questions[49][0] = "What is the purpose of a sentinel node in a linked list?";
        questions[49][1] = "To mark the beginning or end of the list";
        questions[49][2] = "To provide faster search";
        questions[49][3] = "To act as a head node";
        questions[49][4] = "To implement recursion";
        answers[49][0] = "To mark the beginning or end of the list";

        questions[50][0] = "Which of the following is the correct way to implement a single inheritance in C++?";
        questions[50][1] = "class Derived : public Base {};";
        questions[50][2] = "class Derived extends Base {};";
        questions[50][3] = "class Derived inherits Base {};";
        questions[50][4] = "class Derived : Base {};";
        answers[50][0] = "class Derived : public Base {};";

        questions[51][0] = "Which of the following is the correct way to overload the '+' operator in C++?";
        questions[51][1] = "MyClass operator+(const MyClass& other);";
        questions[51][2] = "MyClass overload+(const MyClass& other);";
        questions[51][3] = "MyClass operator_overload+(const MyClass& other);";
        questions[51][4] = "MyClass op+(const MyClass& other);";
        answers[51][0] = "MyClass operator+(const MyClass& other);";

        questions[52][0] = "Which of the following is the correct way to declare a lambda function in C++?";
        questions[52][1] = "auto func = []() {};";
        questions[52][2] = "lambda func = []() {};";
        questions[52][3] = "[] auto func = {};";
        questions[52][4] = "func = [] auto {};";
        answers[52][0] = "auto func = []() {};";

        questions[53][0] = "Which of the following is the correct way to use the 'auto' keyword in C++?";
        questions[53][1] = "auto var = 10;";
        questions[53][2] = "int auto var = 10;";
        questions[53][3] = "auto int var = 10;";
        questions[53][4] = "var auto = 10;";
        answers[53][0] = "auto var = 10;";

        questions[54][0] = "Which of the following is the correct way to use the 'nullptr' keyword in C++?";
        questions[54][1] = "int* ptr = nullptr;";
        questions[54][2] = "int* ptr = NULL;";
        questions[54][3] = "int* ptr = 0;";
        questions[54][4] = "int* ptr = nil;";
        answers[54][0] = "int* ptr = nullptr;";

        questions[55][0] = "Which of the following is the correct way to declare a unique pointer in C++?";
        questions[55][1] = "std::unique_ptr<int> ptr = std::make_unique<int>(10);";
        questions[55][2] = "std::unique_ptr<int> ptr = std::make_unique<int>(10);";
        questions[55][3] = "std::unique<int> ptr = make_unique<int>(10);";
        questions[55][4] = "unique_ptr<int> ptr = make_unique<int>(10);";
        answers[55][0] = "std::unique_ptr<int> ptr = std::make_unique<int>(10);";

        questions[56][0] = "Which of the following is the correct way to declare a shared pointer in C++?";
        questions[56][1] = "std::shared_ptr<int> ptr = std::make_shared<int>(10);";
        questions[56][2] = "std::shared<int> ptr = make_shared<int>(10);";
        questions[56][3] = "shared_ptr<int> ptr = make_shared<int>(10);";
        questions[56][4] = "std::shared_ptr<int> ptr = make_shared<int>(10);";
        answers[56][0] = "std::shared_ptr<int> ptr = std::make_shared<int>(10);";

        questions[57][0] = "Which of the following is the correct way to declare a weak pointer in C++?";
        questions[57][1] = "std::weak_ptr<int> ptr = std::shared_ptr<int>(new int(10));";
        questions[57][2] = "std::weak<int> ptr = weak_ptr<int>(new int(10));";
        questions[57][3] = "weak_ptr<int> ptr = shared_ptr<int>(new int(10));";
        questions[57][4] = "std::weak_ptr<int> ptr = std::make_shared<int>(10);";
        answers[57][0] = "std::weak_ptr<int> ptr = std::shared_ptr<int>(new int(10));";

        questions[58][0] = "Which of the following is the correct way to use the 'std::move' function in C++?";
        questions[58][1] = "std::string str = std::move(otherStr);";
        questions[58][2] = "std::string str = move(otherStr);";
        questions[58][3] = "std::string str = std::move(otherStr);";
        questions[58][4] = "std::string str = std::move<int>(otherStr);";
        answers[58][0] = "std::string str = std::move(otherStr);";

        questions[59][0] = "Which of the following is the correct way to declare a noexcept function in C++?";
        questions[59][1] = "void myFunction() noexcept;";
        questions[59][2] = "noexcept void myFunction();";
        questions[59][3] = "void noexcept myFunction();";
        questions[59][4] = "void myFunction() noexcept() {}";
        answers[59][0] = "void myFunction() noexcept;";

        questions[60][0] = "Which of the following is the correct way to use the 'decltype' keyword in C++?";
        questions[60][1] = "decltype(var) newVar;";
        questions[60][2] = "decltype(var) newVar = var;";
        questions[60][3] = "decltype(var) var newVar;";
        questions[60][4] = "decltype(var) = newVar;";
        answers[60][0] = "decltype(var) newVar;";

        questions[61][0] = "Which of the following is the correct way to use the 'static_assert' keyword in C++?";
        questions[61][1] = "static_assert(condition, \"error message\");";
        questions[61][2] = "static_assert \"error message\";";
        questions[61][3] = "assert_static(condition, \"error message\");";
        questions[61][4] = "static_assert(condition);";
        answers[61][0] = "static_assert(condition, \"error message\");";

        questions[62][0] = "Which of the following is the correct way to use the 'constexpr' keyword in C++?";
        questions[62][1] = "constexpr int myConst = 10;";
        questions[62][2] = "const int myConst = 10;";
        questions[62][3] = "constexpr int myConst;";
        questions[62][4] = "int constexpr myConst = 10;";
        answers[62][0] = "constexpr int myConst = 10;";

        questions[63][0] = "Which of the following is the correct way to use the 'std::array' container in C++?";
        questions[63][1] = "std::array<int, 10> arr;";
        questions[63][2] = "std::array<int> arr;";
        questions[63][3] = "std::array arr(10);";
        questions[63][4] = "std::array<int, 10> arr[10];";
        answers[63][0] = "std::array<int, 10> arr;";

        questions[64][0] = "Which of the following is the correct way to declare a multithreaded program in C++?";
        questions[64][1] = "#include <thread>";
        questions[64][2] = "#include <threads>";
        questions[64][3] = "#include <pthread>";
        questions[64][4] = "#include <multi_thread>";
        answers[64][0] = "#include <thread>";

        questions[65][0] = "Which of the following is the correct way to declare a mutex in C++?";
        questions[65][1] = "std::mutex mtx;";
        questions[65][2] = "std::mutex mtx();";
        questions[65][3] = "mutex mtx;";
        questions[65][4] = "mutex mtx();";
        answers[65][0] = "std::mutex mtx;";

        questions[66][0] = "Which of the following is the correct way to lock a mutex in C++?";
        questions[66][1] = "mtx.lock();";
        questions[66][2] = "lock(mtx);";
        questions[66][3] = "mtx.lock;";
        questions[66][4] = "lock(mtx);";
        answers[66][0] = "mtx.lock();";

        questions[67][0] = "Which of the following is the correct way to declare a condition variable in C++?";
        questions[67][1] = "std::condition_variable cv;";
        questions[67][2] = "condition_variable cv;";
        questions[67][3] = "std::condition cv;";
        questions[67][4] = "condition cv;";
        answers[67][0] = "std::condition_variable cv;";

        questions[68][0] = "Which of the following is the correct way to wait for a condition variable in C++?";
        questions[68][1] = "cv.wait(lock);";
        questions[68][2] = "wait(cv);";
        questions[68][3] = "cv.wait();";
        questions[68][4] = "wait(cv, lock);";
        answers[68][0] = "cv.wait(lock);";

        questions[69][0] = "Which of the following is the correct way to notify one thread waiting on a condition variable in C++?";
        questions[69][1] = "cv.notify_one();";
        questions[69][2] = "notify_one(cv);";
        questions[69][3] = "cv.notify();";
        questions[69][4] = "notify(cv);";
        answers[69][0] = "cv.notify_one();";

        questions[70][0] = "Which of the following is used to define a pure virtual function in C++?";
        questions[70][1] = "virtual void func() = 0;";
        questions[70][2] = "void virtual func() = 0;";
        questions[70][3] = "virtual void func() {};";
        questions[70][4] = "pure virtual void func();";
        answers[70][0] = "virtual void func() = 0;";

        questions[71][0] = "Which of the following is the correct way to declare a lambda function in C++?";
        questions[71][1] = "auto func = [](int x) { return x * 2; };";
        questions[71][2] = "lambda func = [](int x) { return x * 2; };";
        questions[71][3] = "lambda void func(int x) { return x * 2; };";
        questions[71][4] = "auto void func = [](int x) { return x * 2; };";
        answers[71][0] = "auto func = [](int x) { return x * 2; };";

        questions[72][0] = "Which of the following is used to perform dynamic memory allocation in C++?";
        questions[72][1] = "new";
        questions[72][2] = "malloc";
        questions[72][3] = "allocate";
        questions[72][4] = "create";
        answers[72][0] = "new";

        questions[73][0] = "Which keyword is used to declare a class in C++?";
        questions[73][1] = "class";
        questions[73][2] = "struct";
        questions[73][3] = "type";
        questions[73][4] = "new";
        answers[73][0] = "class";

        questions[74][0] = "Which of the following is the correct syntax to inherit a class publicly in C++?";
        questions[74][1] = "class Derived : public Base {};";
        questions[74][2] = "class Derived extends Base {};";
        questions[74][3] = "class Derived inherits Base {};";
        questions[74][4] = "class Derived : Base {};";
        answers[74][0] = "class Derived : public Base {};";

        questions[75][0] = "Which operator is used to access members of a class in C++?";
        questions[75][1] = ".";
        questions[75][2] = "->";
        questions[75][3] = "::";
        questions[75][4] = ":";
        answers[75][0] = ".";

        questions[76][0] = "Which of the following is the correct syntax to declare a constructor in C++?";
        questions[76][1] = "ClassName() {}";
        questions[76][2] = "void ClassName() {}";
        questions[76][3] = "constructor ClassName() {}";
        questions[76][4] = "ClassName {}";
        answers[76][0] = "ClassName() {}";

        questions[77][0] = "Which keyword is used to refer to the current instance of a class in C++?";
        questions[77][1] = "this";
        questions[77][2] = "self";
        questions[77][3] = "Me";
        questions[77][4] = "current";
        answers[77][0] = "this";

        questions[78][0] = "Which of the following is the correct way to declare a destructor in C++?";
        questions[78][1] = "~ClassName() {}";
        questions[78][2] = "destructor ClassName() {}";
        questions[78][3] = "void ~ClassName() {}";
        questions[78][4] = "void ClassName() {}";
        answers[78][0] = "~ClassName() {}";

        questions[79][0] = "Which of the following is used to perform explicit type conversion in C++?";
        questions[79][1] = "static_cast";
        questions[79][2] = "type_cast";
        questions[79][3] = "explicit_cast";
        questions[79][4] = "cast";
        answers[79][0] = "static_cast";

        questions[80][0] = "Which of the following is the correct way to define a member function outside the class definition in C++?";
        questions[80][1] = "void ClassName::funcName() {}";
        questions[80][2] = "void funcName() {}";
        questions[80][3] = "funcName() {}";
        questions[80][4] = "ClassName::funcName() {}";
        answers[80][0] = "void ClassName::funcName() {}";

        questions[81][0] = "Which of the following is the correct way to declare a friend class in C++?";
        questions[81][1] = "friend class ClassName;";
        questions[81][2] = "class friend ClassName;";
        questions[81][3] = "ClassName friend class;";
        questions[81][4] = "class ClassName friend;";
        answers[81][0] = "friend class ClassName;";

        questions[82][0] = "Which of the following is used to initialize an object in C++?";
        questions[82][1] = "constructor";
        questions[82][2] = "initializer";
        questions[82][3] = "initializer list";
        questions[82][4] = "constructor list";
        answers[82][0] = "initializer list";

        questions[83][0] = "Which of the following is used to check the size of a data type in C++?";
        questions[83][1] = "sizeof";
        questions[83][2] = "size";
        questions[83][3] = "length";
        questions[83][4] = "data_size";
        answers[83][0] = "sizeof";

        questions[84][0] = "Which of the following is the correct way to declare a template class in C++?";
        questions[84][1] = "template <typename T> class ClassName {};";
        questions[84][2] = "class ClassName<template T> {};";
        questions[84][3] = "template class ClassName<T> {};";
        questions[84][4] = "class template <T> ClassName {};";
        answers[84][0] = "template <typename T> class ClassName {};";

        questions[85][0] = "Which of the following is the correct way to declare a template function in C++?";
        questions[85][1] = "template <typename T> void functionName(T arg) {};";
        questions[85][2] = "void template functionName<T>(T arg) {};";
        questions[85][3] = "void functionName<template T>(T arg) {};";
        questions[85][4] = "template void functionName(T arg) {};";
        answers[85][0] = "template <typename T> void functionName(T arg) {};";

        questions[86][0] = "Which of the following is the correct way to declare an abstract class in C++?";
        questions[86][1] = "class AbstractClass { virtual void func() = 0; };";
        questions[86][2] = "class AbstractClass { void virtual func() = 0; };";
        questions[86][3] = "abstract class AbstractClass { void func() = 0; };";
        questions[86][4] = "class AbstractClass { abstract void func() = 0; };";
        answers[86][0] = "class AbstractClass { virtual void func() = 0; };";

        questions[87][0] = "Which of the following is used to include the contents of another file in C++?";
        questions[87][1] = "#include";
        questions[87][2] = "#define";
        questions[87][3] = "#import";
        questions[87][4] = "#source";
        answers[87][0] = "#include";

        questions[88][0] = "Which of the following is the correct way to define a namespace in C++?";
        questions[88][1] = "namespace MyNamespace {}";
        questions[88][2] = "namespace {} MyNamespace";
        questions[88][3] = "namespace MyNamespace";
        questions[88][4] = "namespace MyNamespace;";
        answers[88][0] = "namespace MyNamespace {}";

        questions[89][0] = "Which of the following is used to represent a boolean type in C++?";
        questions[89][1] = "bool";
        questions[89][2] = "boolean";
        questions[89][3] = "bool_t";
        questions[89][4] = "bit";
        answers[89][0] = "bool";

        questions[90][0] = "Which of the following is the correct way to declare an enumeration in C++?";
        questions[90][1] = "enum MyEnum { VALUE1, VALUE2 };";
        questions[90][2] = "enum MyEnum = { VALUE1, VALUE2 };";
        questions[90][3] = "enum MyEnum : int { VALUE1, VALUE2 };";
        questions[90][4] = "enum { MyEnum : int { VALUE1, VALUE2 };";
        answers[90][0] = "enum MyEnum { VALUE1, VALUE2 };";

        questions[91][0] = "Which of the following is the correct way to use a 'switch' statement in C++?";
        questions[91][1] = "switch (x) { case 1: break; default: break; }";
        questions[91][2] = "case x: break;";
        questions[91][3] = "switch (x): case 1: break; default: break;";
        questions[91][4] = "switch (x) { case 1: break; }";
        answers[91][0] = "switch (x) { case 1: break; default: break; }";

        questions[92][0] = "Which of the following is used to define a constant pointer in C++?";
        questions[92][1] = "const int *ptr;";
        questions[92][2] = "int *const ptr;";
        questions[92][3] = "const *int ptr;";
        questions[92][4] = "int const *ptr;";
        answers[92][0] = "const int *ptr;";

        questions[93][0] = "Which of the following is the correct syntax for a function pointer in C++?";
        questions[93][1] = "void (*ptr)();";
        questions[93][2] = "(*void ptr)();";
        questions[93][3] = "void (ptr)();";
        questions[93][4] = "void *ptr();";
        answers[93][0] = "void (*ptr)();";

        questions[94][0] = "Which of the following is the correct way to declare a reference to a constant in C++?";
        questions[94][1] = "const int &ref = value;";
        questions[94][2] = "int &const ref = value;";
        questions[94][3] = "const ref &int = value;";
        questions[94][4] = "ref int const = value;";
        answers[94][0] = "const int &ref = value;";

        questions[95][0] = "Which of the following is used to open a file in C++?";
        questions[95][1] = "std::ifstream";
        questions[95][2] = "std::ofstream";
        questions[95][3] = "std::fstream";
        questions[95][4] = "std::file";
        answers[95][0] = "std::fstream";

        questions[96][0] = "Which of the following is the correct syntax to read from a file in C++?";
        questions[96][1] = "file >> data;";
        questions[96][2] = "read(file, data);";
        questions[96][3] = "file.read(data);";
        questions[96][4] = "data << file;";
        answers[96][0] = "file >> data;";

        questions[97][0] = "Which of the following is used to handle file opening errors in C++?";
        questions[97][1] = "file.fail()";
        questions[97][2] = "file.bad()";
        questions[97][3] = "file.open_error()";
        questions[97][4] = "file.error()";
        answers[97][0] = "file.fail()";

        questions[98][0] = "Which header file is used to work with strings in C++?";
        questions[98][1] = "<string>";
        questions[98][2] = "<cstring>";
        questions[98][3] = "<iostream>";
        questions[98][4] = "<sstream>";
        answers[98][0] = "<string>";

        questions[99][0] = "Which of the following is the correct way to find the length of a string in C++?";
        questions[99][1] = "str.length()";
        questions[99][2] = "length(str)";
        questions[99][3] = "strlen(str)";
        questions[99][4] = "len(str)";
        answers[99][0] = "str.length()";
    }

    public String[][] getQuestions() {
        return questions;
    }

    public String[][] getAnswers() {
        return answers;
    }
}