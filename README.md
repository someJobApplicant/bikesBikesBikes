# Test exercise to implement a bike rental as fast and complete as possible

### A company rents bikes under following options:
    
    1. Rental by hour, charging $5 per hour
    2. Rental by day, charging $20 a day
    3. Rental by week, changing $60 a week
    4. Family Rental, is a promotion that can include from 3 to 5 Rentals (of any type) with a discount of 30% of the total price
    
### Assigment:
    1. Implement a set of classes to model this domain and logic
    2. Add automated tests to ensure a coverage over 85%
    3. Use GitHub to store and version your code
    4. Apply all the recommended practices you would use in a real project
    5. Add a README.md file to the root of your repository to explain: your design, the development practices you applied and how run the tests.
    
Note: we don't expect any kind of application, just a set of classes with its automated tests.
    
### Deliverables:
 *  The link to your repository

### Basic design
I chose to create entities for Bikes, Promotions, Rentals and Invoices
 * Rentals are bikes that will be rented for a time period.
 * A promotion is a predefined promotion that can be applied by number of rentals, or even by amount of money. 
 * An Invoice is a list of rentals and promotions, that returns a total cost of the rental when requested, considering each rental price, and the promotion applied to the entire invoice.
 * Bikes are, well, just bikes. With some extra info we might want to use in the future, like rental date, and if they are rented.
Every time someone requests a new rental, it only needs a new invoice, which specifies all the bikes, dates, and prices. The invoice also keeps track of the promotions to be applied.
We could have taken the promotions from a database, or another file, but it was out of scope. However, the design allows us to apply as many promotions as we want. We can apply discounts or surcharges too, and the values can be specified as a percentage, or as a total amount. 
The test cases test most of the implemented methods, and they share a common parent: BaseTest, which defines a setup method to instantiate some bikes, and also a method to return the allowed error to compare _double_ types. (we could also send this value as a system property, but again, it was out of scope of the exercise)     



### How to test this:
Run _gradle test_
The HTML report will be stored in build/reports/tests/test/