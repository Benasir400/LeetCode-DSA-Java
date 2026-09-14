# Write your MySQL query statement below
select w.id as id
from Weather w
join Weather d
on w.recordDate=DATE_ADD(d.recordDate,Interval 1 day)
where w.temperature > d.temperature;