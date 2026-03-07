<h3>Problem Overview</h3>

Given a binary string s, we can perform the following operations:

1. Rotate the string by moving the first character to the end.<br>
2. Flip a character (0 → 1 or 1 → 0).

The task is to determine the minimum number of flips required to convert the string into an alternating binary string.

An alternating string can look like: 010101... or 101010...

<h3>Approach</h3>

To efficiently consider all possible rotations:

1. Double the string (s = s + s).
This allows every possible rotation to appear as a substring of length n.

2. Track mismatches for two possible alternating patterns:

   Pattern 1 → 010101...

   Pattern 2 → 101010...

3. Use a sliding window of size n to simulate each rotation.

4. For each step:

   Add mismatch counts for the new character entering the window.<br>
   Remove mismatch counts for the character leaving the window.

5. Maintain the minimum flips required across all windows.

Maintain the minimum flips required across all windows.

<h3>Complexity</h3>

Time Complexity: O(n)

Space Complexity: O(1)

<h3>Concepts Used</h3>

1. Sliding Window <br>
2. String Rotation <br>
3. Greedy Pattern Matching 
