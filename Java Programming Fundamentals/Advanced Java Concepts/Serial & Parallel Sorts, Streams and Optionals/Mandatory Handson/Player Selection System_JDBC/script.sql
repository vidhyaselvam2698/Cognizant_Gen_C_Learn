create table player
(
    playerId   int,
    playerName varchar(30),
    height     double(6, 2),
    weight     double(6, 2)
);

desc player;

insert into player
values (7507, "Savannah", 172, 66),
       (4588, "Julian", 152, 50),
       (324, "Jacob", 115, 47),
       (45, "Thomas", 164, 65),
       (7542, "Charles", 107, 49),
       (565, "Maya", 125, 50),
       (2458, "Natalie", 140, 59),
       (1237, "Daisy", 150, 59);

select * from player;

select playerName
from player
where height >= 140
and weight <= 65
order by  playerName;