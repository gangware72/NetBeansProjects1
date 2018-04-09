/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  edgargangwareiv
 * Created: Dec 18, 2017
 */

CREATE TABLE Employees (
    FirstName varchar(25),
    LastName varchar(25),
    UserName varchar(25),
    Password varchar(25),
    IsAdmin int
);

CREATE TABLE Customers (
    PurchaseDate varchar(100),
    InvoiceNumber varchar(100),
    CustomerServiceRep varchar(100),
    CompanyName varchar(100),
    ExecutiveContact varchar(100),
    EmailAddress varchar(100),
    GS1UserName varchar(100),
    GS1Password varchar(100),
    UPCCodesPurchased varchar(100),
    GS1ApplicationSubmissionDate varchar(100),
    DateBarcodesSentToCustomer varchar(100),
    DigitalorPrinted varchar(100),
    GS1WorksheetReturnDate varchar(100),
    AssignedPrefix varchar(100
    UPCsOfficiallyRegistered varchar(100),
    CustomerPhase varchar(100),

 );