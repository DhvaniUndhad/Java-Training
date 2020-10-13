select e_name, address_1, address_2, pincode , mobile, home, fax
from Employee e 
join Address a on e.address_id = a.address_id
join Phone p on e.e_id = p.e_id;

select e_name, address_1, address_2, pincode , mobile, home, fax
from Employee e 
join Address a on e.address_id = a.address_id
join Phone p on e.e_id = p.e_id
where e.e_name='Dhvani';

SELECT e.e_id, address_1, address_2
FROM Address a
join Employee e
on a.address_id = e.address_id;

SELECT e.e_id, e.e_name, address_1, address_2
FROM Address a
join Employee e
on a.address_id = e.address_id
join Phone p
where p.e_id = e.e_id;

select e_name, pincode 
from Employee e
join Address a
on  e.address_id = a.address_id;