select order_date,
    sum(order_amount) as `TOTAL_SALE`
from orders
group by order_date asc;