# MultiThreading

This code is for Multithreading in Java

the yield() method in thread A at the iteration has relinguished its control to the thread B.
The stop()method in thread B has killed it after implementing the for loop only three times. NB: It has not reached the end of run() method.

The thread C started sleeping after executing the loop only once. When it woke up (after 1000 milliseconds) the other two threads have already completed their runs and therefore running aline

The main thread died much earlier than the other three threads.
