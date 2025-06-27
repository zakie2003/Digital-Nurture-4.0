begin
    for rec in (
        select *
        from Customers
        where FLOOR(MONTHS_BETWEEN(SYSDATE, DOB) / 12) > 60
    ) loop
        update Loans
        set LoanAmount = LoanAmount - (LoanAmount * 0.1)
        where CustomerID = rec.CustomerID;
    end loop;
end;
/
