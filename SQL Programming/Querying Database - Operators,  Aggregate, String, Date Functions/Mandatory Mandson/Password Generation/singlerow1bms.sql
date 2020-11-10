select name,
    concat(left(name, 3), left(phno, 3)) as `PASSWORD`
from users
order by name;