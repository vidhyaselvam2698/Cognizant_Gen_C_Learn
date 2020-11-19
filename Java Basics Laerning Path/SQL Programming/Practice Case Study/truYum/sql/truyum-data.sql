insert into menu_item
values ("Sandwich", 99.00, true, '2017-03-15', 'Main Course', true),
       ("Burger", 129.00, true, '2017-12-23', 'Main Course', false),
       ("Pizza", 149.00, true, '2017-08-21', 'Main Course', false),
       ("French Fries", 57.00, false, '2017-07-02', 'Starters', true),
       ("Chocolate Brownie", 32.00, false, '2022-11-02', 'Dessert', true);

select * from menu_item;

select *
from menu_item
where date_of_lunch >= current_date();