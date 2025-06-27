create procedure ProcessMonthlyInterest
is
begin
    update Accounts set Balance=Balance+(Balance*0.1) where AccountType='Savings';
end ProcessMonthlyInterest;
/