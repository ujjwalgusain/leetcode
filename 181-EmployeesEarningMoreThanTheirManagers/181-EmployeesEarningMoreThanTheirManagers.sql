-- Last updated: 8/20/2026, 1:43:08 PM
# Write your MySQL query statement below
SELECT emp1.name as Employee
FROM Employee emp1
JOIN Employee emp2
ON emp1.managerId = emp2.id
AND emp1.salary > emp2.salary