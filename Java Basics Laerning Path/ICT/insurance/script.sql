drop database if exists Insurance;

create database Insurance;

use Insurance;

create table Policy_Details
(
    policy_id              varchar(25) primary key,
    total_coverage         double(10, 2),
    balance_premium        double(10, 2),
    premium_duration_years int
);

insert into Policy_Details
values ('2005H37012', 100000, 100000, 15);
insert into Policy_Details
values ('2006H37013', 100000, 85000, 20);
insert into Policy_Details
values ('2007H37014', 150000, 150000, 25);
insert into Policy_Details
values ('2008H37015', 250000, 150000, 10);
insert into Policy_Details
values ('2009H37016', 800000, 75000, 30);

select *
from Policy_Details;

truncate Policy_Details;

COMMIT;