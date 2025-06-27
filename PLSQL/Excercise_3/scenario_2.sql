create procedure UpdateEmployeeBonus(sal_percent in number,dept in varchar)
is
begin
    update Employees set Salary=Salary+(Salary*5/100) where Department=dept;
end UpdateEmployeeBonus;
/