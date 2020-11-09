create table train
(
    train_number int,
    train_name   varchar(30),
    source       varchar(30),
    destination  varchar(30),
    ac1          int,
    ac2          int,
    ac3          int,
    sleeper      int,
    seater       int
);

desc train;

insert into train
values (13005, "Dehradun Mail", "Howrah", "Dehradun", 3, 0, 3, 5, 0),
       (13009, "Doon Express", "Howrah", "Dehradun", 5, 5, 10, 0, 0),
       (22119, "Pune Express", "Mumbai", "Pune", 3, 0, 0, 10, 5),
       (12123, "Deccan Queen", "Mumbai", "Pune", 0, 7, 0, 5, 0),
       (15635, "Dwarka Express", "Okha", "Guwahati", 0, 0, 0, 11, 6),
       (51422, "Mumbai Pune Passenger", "Mumbai", "Pune", 0, 0, 0, 0, 21),
       (14645, "Shalimar Express", "Delhi", "Jammu Tawi", 0, 8, 7, 0, 2);

select * from train;

select *
from train
where source = "Mumbai"
and destination = "Pune"
and sleeper > 0
order by train_number;