select s.student_name,
    d.department_name
from student s
    left join department d on s.department_id = d.department_id
where s.city = 'Coimbatore'
order by s.student_name;