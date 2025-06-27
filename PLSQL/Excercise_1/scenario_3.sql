begin
    for rec in ( select * from Loans where EndDate between sysdate and sysdate + 30 ) loop  
        DBMS_OUTPUT.PUT_LINE(rec.LoanID || ',' || rec.LoanAmount || ',' || rec.InterestRate || ',' || rec.StartDate || ',' || rec.EndDate);
    end loop;
end;
/
