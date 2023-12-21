/*
Learn dsa with me!
First i start by learning BIG O


Start day December 19, started by 1:05 am

Big O intro
What is BIG O, accoridng to me Big 0 is comparing 2 code mathematically and about how efficient they run

Example, Lets say we have a stop watch that is suppose to run for 15 sec, we have 2 code code 1 and 2 , code 1 runs for 15 sec while code 2 runs for much longer time, i wouuld say Code 1 is better becasue its mesurable and this is called time complexite, note that it is not mesured in time, because if u took the code and run it on a computer that runs twice as fast it will complete  2x faster why? not because of the code but because of the laptop, mesured in the number of operation that it takes to complete something , now space complexity  lets say u take the code1, while it runs very fast , it takes up a lot of memoey and we take code 2 even tho that take longer time , it takes up lesser memoery


Big O : Worst case
omega(Ω), theta(Θ) and (omacron( known as 0 as in Big o))

so let's say we have an array of 1234567

so if we are looking at how many times we have to run the for loop,
the best case is looking for number 1 , worse case is number 7 and average case will be if we are loooking for number 4, so for the best case looking for number 1, we use omega, for the avearge case we use theta and for the worse coase we use big o or also known as omacron , Big 0 is always worse case

BIG O: 0(n)


so o(n2) is a loop within a loop
o(n) is proportional
0(logn) divide and concqur
o(1) constant














SUMMARY NOTE
Big O Basic Concepts:
• O(1): Constant Time
• Doesn't depend on the size of the data set.
• Example: Accessing an array element by its index.
• O(log n): Logarithmic Time
• Splits the data in each step (divide and conquer).
• Example: Binary search.
• O(n): Linear Time
• Directly proportional to the data set size.
• Example: Looping through an array.
• O(n log n): Linearithmic Time
• Splits and sorts or searches data.
• Example: Merge sort, quick sort.
• O(n2
): Polynomial Time
• Nested loops for each power of n.
• Example: Bubble sort (O(n2
)).
Omega (Ω) – Best Case
• What it means: Omega (Ω) describes the best-case scenario for an algorithm.
• In simple terms: It tells you the fastest an algorithm can run in the best
circumstances.
Theta (Θ) - Average Case
• In simple terms: It tells you what to generally expect in terms of time complexity.
Big O (O) - Worst Case
• What it means: Big O (O) describes the worst-case scenario for an algorithm.
• In simple terms: It tells you the slowest an algorithm can run in the worst
circumstances.
Useful Tips
• Drop Non-Dominant Terms
• In O(n2 + n), focus on O(n2)
 as it will dominate for large n.
• Drop Constants
• O(2n) simplifies to O(n).



 */