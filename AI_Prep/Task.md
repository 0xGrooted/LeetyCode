Level 1: Warm-ups (Basic Loops & Filtering)

Goal: Get comfortable with iteration, conditions, and small transformations.

Filter Even Numbers

Given a list of integers, return only the even numbers.
Example: [1,2,3,4,5,6] → [2,4,6]

Count Positives

Given a list of integers, count how many are positive.
Example: [1,-3,5,0,4] → 3

Filter by Field

You’re given a list of Person objects with {name, age}.
Return a list of names for people age ≥ 18.

Sum of Squares

Given [1,2,3,4], return the sum of squares of even numbers.
Example: 2² + 4² = 20

🟡 Level 2: Sorting and Aggregation

Goal: Work with maps/dictionaries and sorting logic.

Word Frequency Counter

Given a string like "apple banana apple orange banana apple",
return a frequency map:
{apple: 3, banana: 2, orange: 1}

Bonus: Return the word with the highest frequency.

Sort by Field

Given a list of {name, score}, return the list sorted by descending score.

Top N Elements

From a list of numbers, return the top 3 largest numbers.
Example: [10, 4, 7, 2, 9, 12] → [12,10,9]

Filter + Sort Combo

From a list of {name, age}, return people age ≥ 21, sorted by age ascending.

🔵 Level 3: Light Data Structures

Goal: Apply logic with sets, maps, and sliding windows.

Remove Duplicates

Given [3,1,4,1,5,9,3], return a list with duplicates removed while keeping order.
→ [3,1,4,5,9]

Intersection of Two Lists

Given two arrays, return a list of elements present in both.
Example: [1,2,3,4] and [3,4,5,6] → [3,4]

Longest Subarray with ≤ k Zeroes

Classic sliding window: given [1,1,0,0,1,1,1,0], and k=2,
return the length of the longest subarray containing only 1s after flipping at most k zeros.

Group by Key

Given a list of {department, employeeName},
return a mapping of department → list of employees.

🔴 Level 4: Realistic “Data Processing” Scenarios

Goal: Combine filtering, sorting, and grouping — like you might in a guided interview.

Filter and Rank Students

Input: list of {name, score, passed}.

Return names of students who passed, sorted by score descending.

Sales Data Summary

Given transactions: {product, quantity, price}
Compute total revenue per product (quantity × price) and return a sorted list of (product, revenue) by highest revenue.

Active Users

Given a list of {userId, lastLoginDate},
filter users who logged in within the last 30 days (you can assume “today” = some constant date),
then sort them by most recent login.

Detect Duplicates

Given a list of emails, return all emails that appear more than once.

🧩 Bonus Challenge (Simulates a Real “Guided Problem”)

Movie Ratings Analyzer

Input: list of {movieTitle, rating} (rating = 1–10).

Task:

Compute the average rating per movie.

Return the top 3 movies by average rating.

(Optional) Handle ties alphabetically.