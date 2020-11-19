select distinct u.name,
    u.address
from users u,
    bookingdetails b
where u.user_id = b.user_id
    and u.user_id not in (
        select user_id
        from bookingdetails
        where name = "HDFC"
    )
order by u.name;