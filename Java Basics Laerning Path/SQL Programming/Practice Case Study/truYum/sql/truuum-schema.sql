create table menu_item
(
    name varchar(50),
    price double(5, 2),
    active boolean,
    date_of_lunch date,
    category enum('Main Course', 'Starters', 'Dessert', 'Drinks'),
    free_delivery boolean
);