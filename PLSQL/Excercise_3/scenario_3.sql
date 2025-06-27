create procedure TransferFunds(send_id in number,reciever_id in number,amount in number)
is
begin
    select Balance into sender_balance from Customers where CustomerID = send_id;
    if sender_balance < amount then
        DBMS_OUTPUT.PUT_LINE('Insufficient balance.');
        return;
    end if;
    update Customers set Balance=Balance+amount where CustomerID=reciever_id;
    update Customers set Balance=Balance-amount where CustomerID=send_id;
    update Accounts set Balance=Balance-amount where CustomerID=send_id;
    update Accounts set Balance=Balance+amount where CustomerID=reciever_id;
end TransferFunds;
/